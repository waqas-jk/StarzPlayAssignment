# StarzPlayAssignment

# Assumptions
   1. If values of level parameter is not `censored` or `uncensored`, then document do not provide any hint about the expected behaviour. For this scenario it is assumed that functionality will be same as in case of `null/empty` value.
   
# Enviroment Requirememnt
  Following must be installed on system
  1. JDK 8 - `JAVA_HOME` should be set to the JDK8 installaion directory
  2. Maven 3.x - `M2_HOME` should be set to Maven installation direrctory.
  3. To execute command commandline or terminal can be used.
  
# Build 
  To build the project execute `mvn clean install` command in project's home directory.
 
# Deploy/Start 

After successful build, application can be started using command `mvn spring-boot:run` from project's home directory.

# Execute Unit Tests 
  - Test can be compiled from commandline/terminal using command `mvn test-compile`.
  - Tests can be executed using command `mvn test`
  
# Client To test REST services
 Following clients can be used to test the REST webservice in application.
  - PostMan extension for Chrome (https://chrome.google.com/webstore/detail/postman/fhbjgbiflinjbdggehcddcbncdddomop?hl=en)
  - SOAPUI (https://www.soapui.org)
  
  
