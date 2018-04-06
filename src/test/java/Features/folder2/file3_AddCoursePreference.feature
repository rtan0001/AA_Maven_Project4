Feature: Applicant Course Preference Feature
  Students can select and add courses to their application

  @CoursePreference_Test
  Scenario Outline: Applicant Add courses to their application

#    Given I navigate to the AA portal login page
#    And I entered <username> and <password>
#    And I click login button
#    And I navigate to the home <home> page
    And I click Create New Application button
    And I Enter Course Preference code <Code> into Search Field
    When I click Search button
#    Then I select attendance Type <Attendance>
#    Then I select location <Location>
#    Then I select commencementPeriod <Period>
#    Then I click on apply filters
    Then I select list of courses and Add them to the application
    Then I click AddCourse
    Then I click CloseSearch
    Then I should see the list of courses added <CoursePre> to the application
#    Then Logout <Logout> of the Application

      Examples:
        |   username                          |   password    |   home    |   Code    |   Attendance    |   Location    |   Period                 |  CoursePre   |   Logout    |
        |   rupa12.tanneeru12@mailinator.com  |   monash@2017 |   HOME    |   master  |   Full Time     |    CITY       |   2021 Summer Semester   |     1        |   Logout    |