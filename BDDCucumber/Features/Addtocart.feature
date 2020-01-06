@UserLogin
Feature: User want to add the first product on the cart

In order to Add the first product on the cart
As a user
I want to enter in the home page,click on the first prodcut then click add to cart and then click checkout


Scenario: Adding a product to a cart

Given user visiting homepage 
When click first product
And enter amount of product
And click checkout
Then user directed to login page
