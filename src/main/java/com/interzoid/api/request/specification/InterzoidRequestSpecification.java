package com.interzoid.api.request.specification;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.LogConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import com.interzoid.api.utils.Urls;

import static io.restassured.http.ContentType.JSON;

public class InterzoidRequestSpecification {

    public RequestSpecification getRequestSpecification() {
        return new RequestSpecBuilder()
                .setConfig(
                        new RestAssuredConfig()
                                .sslConfig(
                                        new SSLConfig().relaxedHTTPSValidation()
                                )
                                .logConfig(LogConfig
                                        .logConfig()
                                        .enablePrettyPrinting(true)
                                        .enableLoggingOfRequestAndResponseIfValidationFails(LogDetail.ALL)
                                )
                )
                .setContentType(JSON)
                .setBaseUri(Urls.get("baseUriInterzoid"))
                .setBasePath(Urls.get("basePathGetWeather"))
                .setRelaxedHTTPSValidation()
                .setContentType(JSON)
                .log(LogDetail.ALL)
                .build();
    }

}