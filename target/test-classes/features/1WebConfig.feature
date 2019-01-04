Feature: Web Config

  Scenario: Verify user cannot enter the sign in page on entering wrong server details
    Then I verify if SignIn button is disabled
    Then BT app is pointed to the server "https://mobile-nowa"
    And I hide the keyboard
    And I verify if SignIn button is enabled
    Then element with id "Button-Submit" is clicked
    Then element with id "Button-Submit" is clicked
    Then I assert for the element with id "InstructionalLabelTexterror"


  Scenario: Verify user is able to proceed to sign in page on entering write server details
    Then BT app is pointed to the server "https://mobile-nowaf.qa.iqgenhosp.com/"
    And I hide the keyboard
    Then I verify if SignIn button is enabled
    Then element with id "Button-Submit" is clicked
    Then element with id "Button-Submit" is clicked
    When text "sushbt" is entered in the identifier with id "TextInput-UserName"

