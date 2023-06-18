Feature: Product Comparison Feature

  @compare
  Scenario: The user should be able to add the products to the comparison list and compare the products
    Given The user is on the login page
    When The user should fill in valid credentials
    And the user clicks HomePage
    And The user selects a category "Television"
    And The user adds the product "Cello C1920FS 19\" LED-backlit LCD TV " to Product Comparision List
    And The user adds the product "Cello C2420G 24\" LED-backlit LCD TV " to Product Comparision List
    And The user adds the product "Cello C3220G 32\" LED-backlit LCD TV " to Product Comparision List
    And The user adds the product "Cello C4020DVB 40\" LED-backlit LCD TV " to Product Comparision List
    And The user clicks Product Comparision Button
    Then The user verifies the product "Cello C1920FS 19\" LED-backlit LCD TV" added to the Product Comparision List
    Then The user verifies the product "Cello C2420G 24\" LED-backlit LCD TV" added to the Product Comparision List
    Then The user verifies the product "Cello C3220G 32\" LED-backlit LCD TV" added to the Product Comparision List
    Then The user verifies the product "Cello C4020DVB 40\" LED-backlit LCD TV" added to the Product Comparision List





