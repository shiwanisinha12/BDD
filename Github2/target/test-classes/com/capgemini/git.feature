Feature: Login To github account
Scenario: I should be able to login with valid credentials	
	Given I navigate to https://github.com/login
	And I enter the username as shiwani.a.sinha@capgemini.com
	And I enter the password as Shiwani12@1996
	When I click on Sign in
	Then I should be logged in