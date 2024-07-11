Feature: WIND TEMP

  @TC_01
  Scenario: Wind Temp:Season Setup
    Given To Check Wind Temp User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check Wind Temp User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check Wind Temp
    Then Click season setup button in wind temp
    And Select valid season in any month in season setup
    Then Click clear button in season setup
    Then close the Wind Temp Page

  @TC_02
  Scenario: Wind Temp:Season Setup
    Given To Check Wind Temp User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check Wind Temp User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check Wind Temp
    Then Click season setup button in wind temp
    And Select valid season in any month in season setup
    Then Click update button in season setup
    And Click close button in season setup
    Then Change to default value in modified month in season setup
    Then close the Wind Temp Page

  @TC_03
  Scenario: Wind Temp:Season Setup
    Given To Check Wind Temp User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check Wind Temp User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check Wind Temp
    Then Click Static Routing Data button in wind temp
    And Select valid aircraft type in Static Routing Data
    Then Enter valid start airport in Static Routing Data
    And Enter valid end airport in Static Routing Data
    Then Click search button in Static Routing Data
    And Click export button in Static Routing Data
    Then close the Wind Temp Page

  @TC_04
  Scenario: Wind Temp:Season Setup
    Given To Check Wind Temp User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check Wind Temp User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check Wind Temp
    Then Click Wind Temp Dump button in wind temp
    Then Enter valid start airport in Wind Temp Dump
    And Enter valid end airport in Wind Temp Dump
    Then Click search button in Wind Temp Dump
    And Click export button in Wind Temp Dump
    Then close the Wind Temp Page
