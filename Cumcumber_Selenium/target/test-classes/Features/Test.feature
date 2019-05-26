Feature: Personal banking page login portal switch
  Verify if the URL of the login portal is correct according to the portal the user chooses

  Scenario Outline: User chooses login portal
    Given user is on Personal banking page
    When user choose a '<login_portal>' from portal drop down
    Then the Login URL should swich to '<portal_URL>' of the choice
    
   	Examples:
      | login_portal        | portal_URL          |
      | Internet Banking    | Internet Banking    |
      | ANZ Share Investing | ANZ Share Investing |
    
    
    
    