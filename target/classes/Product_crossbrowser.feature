Feature: To search and verify the product in amazon site
   
   @TestIkigaibook
    Scenario Outline: User Searching ikigai book 
    Given User should launch the "<Browser>"
    And User should launch the Amazon website
    And user click on the categories drop down and user select on the book option 
    And user enter the "<Bookname>" on search box
    And user click the search button 
    And user select  the ikigai book 
    Then user click on  add to cart button and It Navigate to add to cart page
    
    
     Examples: 
      | Browser|Bookname|
      | chrome | ikigai|
      | edge   | ikigai|
   
    @TestUnavailabilty
    Scenario: User enters invalid book name in search box and get unavailability 
    Given User should launch the "<Browser>"
    And User should launch the Amazon website
    When user enters the "<BookName>" on search box
    And user click on search button
    Then user verify the book name
    
    Examples: 
      | BookName | Browser|
      | ikai     | chrome | 
      | ikai     | edge   | 
      | ikai     | firefox|
    
     