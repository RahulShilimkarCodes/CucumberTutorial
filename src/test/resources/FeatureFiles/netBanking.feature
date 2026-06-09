Feature: Application Login

  Scenario: Admin default login page
    Given Admin user is on netbanking login page
    When user logins to the application with username as "admin" and password as "password"
    Then Home Page is displayed
    And Cards are displayed

  Scenario: Credit Card User default login page
    Given Credit card user is on netbanking login page
    When user logins to the application with username as "creditCard" and password as "passwordCard"
    Then Home Page is displayed
    And Cards are displayed

  #Data Driven Testing  - Runs test 3 times
  Scenario Outline: Credit Card User default login page
    Given Credit card user is on netbanking login page
    When user logins to the application with username as "<Username>" and password as "<Password>" using datas
    Then Home Page is displayed
    And Cards are displayed

    Examples: 
      | Username   | Password   |
      | creditCard | CreditPass |
      | debitCard  | DebitPass  |
      | visaCard   | VisaPass   |

  #Data Driven Testing  - Runs test 3 times
  Scenario Outline: Credit Card User default login page
    Given Credit card user is on netbanking login page
    When user logins to the application with username as <Username> and password as <Password> using regex
    Then Home Page is displayed
    And Cards are displayed

    Examples: 
      | Username   | Password   |
      | creditCard | CreditPass |
      | debitCard  | DebitPass  |
      | visaCard   | VisaPass   |

  @List
  Scenario: Updating the fields in login form
    Given User is on Rahul Shetty login Page
    When User tries to update form details as below using List
      | Rahul Shetty           |
      | rahul.shetty@gmail.com |
      | RahulShetty            |
      | 09-09-2000             |
    Then User submits the details

  @Maps
  Scenario: Updating the fields in login form
    Given User is on Rahul Shetty login Page
    When User tries to update form details as below using Maps
      | Username    | Rahul Shetty           |
      | Email       | rahul.shetty@gmail.com |
      | Password    | RahulShetty            |
      | DateOfBirth | 09-09-2000             |
    Then User submits the details

  @DataTableMaps
  Scenario: Updating the fields in login form
    Given User is on Rahul Shetty login Page
    When User tries to update form details as below using DataTablesMap
      | Username    | Rahul Shetty           |
      | Email       | rahul.shetty@gmail.com |
      | Password    | RahulShetty            |
      | DateOfBirth | 09-09-2000             |
    Then User submits the details

  @DataTableList
  Scenario: Updating the fields in login form
    Given User is on Rahul Shetty login Page
    When User tries to update form details as below using DataTablesList
      | Rahul Shetty           |
      | rahul.shetty@gmail.com |
      | RahulShetty            |
      | 09-09-2000             |
    Then User submits the details

  #use horizontal tables alone for this..
  @DataTableListOfMaps
  Scenario: Updating the fields in login form
    Given User is on Rahul Shetty login Page
    When User tries to update form details as below using DataTablesListOfMap
      | Username     | Email                  | Password    | DateOfBirth |
      | Rahul Shetty | rahul.shetty@gmail.com | RahulShetty | 09-09-2000  |
      | Virat Kohli  | virat.kohli@rcb.com    | rcb@18team  | 09-09-1980  |
    Then User submits the details
