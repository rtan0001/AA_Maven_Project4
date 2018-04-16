Feature: CRM Email To Case An Enquiry And Link/unlink ACP to prevent Error Validations
  This feature deals with the Email to Case Link/Unlink ACP to an enquiry to prevent Error Validations


  @GMAIL_Login_Test
  Scenario: User Send an outBound email to Admissions team using their personal account
    Given I navigate to the gmail Login Page
    And I given gmail Account username and password hit login
    Then I Send an outbond Email with attachments to the admissions team


  @CRM_Email_To_Case_to_Link_TheEnquiry_To_ACP_INCRM
  Scenario Outline: Search with given keywords into the search field
    Given I navigate to the Salesforce URL login page
    When I enter <username> and <password>
    And I click on login button
    Then I should see the Salesforce home page
    Given I Enter receipt number <Number> into search field and hit Enter key
    Then Click on Application Reference Number link
    And Click on Details link
    And I get the ACP code from the application
    And check the enquiry is created in CRM under MUDocs Enquiry queue Flow
    And open the enquiry and link ACP to the enquiry
    And Click Save to save the page layout
    And Unlink ACP from the same enquiry hit save button
    Then System should show us validation and validate them


    Examples:

       |   username                          |     password        |    Number     |
       |   rupa.tanneero@monash.edu.staging  |    monash@2017      |   A-266309    |



  @Close_All_The_Tabs_in_CRM
  Scenario: Close All the Tabs with in CRM
    Given I Navigate to Close All the Tabs
    Then I logout from the application





