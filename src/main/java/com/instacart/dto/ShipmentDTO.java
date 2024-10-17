package com.instacart.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShipmentDTO {
    private String trackNo;
    private String origin;
    private String destination;
    private String status;
}
