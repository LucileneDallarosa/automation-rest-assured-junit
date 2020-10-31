# Automation Code Challenge RestAssured
This project aimed to automate the API result https://www.interzoid.com/services/getweathercity
 

## Steps
* Access www.interzoid.com and create a free account;
* API that should be tested is available https://www.interzoid.com/services/getweathercity
* Fill the request with these required fields with this information

    
    ____________________________________________
    | City	        |State  |Expected Behavior |
    ____________________________________________
    | Round Rock	|TX     |200               |
    | Tampa	        |TX     |404               |
    | --	        |--     |400               | 
    ____________________________________________

* Your test must validate: HTTP Status Code e HTTP Status Description

## Run
    mvn clean test -Penv = "ENVIRONMENT" -PbaseLicense = "LICENSE"
- ENVIRONMENT - Environment where tests will be performed (develop or homologate)
- LICENSE - License number provided by the website
 
## Tools
* Maven
* Java

## Frameworks used
* RestAssured to access the service and check if the result is as expected;
* Log4j to add logs at the critical and necessary points of automation;
* Junit5 for the test execution;

## Future
* If the project grows, put a suite structure
* If the company uses Jira, put tm4j-automation
* If the flow becomes more complex, use the BDD format