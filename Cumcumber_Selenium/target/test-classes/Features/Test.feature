Feature: Personal banking page login portal switch
  Verify if the URL of the login portal is correctly reflect the portal the user chooses

  Scenario Outline: User chooses login portal
    Given user is on Personal banking page
    When user choose a '<login_portal>' from portal drop down
    Then the Login URL should switch to '<login_portal>' of the choice
    
   	Examples:
      | login_portal        |
      | Internet Banking    |
      | ANZ Share Investing |
    
    
    
    