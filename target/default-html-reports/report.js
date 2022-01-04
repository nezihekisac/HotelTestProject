$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/BookingCreate.feature");
formatter.feature({
  "name": "Booking",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Selecting both options from the Deposit Select button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test5"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to Deposit field",
  "keyword": "When "
});
formatter.match({
  "location": "com.hotelTest.stepDefinitions.BookingCreateStepDefs.userNavigatesToDepositField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the Deposit field",
  "keyword": "And "
});
formatter.match({
  "location": "com.hotelTest.stepDefinitions.BookingCreateStepDefs.userClicksOnTheDepositField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on true option on the selection",
  "keyword": "And "
});
formatter.match({
  "location": "com.hotelTest.stepDefinitions.BookingCreateStepDefs.userClicksOnTrueOptionOnTheSelection()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to see true option is selected",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hotelTest.stepDefinitions.BookingCreateStepDefs.userShouldBeAbleToSeeTrueOptionIsSelected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on false option on the selection",
  "keyword": "And "
});
formatter.match({
  "location": "com.hotelTest.stepDefinitions.BookingCreateStepDefs.userClicksOnFalseOptionOnTheSelection()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to see false option is selected",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hotelTest.stepDefinitions.BookingCreateStepDefs.userShouldBeAbleToSeeFalseOptionIsSelected()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});