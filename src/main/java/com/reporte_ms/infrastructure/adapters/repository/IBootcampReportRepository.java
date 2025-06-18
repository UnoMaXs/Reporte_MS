package com.reporte_ms.infrastructure.adapters.repository;

import com.reporte_ms.infrastructure.adapters.entity.BootcampReportEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface IBootcampReportRepository extends ReactiveCrudRepository<BootcampReportEntity, Long> {
}
