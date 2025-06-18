package com.reporte_ms.infrastructure.adapters.persistence;

import com.reporte_ms.domain.model.BootcampReport;
import com.reporte_ms.domain.spi.IBootcampReportPersistencePort;
import com.reporte_ms.infrastructure.adapters.mapper.IBootcampReportMapper;
import com.reporte_ms.infrastructure.adapters.repository.IBootcampReportRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class BootcampReportAdapter implements IBootcampReportPersistencePort {

    private final IBootcampReportRepository bootcampReportRepository;
    private final IBootcampReportMapper bootcampReportMapper;

    @Override
    public Mono<Void> saveBootcampReport(BootcampReport bootcampReport) {
        return bootcampReportRepository.save(bootcampReportMapper.toBootcampReportEntity(bootcampReport)).then();
    }

}
