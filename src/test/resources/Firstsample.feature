Feature: Frontend comparing products

  As a customer
  Consumer want to compare products
  So that consumer can compare data between the selected products

  @NOPCOM-2
  Scenario:Consumer should me able to select and  Comparing Products
         Background :consumer should be logged in
         Given consumer is in home page
         When  consumer selects a product
         And   click  Add to Compare list
         Then  Consumer can compare products

  Scenario:Consumer should be able to select and  Email Products to a friend

    Given consumer is in home page
    When  consumer selects a product
    And   click  Add to Compare list
    Then  Consumer can Email that to a friend


  Scenario:Consumer should be able to select the  Recently Viewed Products option

    Given consumer is in home page
    When  consumer selects the Recently Viewed Products option
    And   enable it in the Administration Area by selecting Configuration > Global Settings
    Then  Consumer can view The number of recently viewed products

  Scenario:Consumer should be able to add products to your shopping cart:

    Given consumer is in home page
    When  Consumer add items to the shopping cart
    And   Consumer can enter the number of items to add and click
    Then  The  Shopping Cart icon is updated on the toolbar
    Then  Consumer can view The product in shopping cart

