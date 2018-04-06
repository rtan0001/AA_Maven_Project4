Feature: Applicant WorkExperience Feature
  Students can add work experience details to their application

  @AddAdditionalDocuments
  Scenario Outline: Applicant Add work experience to their application

#    Given I navigate to the AA portal login page
#    And I entered <username> and <password>
#    And I click login button
#    And I click Create New Application button
    And I click on Add New Document button
    And I Select upload button to choose a file  to upload
    And I select DocumentType <Type> From Document attachment Section
    And I Set the comments in Textbox <comments> from documents
    And I click on Upload button <Upload> from Documents section
#    Then Logout <Logout> of the Application


    Examples:
      |   username                          |   password    |  Type                                        |  comments                                          |   Upload   |    Logout    |
      |   rupa12.tanneeru12@mailinator.com   |   monash@2017 |  Proof of citizenship/residency or identity  |  Enter Application Document Comments in TextArea   |   Upload   |    Logout    |
