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
	|Username		|Password	 |
	|creditCard |CreditPass|
	|debitCard  |DebitPass |
	|visaCard   |VisaPass	 |
	
	
	  #Data Driven Testing  - Runs test 3 times
  Scenario Outline: Credit Card User default login page
    Given Credit card user is on netbanking login page
    When user logins to the application with username as <Username> and password as <Password> using regex
    Then Home Page is displayed
    And Cards are displayed
    
	Examples:
	|Username		|Password	 |
	|creditCard |CreditPass|
	|debitCard  |DebitPass |
	|visaCard   |VisaPass	 |
	
	
	
