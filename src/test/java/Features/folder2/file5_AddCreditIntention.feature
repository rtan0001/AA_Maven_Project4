Feature: Credit Intention Feature
  This feature deals with the Credit functionality of the application
@Add_Credit
  Scenario Outline: Applicant Add credit intention to their Application
#    Given I navigate to the AA portal login page
#    And I entered <username> and <password>
#    And I click login button
#    And I click Create New Application button
    And I select credit intention <intention>
#    Then Logout <Logout> of the Application
#    And Close the browser

    Examples:

      |   username                         |  password       |  intention     |    Logout    |
      |   rupa12.tanneeru12@mailinator.com   |  monash@2017    |   Yes          |    Logout    |