package com.reporte_ms.domain.usecase;

import com.reporte_ms.domain.api.IBootcampReportServicePort;
import com.reporte_ms.domain.model.BootcampReport;
import com.reporte_ms.domain.spi.IBootcampReportPersistencePort;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@RequiredArgsConstructor
public class BootcampReportUseCase implements IBootcampReportServicePort {

    private final IBootcampReportPersistencePort  bootcampReportPersistencePort;

    @Override
    public Mono<Void> saveBootcampReport(BootcampReport bootcampReport) {
        bootcampReport.setTimesTamp(LocalDateTime.now());
        return bootcampReportPersistencePort.saveBootcampReport(bootcampReport);
    }
}
