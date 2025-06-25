package com.reporte_ms.infrastructure.adapters.repository;

import com.reporte_ms.infrastructure.adapters.entity.BootcampReportEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface IBootcampReportRepository extends ReactiveCrudRepository<BootcampReportEntity, Long> {

    Mono<BootcampReportEntity> findFirstByOrderByQuantityPersonsDesc();

}
