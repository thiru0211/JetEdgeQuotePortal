Feature: QUOTE REPORTS

  @TC_01
  Scenario: Quote Reports: By User
    Given To Check Quote Reports User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check Quote Reports User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check Quote Reports
    Then Click the By User in Quote Reports
    And Select valid from date in by user
    Then Select valid sales rep in by user
    And Select valid sort by in by user
    Then Click search button in by user
    And Click export button in by user
    Then close the Quote Reports Page

  @TC_02
  Scenario: Quote Reports: By Day
    Given To Check Quote Reports User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check Quote Reports User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check Quote Reports
    Then Click the By Day in Quote Reports
    And Select valid from date in By Day
    And Select valid sort by in By Day
    Then Click search button in By Day
    And Click export button in By Day
    Then close the Quote Reports Page

  @TC_03
  Scenario: Quote Reports: By Trip Type
    Given To Check Quote Reports User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check Quote Reports User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check Quote Reports
    Then Click the By Trip Type in Quote Reports
    And Select valid from date in By Trip Type
    Then Select valid Quoted For in By Trip Type
    And Select valid sort by in By Trip Type
    Then Click search button in By Trip Type
    And Click export button in By Trip Type
    Then close the Quote Reports Page

  @TC_04
  Scenario: Quote Reports: By Route
    Given To Check Quote Reports User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check Quote Reports User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check Quote Reports
    Then Click the By Route in Quote Reports
    And Select valid Report Type in By Route
    Then Select valid from date in By Route
    And Enter valid number in top box in By Route
    Then Click search button in By Route
    And Click export button in By Route
    Then close the Quote Reports Page

  @TC_05
  Scenario: Quote Reports: Calendar View
    Given To Check Quote Reports User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check Quote Reports User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check Quote Reports
    Then Click the Calendar View in Quote Reports
    And Select valid Project Start in Calendar View
    Then Enter valid number in Display Week in Calendar View
    Then Click search button in Calendar View
    And Click export button in Calendar View
    Then close the Quote Reports Page
