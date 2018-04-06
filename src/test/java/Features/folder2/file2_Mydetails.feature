Feature: Personal Details Feature
  This page deals with students can provide their personal information

  @MyDetails_Test
  Scenario Outline: Applicant enter their personal information on mydetails page
  Given I navigate to mailinator window to get email
    And I entered username and password
    And I click login button
    And I navigate to the details <MyDetails> page
    And I Select title from page <Title>
    And I Select gender <Gender>
    And I Set dateofbirth <DateOfBirth>
    And I Set mobilenumber <MobileNumber>
    And I Set homephone <HomePhone>
    And I Set workphone <WorkPhone>
    And I Set currentpostal <currentPostal>
    And I Set streetnumber <StreetNumber>
    And I Set suburb <Suburb>
    And I Set state <State>
    And I Set postalcode <PostalCode>
    And I Set location <Location>
    And I Set citizenship <CitizenShipType>
    And I Set aborigional <AboriginalIslander>
    When I Click on Save button to save the details
#    Then Logout <Logout> of the Application
#    And Close the browser


        Examples:
        | username                          |   password      |  MyDetails   | Title |  Gender   | DateOfBirth |   MobileNumber  |   HomePhone  | WorkPhone   | currentPostal |   StreetNumber      |   Suburb  |   State     |   PostalCode  |  Location                                                 |   CitizenShipType                                |  AboriginalIslander  |  Logout  |
        | rupa12.tanneeru12@mailinator.com    |   monash@2017   |  MY DETAILS  |  Mrs  |  Female   |  12/01/1985 |   04375847568   |   0357845985 | 04765847896 |  Yes          |   738 Blackburn Rd  |   Clayton |   Victoria  |   3000        |   Australian campus and any location not listed below     |   I hold an Australian permanent resident visa   |   Yes                |  Logout  |