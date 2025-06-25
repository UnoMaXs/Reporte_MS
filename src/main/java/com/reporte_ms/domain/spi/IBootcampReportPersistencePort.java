package com.reporte_ms.domain.spi;

import com.reporte_ms.domain.model.BootcampReport;
import reactor.core.publisher.Mono;

public interface IBootcampReportPersistencePort {

    Mono<Void> saveBootcampReport(BootcampReport bootcampReport);
    Mono<BootcampReport> findBootcampWithMostPersons(String token);

}
