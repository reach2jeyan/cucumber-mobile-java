Feature: Logout

  Scenario: Verify user is not logged out on clicking cancel in the alert message and logged out on clicking yes
    When I assert for the element with id "Navigation-Settings"
    And I tap on identifier with id "Navigation-Settings"
    When I assert for the element with id "Button-SignOut"
    And I tap on identifier with id "Button-SignOut"
    Then I assert for the element with id "alertTitle"
    And I tap on identifier with id "button1"
    Then I tap on identifier with id "Button-SignIn"


