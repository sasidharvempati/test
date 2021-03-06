$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/testcases.feature");
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
  "comments": [
    {
      "line": 48,
      "value": "#@TC01"
    },
    {
      "line": 49,
      "value": "#Scenario: Login with invalid credentials"
    },
    {
      "line": 50,
      "value": "#Given user is not logged in and is on the login page"
    },
    {
      "line": 51,
      "value": "#When user enters invalid username"
    },
    {
      "line": 52,
      "value": "#And user enters invalid password"
    },
    {
      "line": 53,
      "value": "#And user clicks login button"
    },
    {
      "line": 54,
      "value": "#Then a warning message is displayed"
    },
    {
      "line": 55,
      "value": "#"
    },
    {
      "line": 56,
      "value": "#@TC02"
    },
    {
      "line": 57,
      "value": "#Scenario: Login with valid credentials"
    },
    {
      "line": 58,
      "value": "#Given user is on the login page"
    },
    {
      "line": 59,
      "value": "#When user enters valid username"
    },
    {
      "line": 60,
      "value": "#And user enters valid password"
    },
    {
      "line": 61,
      "value": "#And user clicks login button to login"
    },
    {
      "line": 62,
      "value": "#Then  account page is displayed"
    },
    {
      "line": 63,
      "value": "#"
    },
    {
      "line": 64,
      "value": "#@TC03"
    },
    {
      "line": 65,
      "value": "#Scenario: search for a product and add product to the cart"
    },
    {
      "line": 66,
      "value": "#Given user is on account page to do a search"
    },
    {
      "line": 67,
      "value": "#When user searches for a product"
    },
    {
      "line": 68,
      "value": "#And user gives required details in product page"
    },
    {
      "line": 69,
      "value": "#And user clicks add to cart"
    },
    {
      "line": 70,
      "value": "#Then selected product is added to cart"
    },
    {
      "line": 71,
      "value": "#"
    },
    {
      "line": 72,
      "value": "#@TC04"
    },
    {
      "line": 73,
      "value": "#Scenario: checkout product"
    },
    {
      "line": 74,
      "value": "#Given A product is added to cart"
    },
    {
      "line": 75,
      "value": "#And user proceeds to checkout page"
    },
    {
      "line": 76,
      "value": "#When user enters delivery details"
    },
    {
      "line": 77,
      "value": "#And user selects the payment method"
    },
    {
      "line": 78,
      "value": "#And user clicks confirm order"
    },
    {
      "line": 79,
      "value": "#Then product order is placed"
    },
    {
      "line": 80,
      "value": "#"
    },
    {
      "line": 81,
      "value": "#@TC05"
    },
    {
      "line": 82,
      "value": "#Scenario: change mobile number linked to acccount"
    },
    {
      "line": 83,
      "value": "#Given user is on account page and wants to change mobile number"
    },
    {
      "line": 84,
      "value": "#And user navigates to my account page to change mobile number"
    },
    {
      "line": 85,
      "value": "#When user clicks on edit account"
    },
    {
      "line": 86,
      "value": "#And user enters valid mobile number in edit box"
    },
    {
      "line": 87,
      "value": "#And user clicks continue to change mobile number"
    },
    {
      "line": 88,
      "value": "#Then mobile number is changed"
    },
    {
      "line": 89,
      "value": "#"
    },
    {
      "line": 90,
      "value": "#@TC06"
    },
    {
      "line": 91,
      "value": "#Scenario: change currency type"
    },
    {
      "line": 92,
      "value": "#Given user is on account page and wants to change currency type"
    },
    {
      "line": 93,
      "value": "#When user chooses the required curency in dropdown box"
    },
    {
      "line": 94,
      "value": "#Then required currency is selected"
    },
    {
      "line": 95,
      "value": "#"
    },
    {
      "line": 96,
      "value": "#@TC07"
    },
    {
      "line": 97,
      "value": "#Scenario: add product to cart from categories"
    },
    {
      "line": 98,
      "value": "#Given user is on account page to select a product"
    },
    {
      "line": 99,
      "value": "#When user navigates to product page by clicking on the product"
    },
    {
      "line": 100,
      "value": "#And user enters the details of the product"
    },
    {
      "line": 101,
      "value": "#And user clicks on add to cart"
    },
    {
      "line": 102,
      "value": "#Then product gets added to cart"
    },
    {
      "line": 103,
      "value": "#"
    },
    {
      "line": 104,
      "value": "#@TC08"
    },
    {
      "line": 105,
      "value": "#Scenario: check the product in cart"
    },
    {
      "line": 106,
      "value": "#Given user is on account page and wants to check the cart"
    },
    {
      "line": 107,
      "value": "#And user navigates to cart page"
    },
    {
      "line": 108,
      "value": "#When user checks the product in the cart"
    },
    {
      "line": 109,
      "value": "#Then confirms product is present or not"
    },
    {
      "line": 110,
      "value": "#"
    },
    {
      "line": 111,
      "value": "#@TC09"
    },
    {
      "line": 112,
      "value": "#Scenario: user want to change account password"
    },
    {
      "line": 113,
      "value": "#Given user is on account page and wants to change password"
    },
    {
      "line": 114,
      "value": "#And user navigates to my account page to change password"
    },
    {
      "line": 115,
      "value": "#When user clicks password"
    },
    {
      "line": 116,
      "value": "#And user gives valid password"
    },
    {
      "line": 117,
      "value": "#And user clicks continue to change password"
    },
    {
      "line": 118,
      "value": "#Then account password is changed"
    },
    {
      "line": 119,
      "value": "#"
    },
    {
      "line": 120,
      "value": "#@TC10"
    },
    {
      "line": 121,
      "value": "#Scenario: user want to subscribe to newsletter"
    },
    {
      "line": 122,
      "value": "#Given user is on account page and wants to subscribe newsletter"
    },
    {
      "line": 123,
      "value": "#And user navigates to my account page to subscribe newsletter"
    },
    {
      "line": 124,
      "value": "#When user clicks newsletter"
    },
    {
      "line": 125,
      "value": "#And user clicks yes"
    },
    {
      "line": 126,
      "value": "#And user clicks submit to subscribe"
    },
    {
      "line": 127,
      "value": "#Then newsletter is subscribed"
    }
  ],
  "line": 130,
  "name": "add product to wishlist",
  "description": "",
  "id": "opencart;add-product-to-wishlist",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 129,
      "name": "@TC11"
    }
  ]
});
formatter.step({
  "line": 131,
  "name": "user is on account page and wants to add a product to wishlist",
  "keyword": "Given "
});
formatter.step({
  "line": 132,
  "name": "user navigates to product page by selecting a product",
  "keyword": "When "
});
formatter.step({
  "line": 133,
  "name": "user clicks add to wishlist",
  "keyword": "And "
});
formatter.step({
  "line": 134,
  "name": "product is added to wishlist",
  "keyword": "Then "
});
formatter.match({
  "location": "addtowishlist.user_is_on_account_page_and_wants_to_add_a_product_to_wishlist()"
});
formatter.result({
  "duration": 34155851185,
  "status": "passed"
});
formatter.match({
  "location": "addtowishlist.user_navigates_to_product_page_by_selecting_a_product()"
});
formatter.result({
  "duration": 2563353606,
  "status": "passed"
});
formatter.match({
  "location": "addtowishlist.user_clicks_add_to_wishlist()"
});
formatter.result({
  "duration": 354614790,
  "status": "passed"
});
formatter.match({
  "location": "addtowishlist.product_is_added_to_wishlist()"
});
formatter.result({
  "duration": 1604324031,
  "status": "passed"
});
formatter.scenario({
  "line": 137,
  "name": "compare product in wishlist",
  "description": "",
  "id": "opencart;compare-product-in-wishlist",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 136,
      "name": "@TC12"
    }
  ]
});
formatter.step({
  "line": 138,
  "name": "user is on account page and wants to compare a product in the wishlist",
  "keyword": "Given "
});
formatter.step({
  "line": 139,
  "name": "user clicks wishlist",
  "keyword": "And "
});
formatter.step({
  "line": 140,
  "name": "user compares product in wishlist",
  "keyword": "When "
});
formatter.step({
  "line": 141,
  "name": "selected product is compared",
  "keyword": "Then "
});
formatter.match({
  "location": "comparewishlist.user_is_on_account_page_and_wants_to_compare_a_product_in_the_wishlist()"
});
formatter.result({
  "duration": 40369505220,
  "status": "passed"
});
formatter.match({
  "location": "comparewishlist.user_clicks_wishlist()"
});
formatter.result({
  "duration": 4056204418,
  "status": "passed"
});
formatter.match({
  "location": "comparewishlist.user_compares_product_in_wishlist()"
});
formatter.result({
  "duration": 32192083033,
  "status": "passed"
});
formatter.match({
  "location": "comparewishlist.selected_product_is_compared()"
});
formatter.result({
  "duration": 748773356,
  "status": "passed"
});
});