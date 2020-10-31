package com.interzoid.api.request.testcases.contract;

import com.interzoid.api.BaseTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static com.interzoid.api.utils.Contract.getContract;

class ValidateContractGetWeatherTest extends BaseTest {

    @Test
    void validateContractGetWeather() {

        given().
            spec(spec).
                queryParam("city", "Round Rock").
                queryParam("state", "TX").
                queryParam("license", license).
        when().
            get().
        then().
            assertThat().
                body(matchesJsonSchema(getContract("get_weather_city_schema")));
    }

}
