package com.reporte_ms.infrastructure.entrypoints.dto;

import lombok.Data;

@Data
public class BootcampReportRequestDTO {

    private Long idBootcamp;
    private String name;
    private String description;
    private int quantityCapacities;
    private int quantityTechnologies;
    private int quantityPersons;

}
