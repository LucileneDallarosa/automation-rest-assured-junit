package com.interzoid.api;

import com.interzoid.api.request.specification.InterzoidRequestSpecification;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import com.interzoid.api.utils.License;

import static io.restassured.RestAssured.enableLoggingOfRequestAndResponseIfValidationFails;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    protected RequestSpecification spec;
    protected String license;

    @BeforeAll
    void initialize() {
        enableLoggingOfRequestAndResponseIfValidationFails();

        spec = new InterzoidRequestSpecification().getRequestSpecification();
        license = License.getLicense();
    }

}
