@End2End
Feature: Validate The SkyBlue Background Button Exists

Background: 
Given User is able to go to the todo list website

@Scenario1
Scenario: User should be able to use the set SkyBlue Background Button
When User clicks on the set SkyBlue Background button
Then The Background Color Should Change to SkyBlue

@Scenario2
Scenario: User should be able to use the set White Background Button
When User clicks on the set White Background button
Then The Background color Should Change to White




