package com.reporte_ms.infrastructure.entrypoints.handler;

import com.reporte_ms.domain.api.IBootcampReportServicePort;
import com.reporte_ms.domain.model.BootcampReport;
import com.reporte_ms.infrastructure.entrypoints.dto.BootcampReportRequestDTO;
import com.reporte_ms.infrastructure.entrypoints.mapper.IBootcampInfraMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class BootcampReportHandler {

    private final IBootcampReportServicePort bootcampReportServicePort;
    private final IBootcampInfraMapper bootcampInfraMapper;

    public Mono<ServerResponse> saveBootcampReport(ServerRequest request) {
        return request.bodyToMono(BootcampReportRequestDTO.class)
                .flatMap(dto -> {
                    BootcampReport bootcampReport = bootcampInfraMapper.toBootcampReport(dto);
                    return bootcampReportServicePort.saveBootcampReport(bootcampReport);
                })
                .flatMap(savedReport ->
                        ServerResponse.ok()
                                .bodyValue(savedReport)
                );
    }

}
