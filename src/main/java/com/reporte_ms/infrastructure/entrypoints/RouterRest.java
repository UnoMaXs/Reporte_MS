package com.reporte_ms.infrastructure.entrypoints;

import com.reporte_ms.infrastructure.entrypoints.handler.BootcampReportHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterRest {

    @Bean
    public RouterFunction<ServerResponse> bootcampReportRoutes(BootcampReportHandler bootcampReportHandler) {
        return route(POST("/report/bootcamp"), bootcampReportHandler::saveBootcampReport)
                .andRoute(GET("/report/bootcamp/popular"), bootcampReportHandler::getMostPopularBootcamp);

    }
}
