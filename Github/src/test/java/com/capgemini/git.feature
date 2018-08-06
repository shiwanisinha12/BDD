Feature: Login To github account
Scenario: I should be able to login with valid credentials	
	Given I navigate to login page
	And I enter the username and password
	When I click on Sign in
	Then I should be logged in