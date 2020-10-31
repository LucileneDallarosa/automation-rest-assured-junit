package com.interzoid.api.request.testcases.acceptable;

import com.interzoid.api.BaseDataArguments;
import com.interzoid.api.BaseTest;
import com.interzoid.api.request.specification.dto.HttpCustomResponseEnum;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.describedAs;
import static org.hamcrest.CoreMatchers.is;

public class ValidateAcceptableWeatherCityTest extends BaseTest {

    @ParameterizedTest
    @ArgumentsSource(BaseDataArguments.class)
    void validateAcceptableWeatherCityFromCsvList(String city, String State, HttpCustomResponseEnum status) {

        given().
            spec(spec).
                queryParam("city",  city).
                queryParam("state",  State).
                queryParam("license",  license).
        when().
            get().
        then().
            assertThat().
                statusCode(describedAs(status.getDescription(), is(status.getCode()))).
                statusLine(status.getStatusLine());
    }




}
