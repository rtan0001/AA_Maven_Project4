$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file9_CRM_Email_To_Case.feature");
formatter.feature({
  "line": 1,
  "name": "CRM Email To Case An Enquiry And Link/unlink ACP to prevent Error Validations",
  "description": "This feature deals with the Email to Case Link/Unlink ACP to an enquiry to prevent Error Validations",
  "id": "crm-email-to-case-an-enquiry-and-link/unlink-acp-to-prevent-error-validations",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "User Send an outBound email to Admissions team using their personal account",
  "description": "",
  "id": "crm-email-to-case-an-enquiry-and-link/unlink-acp-to-prevent-error-validations;user-send-an-outbound-email-to-admissions-team-using-their-personal-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@GMAIL_Login_Test"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I navigate to the gmail Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I given gmail Account username and password hit login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I Send an outbond Email with attachments to the admissions team",
  "keyword": "Then "
});
formatter.match({
  "location": "SendEmail_FromGmailAccountStep.iNavigateToTheGmailLoginPage()"
});
formatter.result({
  "duration": 30827338544,
  "status": "passed"
});
formatter.match({
  "location": "SendEmail_FromGmailAccountStep.iGivenGmailAccountUsernameAndPasswordHitLogin()"
});
formatter.result({
  "duration": 14481787475,
  "status": "passed"
});
formatter.match({
  "location": "SendEmail_FromGmailAccountStep.iSendAnOutbondEmailWithAttachmentsToTheAdmissionsTeam()"
});
formatter.result({
  "duration": 42472829732,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "Search with given keywords into the search field",
  "description": "",
  "id": "crm-email-to-case-an-enquiry-and-link/unlink-acp-to-prevent-error-validations;search-with-given-keywords-into-the-search-field",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@CRM_Email_To_Case_to_Link_TheEnquiry_To_ACP_INCRM"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I navigate to the Salesforce URL login page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I enter \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I should see the Salesfroce home page",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I Enter receipt number \u003cNumber\u003e into search field and hit Enter key",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Click on Application Reference Number link",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Click on Details link",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I get the ACP code from the application",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "check the enquiry is created in CRM under MUDocs Enquiry queue Flow",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "open the enquiry and link ACP to the enquiry",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Click Save to save the page layout",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Unlink ACP from the same enquiry hit save button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "System should show us validation and validate them",
  "keyword": "Then "
});
formatter.examples({
  "line": 29,
  "name": "",
  "description": "",
  "id": "crm-email-to-case-an-enquiry-and-link/unlink-acp-to-prevent-error-validations;search-with-given-keywords-into-the-search-field;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "Number"
      ],
      "line": 31,
      "id": "crm-email-to-case-an-enquiry-and-link/unlink-acp-to-prevent-error-validations;search-with-given-keywords-into-the-search-field;;1"
    },
    {
      "cells": [
        "rupa.tanneero@monash.edu.staging",
        "monash@2017",
        "A-266309"
      ],
      "line": 32,
      "id": "crm-email-to-case-an-enquiry-and-link/unlink-acp-to-prevent-error-validations;search-with-given-keywords-into-the-search-field;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 32,
  "name": "Search with given keywords into the search field",
  "description": "",
  "id": "crm-email-to-case-an-enquiry-and-link/unlink-acp-to-prevent-error-validations;search-with-given-keywords-into-the-search-field;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@CRM_Email_To_Case_to_Link_TheEnquiry_To_ACP_INCRM"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I navigate to the Salesforce URL login page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I enter rupa.tanneero@monash.edu.staging and monash@2017",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I should see the Salesfroce home page",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I Enter receipt number A-266309 into search field and hit Enter key",
  "matchedColumns": [
    2
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Click on Application Reference Number link",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Click on Details link",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I get the ACP code from the application",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "check the enquiry is created in CRM under MUDocs Enquiry queue Flow",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "open the enquiry and link ACP to the enquiry",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Click Save to save the page layout",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Unlink ACP from the same enquiry hit save button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "System should show us validation and validate them",
  "keyword": "Then "
});
formatter.match({
  "location": "CRM_Loginstepdefinition_Step.iNavigateToTheSalesforceURLLoginPage()"
});
formatter.result({
  "duration": 11192676148,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rupa.tanneero@monash.edu.staging",
      "offset": 8
    },
    {
      "val": "monash@2017",
      "offset": 45
    }
  ],
  "location": "CRM_Loginstepdefinition_Step.iEnterUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 327120452,
  "status": "passed"
});
formatter.match({
  "location": "CRM_Loginstepdefinition_Step.iClickOnLoginButton()"
});
formatter.result({
  "duration": 6540234054,
  "status": "passed"
});
formatter.match({
  "location": "CRM_Loginstepdefinition_Step.iShouldSeeTheSalesfroceHomePage()"
});
formatter.result({
  "duration": 11866543325,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "A-266309",
      "offset": 23
    }
  ],
  "location": "CRM_Loginstepdefinition_Step.iEnterReceiptNumberNumberIntoSearchFieldAndHitEnterKey(String)"
});
formatter.result({
  "duration": 330457155,
  "status": "passed"
});
formatter.match({
  "location": "CRM_Loginstepdefinition_Step.clickOnApplicationReferenceNumberLink()"
});
formatter.result({
  "duration": 7299816171,
  "status": "passed"
});
formatter.match({
  "location": "CRM_Loginstepdefinition_Step.clickOnDetailsLink()"
});
formatter.result({
  "duration": 5410236451,
  "status": "passed"
});
formatter.match({
  "location": "CRM_Loginstepdefinition_Step.iGetTheACPCodeFromTheApplication()"
});
formatter.result({
  "duration": 150114138,
  "status": "passed"
});
formatter.match({
  "location": "CRM_Loginstepdefinition_Step.check_the_enquiry_is_created_in_CRM_under_MUDocs_Enquiry_queue_Flow()"
});
formatter.result({
  "duration": 10720916940,
  "status": "passed"
});
formatter.match({
  "location": "CRM_Loginstepdefinition_Step.open_the_enquiry_and_link_ACP_to_the_enquiry()"
});
formatter.result({
  "duration": 5990424890,
  "status": "passed"
});
formatter.match({
  "location": "CRM_Loginstepdefinition_Step.click_Save_to_save_the_page_layout()"
});
formatter.result({
  "duration": 6218324906,
  "status": "passed"
});
formatter.match({
  "location": "CRM_Loginstepdefinition_Step.unlink_ACP_from_the_same_enquiry_hit_save_button()"
});
formatter.result({
  "duration": 5045720687,
  "status": "passed"
});
formatter.match({
  "location": "CRM_Loginstepdefinition_Step.system_should_show_us_validation_and_validate_them()"
});
formatter.result({
  "duration": 4477967615,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Close All the Tabs with in CRM",
  "description": "",
  "id": "crm-email-to-case-an-enquiry-and-link/unlink-acp-to-prevent-error-validations;close-all-the-tabs-with-in-crm",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@Close_All_The_Tabs_in_CRM"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "I Navigate to Close All the Tabs",
  "keyword": "Given "
});
formatter.match({
  "location": "CRM_Loginstepdefinition_Step.iNavigateToCloseAllTheTabs()"
});
formatter.result({
  "duration": 405094620,
  "status": "passed"
});
});