@blurental_managerlogin
@regression
  Feature: manager_login_test
    Scenario Outline: TC01_manager_login_test
      Given user goes to "appurl"
      When user clicks  login button
      And user enters "<email>" adress
      And user enters "<password>"
      And user clicks loginpagelogin button
      Then user checks that he is logged in
      Then close the application

      Examples:
      |email|password|
      |sam.walker@bluerentalcars.com |c!fas_art|
      |kate.brown@bluerentalcars.com |tad1$Fas |
      |raj.khan@bluerentalcars.com   |v7Hg_va^ |
      |pam.raymond@bluerentalcars.com|Nga^g6  |

