Feature: Applicant Login Feature
  This feature deals with the login functionality of the application

  @Login_Test
  Scenario Outline: Login with correct username and password using scenario outline
    Given I navigate to the AA portal login page
    And I entered username and password
    And I click login button
    Then I should see the home page
    Then Logout <Logout> of the Application
    And Close the browser

    Examples:

      |   username                         |  password       | Logout  |
      |   rupa12.tanneeru12@mailinator.com |  monash@2017    | Logout  |