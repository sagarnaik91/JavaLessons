Feature: Login into facebook

Scenario: Login into facebook account
Given facebook homepage is opened
When credentials are entered
Then login into account should be successful
And profile should be visible

Scenario: Login into facebook account using invalid username
Given facebook login is opened
When username "invalid" are entered
And password "invalid" are entered
Then login into account should be not successful
And login profile should be visible