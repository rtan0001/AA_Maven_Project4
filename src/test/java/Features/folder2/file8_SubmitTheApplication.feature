Feature: Application Submission Feature
  This feature deals with the Submit functionality of the application

  @SubmitApplication
  Scenario Outline: Applicant submit their application Successfully
#    Given I navigate to the AA portal login page
#    And I entered <username> and <password>
#    And I click login button
#    And I click Create New Application button
    And I Click on Continue button <button1>
    And I click on Continue button <button2>  on review page
    And I Click on Accept and Submit button after review
    And I capture receipt number ApplicationID after application submission
    Then Logout <Logout> of the Application
    And Close the browser



    Examples:

      |   username                         |  password       |    button1    |   button2     |
      |   rupa12.tanneeru12@mailinator.com |  monash@2017    |    Continue   |   Continue    |