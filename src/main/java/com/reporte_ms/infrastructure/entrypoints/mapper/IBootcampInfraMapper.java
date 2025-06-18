package com.reporte_ms.infrastructure.entrypoints.mapper;

import com.reporte_ms.domain.model.BootcampReport;
import com.reporte_ms.infrastructure.entrypoints.dto.BootcampReportRequestDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IBootcampInfraMapper {

    BootcampReport toBootcampReport(BootcampReportRequestDTO bootcampReportRequestDTO);

}
