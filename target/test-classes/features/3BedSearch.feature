Feature: Bed Search

  Scenario: Verify after login Job search is the default page launched
    Then I assert for the element with id "TextInput-BTJobSearch"

  Scenario: Verify user is shown invalid bed on invalid bed id input and can clear content using clear button
    And I tap on identifier with id "TextInput-BTJobSearch"
    When text "999" is entered in the identifier with id "TextInput-BTJobSearch"
    Then value should match "999" for the identifier with id "TextInput-BTJobSearch"
    And I click on done button
    When I assert for the element with id "MessageBox-error"
    And I tap on identifier with id "SearchInputClearIcon-BTJobSearch"
    Then value should match "Enter Bed ID" for the identifier with id "TextInput-BTJobSearch"
    
  Scenario: Verify user sees Job card on entering the valid bed id and navigates back to bed search on tapping Cancel
    And I tap on identifier with id "TextInput-BTJobSearch"
    When text "32091" is entered in the identifier with id "TextInput-BTJobSearch"
    And I click on done button
    Then I assert for the element with id "Button-Cancel"
    And I tap on identifier with id "Button-Cancel"
    Then I assert for the element with id "TextInput-BTJobSearch"


  Scenario: Verify user can search for dirty valid bed and mark complete status
    And I tap on identifier with id "TextInput-BTJobSearch"
    When text "32091" is entered in the identifier with id "TextInput-BTJobSearch"
    Then value should match "32091" for the identifier with id "TextInput-BTJobSearch"
    And I click on done button
    When I tap on identifier with id "Button-GoInProgress"
    And value should match "Go In Progress?" for the identifier with id "alertTitle"
    When I tap on identifier with id "button2"
    Then I assert for the element with id "Button-GoInProgress"
    And I tap on identifier with id "Button-GoInProgress"
    When I tap on identifier with id "button1"
    And I assert for the element with id "Button-CompleteJob"
    When I tap on identifier with id "Button-CompleteJob"
    And I tap on identifier with id "button2"
    Then I assert for the element with id "Button-CompleteJob"
    And I tap on identifier with id "Button-CompleteJob"
    Then I tap on identifier with id "button1"
    Then I assert for the element with id "TextInput-BTJobSearch"


    


