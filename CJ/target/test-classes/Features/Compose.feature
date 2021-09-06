Feature: Testing Compose Function of G-mail

  Scenario: Successful Compose Mail
    Given User Launch Chrome browser
    When User opens URL "https://mail.google.com/"
    And User enter Email as "19mca005@nirmauni.ac.in"
    And Click on Next for password
    And User enter Password as "7567539652"
    And Click on Next for loging in
    Then User Click on Compose Button
    And User enter To as "19mca012@nirmauni.ac.in"
    And User enter subject as "Incubyte"
    And User enter body as "Automation QA Test for Incubyte"
    And User Click on Send Button
    And close browser


  Scenario: Unsuccessful Compose Mail while entering invalid email
    Given User Launch Chrome browser
    When User opens URL "https://mail.google.com/"
    And User enter Email as "19mca005@nirmauni.ac.in"
    And Click on Next for password
    And User enter Password as "7567539652"
    And Click on Next for loging in
    Then User Click on Compose Button
    And User enters an invalid Email as "19mca012nirmauni.ac.in" and browser closes
     

  Scenario: Unsuccessful Compose Mail By Closing Compose Box
    Given User Launch Chrome browser
    When User opens URL "https://mail.google.com/"
    And User enter Email as "19mca005@nirmauni.ac.in"
    And Click on Next for password
    And User enter Password as "7567539652"
    And Click on Next for loging in
    Then User Click on Compose Button
    And Close the Compose Box
    And User enter To as "19mca012@nirmauni.ac.in"
    And User enter subject as "Incubyte"
    And User enter body as "Automation QA Test for Incubyte"
    And User Click on Send Button
    And close browser
#
