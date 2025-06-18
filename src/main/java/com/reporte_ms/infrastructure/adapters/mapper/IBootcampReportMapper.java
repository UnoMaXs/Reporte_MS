package com.reporte_ms.infrastructure.adapters.mapper;

import com.reporte_ms.domain.model.BootcampReport;
import com.reporte_ms.infrastructure.adapters.entity.BootcampReportEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IBootcampReportMapper {

    BootcampReport toBootcampReport(BootcampReportEntity bootcampReportEntity);
    BootcampReportEntity toBootcampReportEntity(BootcampReport bootcampReport);
}
