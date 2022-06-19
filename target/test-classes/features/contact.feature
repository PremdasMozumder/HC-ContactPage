Feature: test contact page

  Background: contect page
    Given I am at healthcourse contact page
@Test
  Scenario: Validate Contact page submit button is working with valid credentials
    And user enters valid Name
    And user enters valid company name
    And user enters valid email address
    And user enters valid phone number
    And user enters a brief message
    When user click on submit button
    Then user should be able to successfully send their information
    
  Scenario: Validate Contact page submit button is working with blank credentials
    And user leaves all the element box empty
    When user click on submit button
    Then user should be able to successfully send their information

  Scenario Outline: Validate Contact page submit button is working with invalid email address and phone number.
    And user enters valid name
    And user enters valid company name
    And user enters invalid <email> address
    And user enters invalid <phone> number
    When user click on submit button
    Then user should be able to successfully send their information

    Examples: 
      | email  | phone |
      | f234ds4535 |     dfgsd6fsdf5 |
      | y@$hjgjhasgj |     dwqed65734 |
