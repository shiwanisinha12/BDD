Feature: I have to register for project

Scenario: I am entering the valid details
Given I enter the firstname as Shiwani and lastname as Sinha
And I enter the email address as Shiwani12@gmail.com
And I enter my contact number as 9096736965
And I enter the address as Infotech Park and city as Pune
And I select the state
When I click on register
Then I get a message and then I am directed to project page
And I am registered


