Feature: CRM Case To Email
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

    Examples:

      |   username                          |     password        |    Number     |
      |   rupa.tanneero@monash.edu.staging  |    monash@2017      |   A-266309    |

#
# @Reply_ToEmailEnquiry_From_Applicant_Account
# Scenario:Applicant Reply back to an email enquiry from their email account
#   Given I Reply back to an email enquiry from Gmail Account
