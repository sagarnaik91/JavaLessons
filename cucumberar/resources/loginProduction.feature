@prod
Feature: Login into facebook

Background: 
Given facebook login is opened

Scenario: Login into facebook account using invalid username and password

When username "invalid" are entered
And password "invalid" are entered
Then login into account should be not successful
And login profile should be visible

Scenario: Login into facebook account using invalid username and valid password
When username "invalid" are entered
And password "valid" are entered
Then login into account should be not successful
And login profile should be visible