Feature: New User - Sign Up - Test Feature

@UI @Staging
Scenario Outline: Verify User Able To Create A New Account in Application

	Given I Select Chrome Browser To Launch "<URL>" For Test Execution
	When I Click On Register Link in Home Page
	Then I Verify New User Account Page Loaded Successfully
	When I Set Text "<FirstName>" in First Name Field; in Account Sign Up Page
	And I Set Text "<LastName>" in Last Name Field; in Account Sign Up Page

@Staging
Examples:
| URL                     | FirstName | LastName |
| http://www.mapsynq.com/ | Test      | Centure	 |