Feature: CRM Case To Email to check Send Email function works well in CRM and check enquiry status changed from Closed to Open
  This feature deals with Case To Email

  @Send_An_Email_From_CRM_TO_Applicant_Email_Account
  Scenario Outline: Search with given keywords into the search field
    Given I navigate to the Salesforce URL login page
    And I enter <username> and <password>
    And I click on login button
    Then I should see the Salesforce home page
    Given I Enter receipt number <Number> into search field and hit Enter key
    Then Click on Application Reference Number link
    And Click on Details link
    And I go to Course Preference Grid click on ACPCode Link
    And I Click on Send Email to communicate with Applicant
    And Applicant should receive an email to confirm an enquiry gets created in CRM
    Then check the status of the enquiry
    Then Close the Enquiry Tab
    Then I logout from the application

    Examples:

      |   username                          |     password        |    Number     |
      |   rupa.tanneero@monash.edu.staging  |    monash@2017      |   A-266309    |


 @Reply_ToEmailEnquiry_From_Applicant_Account
 Scenario:Applicant Reply back to an email enquiry from their email account
   Given I Reply back to an email enquiry from Gmail Account
   And I logout of gmail account


  @CRM_TheEnquiry_Gets_Updated_With_The_Latest_Changes_StatusUpdates
   Scenario:Assessors Or Admissions team will check the enquiries which are in open in MU docs queue after the student respond to the reply email
       Given Assessors logon into Salesforce CRM and Navigate to Enquiries
       When Assessor Select first enquiry From Enquiries list
       And Assessor check the status of the Enquiry should be in Open


