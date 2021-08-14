$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AC6.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify that user can see valid valid placeholders on Username and Password fields",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SYMU-368"
    }
  ]
});
formatter.step({
  "name": "the user on the login page",
  "keyword": "Given "
});
formatter.step({
  "name": "\"\u003ctitle\u003e\" place holders should be seen",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "title"
      ]
    },
    {
      "cells": [
        "Username or email"
      ]
    },
    {
      "cells": [
        "Password"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify that user can see valid valid placeholders on Username and Password fields",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SYMU-368"
    }
  ]
});
formatter.step({
  "name": "the user on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.symund.step_definitions.LoginStepdefs.theUserOnTheLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Username or email\" place holders should be seen",
  "keyword": "Then "
});
formatter.match({
  "location": "com.symund.step_definitions.LoginStepdefs.placeHoldersShouldBeSeen(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that user can see valid valid placeholders on Username and Password fields",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SYMU-368"
    }
  ]
});
formatter.step({
  "name": "the user on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.symund.step_definitions.LoginStepdefs.theUserOnTheLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Password\" place holders should be seen",
  "keyword": "Then "
});
formatter.match({
  "location": "com.symund.step_definitions.LoginStepdefs.placeHoldersShouldBeSeen(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});