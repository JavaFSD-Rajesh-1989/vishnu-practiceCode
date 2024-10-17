package com.instacart;

import com.instacart.entity.Shipment;
import com.instacart.repo.ShipmentRepo;
import com.instacart.service.ShipmentService;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

@SpringBootTest
public class ShipmentServiceTest {

    @Mock
    private ShipmentRepo repo;

    @InjectMocks
    private ShipmentService service;

    @Test
    public void testGetShipment() {
        // Arrange
        String trackNo = "TYUI876FGH";
        Shipment mockShipment = new Shipment();  
        when(repo.getShipment(trackNo)).thenReturn(mockShipment); 

        // Act
        Shipment shipment = service.getShipment(trackNo);
        //assertion
        
        assertThat(shipment).isNotNull();
    
    }
}
