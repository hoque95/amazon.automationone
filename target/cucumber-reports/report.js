$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/amazon/automationone/cucumberFeature/amazon.feature");
formatter.feature({
  "name": "Amazon Automation",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "I am on Amazon",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I am at Amazon HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "AmazoneHomePageStepsDeffination.i_am_at_Amazon_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Logo Visibility",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "logo is visible and I validate",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazoneHomePageStepsDeffination.logo_is_visible_and_I_validate()"
});
formatter.result({
  "status": "passed"
});
});