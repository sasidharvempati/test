$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/b.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    },
    {
      "line": 19,
      "value": "#@tag"
    },
    {
      "line": 20,
      "value": "#Feature: Title of your feature"
    },
    {
      "line": 21,
      "value": "#I want to use this template for my feature file"
    },
    {
      "line": 22,
      "value": "#"
    },
    {
      "line": 23,
      "value": "#@tag1"
    },
    {
      "line": 24,
      "value": "#Scenario: Title of your scenario"
    },
    {
      "line": 25,
      "value": "#Given I want to write a step with precondition"
    },
    {
      "line": 26,
      "value": "#And some other precondition"
    },
    {
      "line": 27,
      "value": "#When I complete action"
    },
    {
      "line": 28,
      "value": "#And some other action"
    },
    {
      "line": 29,
      "value": "#And yet another action"
    },
    {
      "line": 30,
      "value": "#Then I validate the outcomes"
    },
    {
      "line": 31,
      "value": "#And check more outcomes"
    },
    {
      "line": 32,
      "value": "#"
    },
    {
      "line": 33,
      "value": "#@tag2"
    },
    {
      "line": 34,
      "value": "#Scenario Outline: Title of your scenario outline"
    },
    {
      "line": 35,
      "value": "#Given I want to write a step with \u003cname\u003e"
    },
    {
      "line": 36,
      "value": "#When I check for the \u003cvalue\u003e in step"
    },
    {
      "line": 37,
      "value": "#Then I verify the \u003cstatus\u003e in step"
    },
    {
      "line": 38,
      "value": "#"
    },
    {
      "line": 39,
      "value": "#Examples:"
    },
    {
      "line": 40,
      "value": "#| name  | value | status  |"
    },
    {
      "line": 41,
      "value": "#| name1 |     5 | success |"
    },
    {
      "line": 42,
      "value": "#| name2 |     7 | Fail    |"
    }
  ],
  "line": 46,
  "name": "opencart",
  "description": "",
  "id": "opencart",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 49,
  "name": "Login with invalid credentials",
  "description": "",
  "id": "opencart;login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 48,
      "name": "@TC01"
    }
  ]
});
formatter.step({
  "line": 50,
  "name": "user is not logged in and is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 51,
  "name": "user enters invalid username",
  "keyword": "When "
});
formatter.step({
  "line": 52,
  "name": "user enters invalid password",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "user clicks login button",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "a warning message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "invalidlogin.user_is_not_logged_in_and_is_on_the_login_page()"
});
formatter.result({
  "duration": 13682380893,
  "status": "passed"
});
formatter.match({
  "location": "invalidlogin.user_enters_invalid_username()"
});
formatter.result({
  "duration": 371737300,
  "status": "passed"
});
formatter.match({
  "location": "invalidlogin.user_enters_invalid_password()"
});
formatter.result({
  "duration": 203082452,
  "status": "passed"
});
formatter.match({
  "location": "invalidlogin.user_clicks_login_button()"
});
formatter.result({
  "duration": 1762277650,
  "status": "passed"
});
formatter.match({
  "location": "invalidlogin.a_warning_message_is_displayed()"
});
formatter.result({
  "duration": 123945745,
  "status": "passed"
});
formatter.scenario({
  "line": 57,
  "name": "Login with valid credentials",
  "description": "",
  "id": "opencart;login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 56,
      "name": "@TC02"
    }
  ]
});
formatter.step({
  "line": 58,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 59,
  "name": "user enters valid username",
  "keyword": "When "
});
formatter.step({
  "line": 60,
  "name": "user enters valid password",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "user clicks login button to login",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "account page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 10970283424,
  "status": "passed"
});
formatter.match({
  "location": "login.user_enters_valid_username()"
});
formatter.result({
  "duration": 706570209,
  "status": "passed"
});
formatter.match({
  "location": "login.user_enters_valid_password()"
});
formatter.result({
  "duration": 279738590,
  "status": "passed"
});
formatter.match({
  "location": "login.user_clicks_login_button_to_login()"
});
formatter.result({
  "duration": 2965780912,
  "status": "passed"
});
formatter.match({
  "location": "login.account_page_is_displayed()"
});
formatter.result({
  "duration": 808786137,
  "status": "passed"
});
formatter.scenario({
  "line": 65,
  "name": "add product to cart from categories",
  "description": "",
  "id": "opencart;add-product-to-cart-from-categories",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 64,
      "name": "@TC03"
    }
  ]
});
formatter.step({
  "line": 66,
  "name": "user is on account page to select a product",
  "keyword": "Given "
});
formatter.step({
  "line": 67,
  "name": "user navigates to product page by clicking on the product",
  "keyword": "When "
});
formatter.step({
  "line": 68,
  "name": "user enters the details of the product",
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "user clicks on add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 70,
  "name": "product gets added to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "categoryaddtocart.user_is_on_account_page_to_select_a_product()"
});
formatter.result({
  "duration": 17951360990,
  "status": "passed"
});
formatter.match({
  "location": "categoryaddtocart.user_navigates_to_product_page_by_clicking_on_the_product()"
});
formatter.result({
  "duration": 7812413536,
  "status": "passed"
});
formatter.match({
  "location": "categoryaddtocart.user_enters_the_details_of_the_product()"
});
formatter.result({
  "duration": 1357078073,
  "status": "passed"
});
formatter.match({
  "location": "categoryaddtocart.user_clicks_on_add_to_cart()"
});
formatter.result({
  "duration": 329697833,
  "status": "passed"
});
formatter.match({
  "location": "categoryaddtocart.product_gets_added_to_cart()"
});
formatter.result({
  "duration": 1214355,
  "status": "passed"
});
formatter.scenario({
  "line": 73,
  "name": "check the product in cart",
  "description": "",
  "id": "opencart;check-the-product-in-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 72,
      "name": "@TC04"
    }
  ]
});
formatter.step({
  "line": 74,
  "name": "user is on account page and wants to check the cart",
  "keyword": "Given "
});
formatter.step({
  "line": 75,
  "name": "user navigates to cart page",
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "user checks the product in the cart",
  "keyword": "When "
});
formatter.step({
  "line": 77,
  "name": "confirms product is present or not",
  "keyword": "Then "
});
formatter.match({
  "location": "checkcart.user_is_on_account_page_and_wants_to_check_the_cart()"
});
formatter.result({
  "duration": 45045825683,
  "status": "passed"
});
formatter.match({
  "location": "checkcart.user_navigates_to_cart_page()"
});
formatter.result({
  "duration": 1923610177,
  "status": "passed"
});
formatter.match({
  "location": "checkcart.user_checks_the_product_in_the_cart()"
});
formatter.result({
  "duration": 86333702,
  "status": "passed"
});
formatter.match({
  "location": "checkcart.confirms_product_is_present_or_not()"
});
formatter.result({
  "duration": 449151869,
  "status": "passed"
});
formatter.scenario({
  "line": 80,
  "name": "user want to change account password",
  "description": "",
  "id": "opencart;user-want-to-change-account-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 79,
      "name": "@TC05"
    }
  ]
});
formatter.step({
  "line": 81,
  "name": "user is on account page and wants to change password",
  "keyword": "Given "
});
formatter.step({
  "line": 82,
  "name": "user navigates to my account page to change password",
  "keyword": "And "
});
formatter.step({
  "line": 83,
  "name": "user clicks password",
  "keyword": "When "
});
formatter.step({
  "line": 84,
  "name": "user gives valid password",
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "user clicks continue to change password",
  "keyword": "And "
});
formatter.step({
  "line": 86,
  "name": "account password is changed",
  "keyword": "Then "
});
formatter.match({
  "location": "changepassword.user_is_on_account_page_and_wants_to_change_password()"
});
formatter.result({
  "duration": 41322982148,
  "status": "passed"
});
formatter.match({
  "location": "changepassword.user_navigates_to_my_account_page_to_change_password()"
});
formatter.result({
  "duration": 2931494840,
  "status": "passed"
});
formatter.match({
  "location": "changepassword.user_clicks_password()"
});
formatter.result({
  "duration": 2083718627,
  "status": "passed"
});
formatter.match({
  "location": "changepassword.user_gives_valid_password()"
});
formatter.result({
  "duration": 1519629276,
  "status": "passed"
});
formatter.match({
  "location": "changepassword.user_clicks_continue_to_change_password()"
});
formatter.result({
  "duration": 3513484576,
  "status": "passed"
});
formatter.match({
  "location": "changepassword.account_password_is_changed()"
});
formatter.result({
  "duration": 223199252,
  "status": "passed"
});
formatter.scenario({
  "line": 89,
  "name": "user want to subscribe to newsletter",
  "description": "",
  "id": "opencart;user-want-to-subscribe-to-newsletter",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 88,
      "name": "@TC06"
    }
  ]
});
formatter.step({
  "line": 90,
  "name": "user is on account page and wants to subscribe newsletter",
  "keyword": "Given "
});
formatter.step({
  "line": 91,
  "name": "user navigates to my account page to subscribe newsletter",
  "keyword": "And "
});
formatter.step({
  "line": 92,
  "name": "user clicks newsletter",
  "keyword": "When "
});
formatter.step({
  "line": 93,
  "name": "user clicks yes",
  "keyword": "And "
});
formatter.step({
  "line": 94,
  "name": "user clicks submit to subscribe",
  "keyword": "And "
});
formatter.step({
  "line": 95,
  "name": "newsletter is subscribed",
  "keyword": "Then "
});
formatter.match({
  "location": "subscribenewsletter.user_is_on_account_page_and_wants_to_subscribe_newsletter()"
});
formatter.result({
  "duration": 59698934576,
  "status": "passed"
});
formatter.match({
  "location": "subscribenewsletter.user_navigates_to_my_account_page_to_subscribe_newsletter()"
});
formatter.result({
  "duration": 2425535696,
  "status": "passed"
});
formatter.match({
  "location": "subscribenewsletter.user_clicks_newsletter()"
});
formatter.result({
  "duration": 2034570214,
  "status": "passed"
});
formatter.match({
  "location": "subscribenewsletter.user_clicks_yes()"
});
formatter.result({
  "duration": 2343868184,
  "status": "passed"
});
formatter.match({
  "location": "subscribenewsletter.user_clicks_submit_to_subscribe()"
});
formatter.result({
  "duration": 3808315088,
  "status": "passed"
});
formatter.match({
  "location": "subscribenewsletter.newsletter_is_subscribed()"
});
formatter.result({
  "duration": 176494675,
  "status": "passed"
});
formatter.scenario({
  "line": 98,
  "name": "logout",
  "description": "",
  "id": "opencart;logout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 97,
      "name": "@TC07"
    }
  ]
});
formatter.step({
  "line": 99,
  "name": "user is on account page",
  "keyword": "Given "
});
formatter.step({
  "line": 100,
  "name": "user clicks my account",
  "keyword": "When "
});
formatter.step({
  "line": 101,
  "name": "user clicks logout",
  "keyword": "And "
});
formatter.step({
  "line": 102,
  "name": "user clicks continue",
  "keyword": "And "
});
formatter.step({
  "line": 103,
  "name": "user is logged out of his account",
  "keyword": "Then "
});
formatter.match({
  "location": "logout.user_is_on_account_page()"
});
formatter.result({
  "duration": 43851311778,
  "status": "passed"
});
formatter.match({
  "location": "logout.user_clicks_my_account()"
});
formatter.result({
  "duration": 308740490,
  "status": "passed"
});
formatter.match({
  "location": "logout.user_clicks_logout()"
});
formatter.result({
  "duration": 3210983859,
  "status": "passed"
});
formatter.match({
  "location": "logout.user_clicks_continue()"
});
formatter.result({
  "duration": 3813456649,
  "status": "passed"
});
formatter.match({
  "location": "logout.user_is_logged_out_of_his_account()"
});
formatter.result({
  "duration": 179176735,
  "status": "passed"
});
});