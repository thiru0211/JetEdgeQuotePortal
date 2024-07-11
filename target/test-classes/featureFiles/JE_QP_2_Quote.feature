Feature: SignIn

  @TC_01
  Scenario: Quote:Prepare Quote
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the prepare quote button in quote
    And Select valid quote by in prepare quote
    Then Select valid tail in prepare quote
    And Select valid Account Type in prepare quote
    Then Select valid Quote For in prepare quote
    Then close the prepare quote Page

  @TC_02
  Scenario: Quote:Prepare Quote
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the prepare quote button in quote
    And Select valid Account Type in prepare quote
    And Select valid date in calendar in prepare quote
    Then select valid seating capacity in prepare quote
    Then select valid destination location in prepare quote
    Then close the prepare quote Page

  @TC_03
  Scenario: Quote:Prepare Quote
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the prepare quote button in quote
    And Select valid Account Type in prepare quote
    And Select valid date in calendar in prepare quote
    Then select valid seating capacity in prepare quote
    Then select valid destination location in prepare quote
    And Check BH and FH values in prepare quote
    Then close the prepare quote Page

  @TC_04
  Scenario: Quote:Prepare Quote
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the prepare quote button in quote
    And Select valid Account Type in prepare quote
    And Select valid date in calendar in prepare quote
    Then select valid seating capacity in prepare quote
    Then select valid destination location in prepare quote
    And click Add leg button in prepare quote
    Then close the prepare quote Page

  @TC_05
  Scenario: Quote:Prepare Quote
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the prepare quote button in quote
    And Select valid Account Type in prepare quote
    And Select valid date in calendar in prepare quote
    Then select valid seating capacity in prepare quote
    Then select valid destination location in prepare quote
    And click Add leg button in prepare quote
    Then Click delete button in prepare quote
    Then close the prepare quote Page

  @TC_06
  Scenario: Quote:Prepare Quote
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the prepare quote button in quote
    And Select valid Account Type in prepare quote
    And Select valid date in calendar in prepare quote
    Then select valid seating capacity in prepare quote
    Then select valid destination location in prepare quote
    And click Add leg button in prepare quote
    Then close the prepare quote Page

  @TC_07
  Scenario: Quote:Prepare Quote
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the prepare quote button in quote
    And Select valid Account Type in prepare quote
    And Select valid date in calendar in prepare quote
    Then select valid seating capacity in prepare quote
    Then select valid destination location in prepare quote
    And click Add leg button in prepare quote
    Then Click Insert button in prepare quote
    And Click No button in prepare quote
    Then Click Insert button in prepare quote
    And Click Yes button in prepare quote
    Then Select valid seating in Add Leg
    And Select valid date in calendar in Add Leg
    And Select valid destination location in Add Leg
    Then Click submit button in Add Leg
    Then close the prepare quote Page

  @TC_08
  Scenario: Quote:Prepare Quote
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the prepare quote button in quote
    And Select valid Account Type in prepare quote
    And Select valid date in calendar in prepare quote
    Then select valid seating capacity in prepare quote
    Then select valid destination location in prepare quote
    And click Add leg button in prepare quote
    Then click Calculate button in prepare quote
    Then close the prepare quote Page

  @TC_09
  Scenario: Quote:Quote List
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote list button in quote
    And Click create new quote button in quote list
    Then Check the landing page in quote list
    Then close the prepare quote Page

  @TC_10
  Scenario: Quote:Quote List
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote list button in quote
    And Select valid quote status in quote list
    Then Select valid from date in quote list
    And Select valid tail in quote list
    Then Select valid customer name in quote list
    And Select valid sales name in quote list
    Then Select valid status in quote list
    And Click search button in quote list
    Then close the prepare quote Page

  @TC_11
  Scenario: Quote:Quote List
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote list button in quote
    Then Select valid from date in quote list
    And Click search button in quote list
    And Click view button in quote list
    Then close the prepare quote Page

  @TC_12
  Scenario: Quote:Quote List
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote list button in quote
    Then Select valid from date in quote list
    And Click search button in quote list
    And Click view button in quote list
    Then Click timer button in quote list
    And Click close button in quote list
    Then close the prepare quote Page

  @TC_13
  Scenario: Quote:Quote List
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote list button in quote
    Then Select valid from date in quote list
    And Click search button in quote list
    And Click view button in quote list
    Then Click Action button in quote list
    And Click copy quote button in quote list
    And Click close button in copy quote
    Then close the prepare quote Page

  @TC_14
  Scenario: Quote:Quote List
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote list button in quote
    Then Select valid from date in quote list
    And Click search button in quote list
    And Click view button in quote list
    Then Click Action button in quote list
    And Click copy quote button in quote list
    And Click create button in copy quote
    Then close the prepare quote Page

  @TC_15
  Scenario: Quote:Quote List
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote list button in quote
    Then Select valid from date in quote list
    And Click search button in quote list
    And Click view button in quote list
    Then Click Action button in quote list
    And Click copy quote button in quote list
    Then Select valid details in copy quote
    And Click create button in copy quote
    Then close the prepare quote Page

  @TC_16
  Scenario: Quote:Quote List
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote list button in quote
   # Then Select valid from date in quote list
   # And Click search button in quote list
    And Click view button in quote list
    Then Click edit button in quote list
   # And Modify details in quote list
    Then Click update button in quote list
    Then click Calculate button in prepare quote
    Then close the prepare quote Page

  @TC_17
  Scenario: Quote:Quote List
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote list button in quote
    And Click view button in quote list
    Then Click Add new line item button in quote list
    And Click close button in Add new line item
    Then close the prepare quote Page

  @TC_18
  Scenario: Quote:Quote List
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote list button in quote
    And Click view button in quote list
    Then Click Add new line item button in quote list
    And Click save button in Add new line item
    Then close the prepare quote Page

  @TC_19
  Scenario: Quote:Quote List
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote list button in quote
    And Click view button in quote list
    Then Click Add new line item button in quote list
    Then Enter valid details in Add new line item
    And Click save button in Add new line item
    Then close the prepare quote Page

  @TC_20
  Scenario: Quote:Quote List
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote list button in quote
    And Click view button in quote list
    Then Click edit button in Add new line item
    And Click close button in edit line item
    Then close the prepare quote Page

  @TC_21
  Scenario: Quote:Quote List
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote list button in quote
    And Click view button in quote list
    Then Click edit button in Add new line item
    Then Modify valid details in edit line item
    And Click update button in edit line item
    Then close the prepare quote Page

  @TC_22
  Scenario: Quote:Quote List
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote list button in quote
    And Click view button in quote list
    Then Click delete button in edit line item
    Then close the prepare quote Page

  @TC_23
  Scenario: Quote:Quote List
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote list button in quote
    And Click view button in quote list
    Then Click expand button in price list
    And Click close button in price list
    Then close the prepare quote Page

  @TC_24
  Scenario: Quote:Quote List
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote list button in quote
    And Click view button in quote list
    Then Click expand button in price formula
    And Click close button in price formula
    Then close the prepare quote Page

  @TC_25
  Scenario: Quote:Quote List
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote list button in quote
    And Click view button in quote list
    Then Click JE Managed button in quote list
    And Click close button in JE Managed
    Then close the prepare quote Page

  @TC_26
  Scenario: Quote:Quote List
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote list button in quote
    And Click view button in quote list
    Then Click Add FET Tax button in quote list
    And Click close button in Add FET Tax
    Then close the prepare quote Page

  @TC_27
  Scenario: Quote:Quote List
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote list button in quote
    And Click view button in quote list
    Then Click Add FET Tax button in quote list
    And Enter valid details in Add FET Tax
    And Click Save button in Add FET Tax
    Then close the prepare quote Page

  @TC_28
  Scenario: Quote:Quote List
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote list button in quote
    And Click view button in quote list
    Then Click edit button in Add FET Tax
    And Click close button in edit FET Tax
    Then close the prepare quote Page

  @TC_29
  Scenario: Quote:Quote List
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote list button in quote
    And Click view button in quote list
    Then Click edit button in Add FET Tax
    And Modify details in edit FET Tax
    And Click save button in edit FET Tax
    Then close the prepare quote Page

  @TC_30
  Scenario: Quote:Quote List
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote list button in quote
    And Click view button in quote list
    Then Click delete button in tax line item
    Then close the prepare quote Page

  @TC_31
  Scenario: Quote:Quote Comments
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote comments button in quote
    And Click Add new button in quote comments
    Then Click back button in quote comments
    Then close the prepare quote Page

  @TC_32
  Scenario: Quote:Quote Comments
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote comments button in quote
    And Click Add new button in quote comments
    Then Click save button in quote comments
    Then close the prepare quote Page

  @TC_33
  Scenario: Quote:Quote Comments
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote comments button in quote
    And Click Add new button in quote comments
    Then Click Add airport button in quote comments
    And Click Add to list in add airport
    Then close the prepare quote Page

  @TC_34
  Scenario: Quote:Quote Comments
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote comments button in quote
    And Click Add new button in quote comments
    Then Click Add airport button in quote comments
    And Click Enter airport radio button in add airport
    Then Choose valid airport in add airport
    And Click Add to list in add airport
    Then close the prepare quote Page

  @TC_35
  Scenario: Quote:Quote Comments
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote comments button in quote
    And Click Add new button in quote comments
    Then Click Add airport button in quote comments
    And Click Choose group radio button in add airport
    Then Click the checkbox in add airport
    And Click Add to list in add airport
    Then close the prepare quote Page

  @TC_36
  Scenario: Quote:Quote Comments
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote comments button in quote
    And Click Add new button in quote comments
    Then Click Add airport button in quote comments
    And Click Enter airport radio button in add airport
    Then Choose valid airport in add airport
    And Click Add to list in add airport
    Then Click the close button in add airport
    And Click delete button in quote comments
    Then close the prepare quote Page

  @TC_37
  Scenario: Quote:Quote Comments
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote comments button in quote
    And Click Add new button in quote comments
    Then Click specific radio button in quote comments
    And Click Add customer button in quote comments
    Then Click Close button in Customer mapping details
    Then close the prepare quote Page

  @TC_38
  Scenario: Quote:Quote Comments
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote comments button in quote
    And Click Add new button in quote comments
    Then Click specific radio button in quote comments
    And Click Add customer button in quote comments
    Then Enter valid customer name in Customer mapping details
    And Click the checkbox in Customer mapping details
    Then Click Add to list button in Customer mapping details
    Then close the prepare quote Page

  @TC_39
  Scenario: Quote:Quote Comments
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote comments button in quote
    And Click Add new button in quote comments
    Then Click specific radio button in quote comments
    And Click Add customer button in quote comments
    Then Enter valid customer name in Customer mapping details
    And Click the checkbox in Customer mapping details
    Then Click Add to list button in Customer mapping details
    Then Click Close button in Customer mapping details
    And Click Delete button in Customer details
    Then close the prepare quote Page

  @TC_40
  Scenario: Quote:Quote Comments
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote comments button in quote
    And Click Add new button in quote comments
    Then Enter notes in quote comments
    And Click No radio button in quote comments
    Then Click Add airport button in quote comments
    And Click Enter airport radio button in add airport
    Then Choose valid airport in add airport
    And Click Add to list in add airport
    Then Click the close button in add airport
    Then Click specific radio button in quote comments
    And Click Add customer button in quote comments
    Then Enter valid customer name in Customer mapping details
    And Click the checkbox in Customer mapping details
    Then Click Add to list button in Customer mapping details
    Then Click Close button in Customer mapping details
    And Click clear button in quote comments
    Then close the prepare quote Page

  @TC_41
  Scenario: Quote:Quote Comments
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote comments button in quote
    And Click Add new button in quote comments
    Then Enter notes in quote comments
    And Click No radio button in quote comments
    Then Click Add airport button in quote comments
    And Click Enter airport radio button in add airport
    Then Choose valid airport in add airport
    And Click Add to list in add airport
    Then Click the close button in add airport
    Then Click specific radio button in quote comments
    And Click Add customer button in quote comments
    Then Enter valid customer name in Customer mapping details
    And Click the checkbox in Customer mapping details
    Then Click Add to list button in Customer mapping details
    Then Click Close button in Customer mapping details
    And Click save button in quote comments
    Then close the prepare quote Page

  @TC_42
  Scenario: Quote:Quote Comments
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the quote comments button in quote
    And Click Edit button in quote comments
    Then Modify the details in quote comments
    And Click update button in quote comments
    Then close the prepare quote Page

  @TC_43
  Scenario: Quote:Quote Comments
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the terms and condition button in quote
    And Click add new button in terms and condition
    Then Click back button in terms and condition
    Then close the prepare quote Page

  @TC_44
  Scenario: Quote:Quote Comments
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the terms and condition button in quote
    And Click add new button in terms and condition
    Then Click save button in terms and condition
    Then close the prepare quote Page

  @TC_45
  Scenario: Quote:Quote Comments
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the terms and condition button in quote
    And Click add new button in terms and condition
    Then Enter valid version in terms and condition
    And Select valid date in calendar in terms and condition
    Then Click no radio button in terms and condition
    And Enter terms and condition details in terms and condition
    Then Click save button in terms and condition
    Then close the prepare quote Page

  @TC_46
  Scenario: Quote:Quote Comments
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the terms and condition button in quote
    And Click edit button in terms and condition
    Then Modify the details in terms and condition
    Then Click update button in terms and condition
    Then close the prepare quote Page

  @TC_47
  Scenario: Quote:Quote Comments
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the special day button in quote
    And Click add new button in special day
    Then Click back button in special day
    Then close the prepare quote Page

  @TC_48
  Scenario: Quote:Quote Comments
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the special day button in quote
    And Click add new button in special day
    Then Click save button in special day
    Then close the prepare quote Page

  @TC_49
  Scenario: Quote:Quote Comments
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the special day button in quote
    And Click add new button in special day
    And Enter valid details in special day
    Then Click clear button in special day
    Then close the prepare quote Page

  @TC_50
  Scenario: Quote:Quote Comments
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the special day button in quote
    And Click add new button in special day
    And Enter valid details in special day
    Then Click save button in special day
    Then close the prepare quote Page

  @TC_51
  Scenario: Quote:Quote Comments
    Given To Check prepare quote User is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/JETIQ/Login.aspx?ReturnUrl=%2fjetiq"
    When To Check prepare quote User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@321"
    And click the Signin button To Check prepare quote
    Then Click the special day button in quote
    And Click edit button in special day
    And Modify valid details in special day
    Then Click update button in special day
    Then close the prepare quote Page
