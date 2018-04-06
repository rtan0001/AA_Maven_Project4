Feature: Applicant MyQualification Feature
  Students can add qualification details to their application
@Add_Qual
  Scenario Outline: Applicant Add qualification to their application

#    Given I navigate to the AA portal login page
#    And I entered <username> and <password>
#    And I click login button
#    And I click Create New Application button
    And I click Add New Qualification button
    And I select QualificationType from qualification <QualType>
    And I Select Country <Country> where i studied
    And I select Firstyear Enrolled <FirstYear>
    And I select Lastyear Enrolled <LastYear>
    And I select Qualification <Qualification>
    And I select Institution <Institution>
    And I select Level of Completion <Completion>
    And I select a file to upload filename
    And I select Document Type <Type>
    And I set Comments into <comments> box
    Then I click save to save the Qualification
    Then I verify the Qualification from application Grid
#    Then Logout <Logout> of the Application


    Examples:
      |   username                          |   password    |  QualType                            |    Country       |   FirstYear   |   LastYear     |  Qualification   |   Institution   |  Completion                           |     Type                        |   comments                   |    Logout    |
      |   rupa12.tanneeru12@mailinator.com   |   monash@2017 |  Tertiary Education/Post Secondary   |    Australia     |    2006       |   2012         |  Masters in IT   |  SWINBURNE TAFE |  SUCCESSFULLY COMPLETED AND OBTAINED  |  Results from tertiary studies  |   Enter Comments in TextArea |    Logout    |