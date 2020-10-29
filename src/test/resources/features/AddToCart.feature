@wip

Feature: VERIFYING ALL STANCES OF "ADDTOCART" GOES TO SHOPPING CART SUMMARY

  Background:
    Given the user is on the home page and search for "PRINTED CHIFFON DRESS"


  Scenario: Verify that the user would be able to PROCEED TO CHECKOUT for STANCE1 and verify the final price inside the cart
    When the user is selecting the "PRINTED CHIFFON DRESS" PICTURE  directly
    And  visiting the selected product page is choosing "ADDTOCART" option
    Then the user is about to choose "PROCEED TO CHECKOUT" from the Layer Cart Dialog
    And  verifying the TOTAL price is correct

  Scenario: Verify that the user would be able to PROCEED TO CHECKOUT for STANCE2 and verify the final price inside the cart
    When the user is holding over the "PRINTED CHIFFON DRESS" PICTURE and press "ADDTOCART"
    Then the user is about to choose "PROCEED TO CHECKOUT" from the Layer Cart Dialog
    And  verifying the TOTAL price is correct
  @wip1
  Scenario: Verify that the user would be able to PROCEED TO CHECKOUT for STANCE3 and verify the final price inside the cart
    When the user is holding over the "PRINTED CHIFFON DRESS" PICTURE and press "QUICKVIEW" option
    And  visiting the selected product iFrame Fancybox is choosing "ADDTOCART" option
    Then the user is about to choose "PROCEED TO CHECKOUT" from the Layer Cart Dialog
    And  verifying the TOTAL price is correct



