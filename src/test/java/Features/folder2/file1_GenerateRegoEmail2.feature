Feature: Applicant Registration Feature
  This feature deals with the Registration functionality of the application


  Scenario Outline: Login with correct username and password using scenario outline
    Given I navigate to the public website
    And I Set a new email
    And I click Go button
    Then I should see public site inbox
    And Close the browser
    Given I navigate to the AA Registration login page
    And I click on Register as a New Applicant link from Registration Page
    Then I Enter <GivenName> and <FamilyName> and Email
    Then I Click on SignUp button
    And Close the browser
    Given I navigate to the public website
    And I set an email into inbox
    And I click Go button
    And I click on welcome message
    Then I click on Complete Registration button from Email
    Then T Set password and Change Password
    Then Logout <Logout> of the Application
#    And Close the browser



  Examples:

  |   GivenName  |  FamilyName     |   Logout |
  |   rupa       |  tanneeru       |   Logout |