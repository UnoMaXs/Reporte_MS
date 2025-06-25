package com.reporte_ms.infrastructure.adapters.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "reportesdb")
public class BootcampReportEntity {

    @Id
    private String id;
    private Long idBootcamp;
    private String name;
    private String description;
    private int quantityCapacities;
    private int quantityTechnologies;
    private int quantityPersons;
    private LocalDateTime timesTamp;

}
