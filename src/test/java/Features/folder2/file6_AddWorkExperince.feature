Feature: Applicant WorkExperience Feature
  Students can add work experience details to their application
@AddWorkExperience
  Scenario Outline: Applicant Add work experience to their application

#    Given I navigate to the AA portal login page
#    And I entered <username> and <password>
#    And I click login button
#    And I click Create New Application button
    And I click Add work experience button
    And I set the position <position>
    And I set the employer <employer>
    And I Set Start Date
    And I Set End Date
    And I Click on Save button From Work Experience
#    Then Logout <Logout> of the Application


    Examples:
      |   username                          |   password    |  position      |  employer            |   Logout    |
      |   rupa12.tanneeru12@mailinator.com    |   monash@2017 |  Test Manager  |  Monash University   |   Logout    |