Feature: Login


  Scenario: Verify user can react the MyJobs section only with valid credentials
    When text "sushbt" is entered in the identifier with id "TextInput-UserName"
    And text "Pass@12" is entered in the identifier with id "TextInput-Password"
    When I hide the keyboard
    And I tap on identifier with id "Button-SignIn"
    And I tap on identifier with id "Button-SignIn"
    Then I assert for the element with id "InstructionalLabelTexterror"
    And text "Pass@123" is entered in the identifier with id "TextInput-Password"
    When I hide the keyboard
    And I tap on identifier with id "Button-SignIn"
    And I tap on identifier with id "Button-SignIn"
    Then I assert for the element with id "Navigation-Messages"

