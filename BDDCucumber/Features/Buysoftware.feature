@buysoftware
Feature: User want to buy software from Oscommerce

In order to buy software
As a user
I want to click software,click on action,click buy it now,click add to cart,enter amount,click
checkout,enter username and passward

Scenario Outline:User want to buy software from Oscommerce

Given user visiting homepage 
When click software
And click action
And click buy it now
And click add to cart
When enter "<amount>"
And click update
And Click checkout
When enter user "<email address>" and "<Password>" 
And click signin
Then user able to login the system
And click continue


Examples:

| email address |      | Password |    |amount|
| pat@yahoo.com|        | Abc123   |   |5|