package com.instacart.service;

import com.instacart.dto.ShipmentDTO;
import com.instacart.entity.Shipment;
import com.instacart.repo.ShipmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipmentService {

    @Autowired
    private ShipmentRepo repo;

    public Shipment getShipment(String trackNo) {
        return repo.getShipment(trackNo);
    }

    public List<Shipment> getAllShipments() {
        return repo.getAllShipments();
    }

    public boolean updateShipment(String trackNo, ShipmentDTO updatedShipment) {
        return repo.updateShipment(trackNo, updatedShipment);
    }

    public boolean deleteShipment(String trackNo) {
        return repo.deleteShipment(trackNo);
    }
}
