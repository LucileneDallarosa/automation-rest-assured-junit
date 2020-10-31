# Automation Code Challenge RestAssured
This project aimed to automate the site https://www.interzoid.com/services/getweathercity
 

## Steps
* Access www.interzoid.com and create a free account (do not spend any money, use a 10minutemail.com e-mail account id if you need more than 25 tries).
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
- ENVIRONMENT - Environment in which the tests will be performed (develop or homolog)
- LICENSE - License number provided by the website
 
## Tools
* Maven
* Java

## Frameworks used
* RestAssured 
* log4j 
* junit5 

## Future
* If the project grows, put a suite structure
* If the company uses Jira, put tm4j-automation
* If the flow becomes more complex, use the BDD format