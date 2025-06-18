package com.reporte_ms.domain.api;

import com.reporte_ms.domain.model.BootcampReport;
import reactor.core.publisher.Mono;

public interface IBootcampReportServicePort {

    Mono<Void> saveBootcampReport(BootcampReport bootcampReport);
}
