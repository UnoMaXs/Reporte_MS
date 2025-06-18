package com.reporte_ms.application;

import com.reporte_ms.domain.api.IBootcampReportServicePort;
import com.reporte_ms.domain.spi.IBootcampReportPersistencePort;
import com.reporte_ms.domain.usecase.BootcampReportUseCase;
import com.reporte_ms.infrastructure.adapters.mapper.IBootcampReportMapper;
import com.reporte_ms.infrastructure.adapters.persistence.BootcampReportAdapter;
import com.reporte_ms.infrastructure.adapters.repository.IBootcampReportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class UseCasesConfig {

    private final IBootcampReportRepository bootcampReportRepository;
    private final IBootcampReportMapper bootcampReportMapper;

    @Bean
    public IBootcampReportPersistencePort bootcampReportPersistencePort() {
        return new BootcampReportAdapter(bootcampReportRepository, bootcampReportMapper);
    }

    @Bean
    public IBootcampReportServicePort bootcampReportServicePort(IBootcampReportPersistencePort bootcampReportPersistencePort) {
        return new BootcampReportUseCase(bootcampReportPersistencePort);
    }

}
