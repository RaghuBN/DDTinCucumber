Feature: DataDriven Test of Vtiger Application

Scenario Outline: parametization the test case functionality

Given: User should be in home page
When : Run the applicaton using browser
Then : Enter "<Username>" and "<Password>" in EditBox
Then : sign in the the application
Then : Home page should display
Then : Close the Browser

Examples:
     |Username|Password|
	 | admin  | raghu  |
	 | admin  | raghu  |
	 | admin  | raghu  |
	 