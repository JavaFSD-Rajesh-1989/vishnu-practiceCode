package com.instacart.repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.instacart.dto.ShipmentDTO;
import com.instacart.entity.Shipment;

import jakarta.transaction.Transactional;

import java.util.List;

@Repository
public class ShipmentRepo {

    @Autowired
    private SessionFactory sf;

    // Get shipment by tracking number
    public Shipment getShipment(String trackNo) {
        Session session = sf.openSession();
        String hql = "from Shipment where trackNo = :trackNo";
        Query<Shipment> qry = session.createQuery(hql, Shipment.class);
        qry.setParameter("trackNo", trackNo);
        Shipment shipment = qry.uniqueResult();
        session.close();
        return shipment;
    }

    // Get all shipments
    public List<Shipment> getAllShipments() {
        Session session = sf.openSession();
        String hql = "from Shipment";
        Query<Shipment> qry = session.createQuery(hql, Shipment.class);
        List<Shipment> shipments = qry.list();
        session.close();
        return shipments;
    }

    @Transactional
    public boolean updateShipment(String trackNo, ShipmentDTO updatedShipmentDTO) {
        Session session = sf.getCurrentSession();
        
        String hql = "UPDATE Shipment s SET s.origin = :origin, s.destination = :destination, s.status = :status WHERE s.trackNo = :trackNo";
        Query qry = session.createQuery(hql);
        
        qry.setParameter("origin", updatedShipmentDTO.getOrigin());
        qry.setParameter("destination", updatedShipmentDTO.getDestination());
        qry.setParameter("status", updatedShipmentDTO.getStatus());
        qry.setParameter("trackNo", trackNo);

        int result = qry.executeUpdate();
        
        return result > 0; // Returns true if one or more rows were updated
    }

    @Transactional
    public boolean deleteShipment(String trackNo) {
        Session session = sf.getCurrentSession();
        String hql = "DELETE FROM Shipment WHERE trackNo = :trackNo";
        Query<?> qry = session.createQuery(hql);
        qry.setParameter("trackNo", trackNo);

        int result = qry.executeUpdate();

        return result > 0; // Returns true if one or more rows were deleted
    }

}
