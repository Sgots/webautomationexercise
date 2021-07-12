$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("placeanorder.feature");
formatter.feature({
  "line": 1,
  "name": "Place an order",
  "description": "",
  "id": "place-an-order",
  "keyword": "Feature"
});
formatter.before({
  "duration": 18528214700,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Verify successful placement of any order",
  "description": "",
  "id": "place-an-order;verify-successful-placement-of-any-order",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smk"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on Homepage of the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User navigates to login page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User fills registration details",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Verify registered user on homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User selects \"Printed Summer Dress\" from homepage",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Verify selected product on the product detail page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User adds item to the cart from product detail page",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Verify \"Printed Summer Dress\" product on cart page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User proceeds to checkout from Cart page",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User verifies product details on Summary page",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User clicks on proceed to checkout button on Summary page",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Verify \"Billing Address\" address on Address confirmation page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User clicks on proceed to checkout button on Address confirmation page",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Verify terms of service on Shipping page",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "User click on agree button on Shipping page",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User click on proceed to checkout on Shipping page",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Verify product details on Payment page",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "select \"Pay by check\" as payment method on Payment page",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "Verify selected payment method on payment page",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "User clicks on confirm my order button on payment page",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "Verify order details on order confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 940639200,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.verifyUserIsonLoginPage()"
});
formatter.result({
  "duration": 4445857700,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageSteps.user_fills_registration_details()"
});
formatter.result({
  "duration": 11215141800,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.verifyRegisteredUserOnHomepage()"
});
formatter.result({
  "duration": 109131700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Printed Summer Dress",
      "offset": 14
    }
  ],
  "location": "HomePageSteps.user_selects_from_homepage(String)"
});
formatter.result({
  "duration": 10628161700,
  "status": "passed"
});
formatter.match({
  "location": "ProductDetailsPageSteps.verify_selected_item_on_item_detail_page()"
});
formatter.result({
  "duration": 1081226900,
  "status": "passed"
});
formatter.match({
  "location": "ProductDetailsPageSteps.user_adds_item_in_cart()"
});
formatter.result({
  "duration": 153183400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Printed Summer Dress",
      "offset": 8
    }
  ],
  "location": "CartPageSteps.verifyProductOnCartPage(String)"
});
formatter.result({
  "duration": 1246082100,
  "status": "passed"
});
formatter.match({
  "location": "CartPageSteps.user_proceeds_to_checkout_from_Order_page()"
});
formatter.result({
  "duration": 2943069300,
  "status": "passed"
});
formatter.match({
  "location": "SummaryPageSteps.user_verifies_product_details_on_Summary_page()"
});
formatter.result({
  "duration": 1835085400,
  "status": "passed"
});
formatter.match({
  "location": "SummaryPageSteps.user_clicks_on_proceed_to_checkout_button_on_Summary_page()"
});
formatter.result({
  "duration": 2242481100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Billing Address",
      "offset": 8
    }
  ],
  "location": "AddressConfirmationSteps.verify_address_on_Address_confirmation_page(String)"
});
formatter.result({
  "duration": 3463801500,
  "status": "passed"
});
formatter.match({
  "location": "AddressConfirmationSteps.user_clicks_on_proceed_to_checkout_button_on_Address_confirmation_page()"
});
formatter.result({
  "duration": 2682633000,
  "status": "passed"
});
formatter.match({
  "location": "ShippingPageSteps.verify_terms_of_service_on_Shipping_page()"
});
formatter.result({
  "duration": 88826100,
  "status": "passed"
});
formatter.match({
  "location": "ShippingPageSteps.user_click_on_agree_button_on_Shipping_page()"
});
formatter.result({
  "duration": 30636263200,
  "status": "passed"
});
formatter.match({
  "location": "ShippingPageSteps.user_click_on_proceed_to_checkout_on_Shipping_page()"
});
formatter.result({
  "duration": 3347008100,
  "status": "passed"
});
formatter.match({
  "location": "PaymentPageSteps.verify_product_details_on_Payment_page()"
});
formatter.result({
  "duration": 1043062200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pay by check",
      "offset": 8
    }
  ],
  "location": "PaymentPageSteps.select_as_payment_method_on_Payment_page(String)"
});
formatter.result({
  "duration": 2347263600,
  "status": "passed"
});
formatter.match({
  "location": "PaymentPageSteps.verify_selected_payment_method_on_payment_page()"
});
formatter.result({
  "duration": 95700,
  "status": "passed"
});
formatter.match({
  "location": "PaymentPageSteps.user_clicks_on_confirm_my_order_on_payment_page()"
});
formatter.result({
  "duration": 3136038100,
  "status": "passed"
});
formatter.match({
  "location": "OrderConfirmationPageSteps.verifyOrderConfirmationDetails()"
});
formatter.result({
  "duration": 85159600,
  "status": "passed"
});
formatter.after({
  "duration": 1580036300,
  "status": "passed"
});
});