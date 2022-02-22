Feature: enter into flipcart homepage


@smoketest 
Scenario: search for  samsung mobile
Given launch browser
When enter url
Then search for samsung mobile
Then close the browser

@regressiontest
Scenario: search for  samsung tab
Given launch browser
When enter url
Then search for samsung tab
Then close the browser

