
 Feature: login functionality
 @smokeTest
  Scenario:login successful valid credentials
    Given user is login page
  
    When user enter username and password 
    And  click on login page 
    Then  user navigated to the homepage
   
    

 