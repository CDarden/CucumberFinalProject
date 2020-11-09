$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/Background_Color.feature");
formatter.feature({
  "line": 2,
  "name": "Validate The SkyBlue Background Button Exists",
  "description": "",
  "id": "validate-the-skyblue-background-button-exists",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@End2End"
    }
  ]
});
formatter.before({
  "duration": 7811548200,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is able to go to the todo list website",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.User_is_able_to_go_to_the_todo_list_website()"
});
formatter.result({
  "duration": 619498000,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "User should be able to use the set SkyBlue Background Button",
  "description": "",
  "id": "validate-the-skyblue-background-button-exists;user-should-be-able-to-use-the-set-skyblue-background-button",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User clicks on the set SkyBlue Background button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "The Background Color Should Change to SkyBlue",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.User_clicks_on_the_set_SkyBlue_Background_button()"
});
formatter.result({
  "duration": 4075687700,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.The_Background_Color_Should_Change_to_SkyBlue()"
});
formatter.result({
  "duration": 400041500,
  "status": "passed"
});
formatter.after({
  "duration": 654374700,
  "status": "passed"
});
});