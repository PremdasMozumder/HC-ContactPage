Feature: contact Test

  @test
  Scenario: Validate Contact page submit button is working with valid credentials
    Given I am at Health Course Contact Page
    And user accepts all cookies
    Then user enters valid Name
    And user enters valid company name
    And user enters valid email address
    And user enters valid phone number
    And user enters a brief message
    When user click on submit button
    Then user should be able to successfully send their information

 
 #Scenario: Validate Contact page submit button is working with blank credentials
    #Given I am at Health Course Contact Page
    #And user leaves all the element box empty
    #When user click on submit button
    #Then user should be able to successfully send their information
#
#
  #Scenario: Validate Contact page submit button is working with invalid email address and phone number.
    #Given I am at Health Course Contact Page
    #And user enters valid name
    #And user enters valid company name
    #And user enters invalid email address
    #And user enters invalid phone number
    #When user click on submit button
    #Then user should be able to successfully send their information
