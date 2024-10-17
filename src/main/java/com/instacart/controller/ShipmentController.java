package com.instacart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.instacart.dto.ShipmentDTO;
import com.instacart.entity.Shipment;
import com.instacart.service.ShipmentService;

import java.util.List;

@RestController
@RequestMapping("shipment")
public class ShipmentController {

    @Autowired
    private ShipmentService service;

    // Get shipment by tracking number
    @GetMapping("/{trackNo}")
    public ResponseEntity<?> getShipment(@PathVariable String trackNo) {
        Shipment item = service.getShipment(trackNo);
        if (item != null) {
            return new ResponseEntity<>(item, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Item is not present", HttpStatus.NOT_FOUND);
        }
    }

    // Get all shipments
    @GetMapping("/all")
    public ResponseEntity<?> getAllShipments() {
        List<Shipment> shipments = service.getAllShipments();
        if (!shipments.isEmpty()) {
            return new ResponseEntity<>(shipments, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("No shipments found", HttpStatus.NO_CONTENT);
        }
    }

    // Update shipment details
    @PutMapping("/{trackNo}")
    public ResponseEntity<?> updateShipment(@PathVariable String trackNo, @RequestBody ShipmentDTO updatedShipment) {
        boolean isUpdated = service.updateShipment(trackNo, updatedShipment);
        if (isUpdated) {
            return new ResponseEntity<>("Shipment updated successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Shipment not found", HttpStatus.NOT_FOUND);
        }
    }

    // Delete shipment
    @DeleteMapping("/{trackNo}")
    public ResponseEntity<?> deleteShipment(@PathVariable String trackNo) {
        boolean isDeleted = service.deleteShipment(trackNo);
        if (isDeleted) {
            return new ResponseEntity<>("Shipment deleted successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Shipment not found", HttpStatus.NOT_FOUND);
        }
    }
}
