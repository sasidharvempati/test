#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#@tag
#Feature: Title of your feature
  #I want to use this template for my feature file
#
  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
      
      
 
Feature: opencart

@TC01
Scenario: Login with invalid credentials
Given user is not logged in and is on the login page
When user enters invalid username 
And user enters invalid password 
And user clicks login button
Then a warning message is displayed

@TC02
Scenario: Login with valid credentials
Given user is on the login page
When user enters valid username 
And user enters valid password 
And user clicks login button to login
Then  account page is displayed

@TC03
Scenario: add product to cart from categories 
Given user is on account page to select a product
When user navigates to product page by clicking on the product
And user enters the details of the product 
And user clicks on add to cart
Then product gets added to cart

@TC04
Scenario: check the product in cart 
Given user is on account page and wants to check the cart 
And user navigates to cart page
When user checks the product in the cart
Then confirms product is present or not

@TC05
Scenario: user want to change account password
Given user is on account page and wants to change password 
And user navigates to my account page to change password
When user clicks password
And user gives valid password 
And user clicks continue to change password
Then account password is changed

@TC06
Scenario: user want to subscribe to newsletter
Given user is on account page and wants to subscribe newsletter 
And user navigates to my account page to subscribe newsletter
When user clicks newsletter
And user clicks yes 
And user clicks submit to subscribe
Then newsletter is subscribed

@TC07
Scenario: logout
Given user is on account page
When user clicks my account
And user clicks logout 
And user clicks continue
Then user is logged out of his account