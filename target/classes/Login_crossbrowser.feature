Feature: User should verify signin page in amazon site

  @InvalidUserName
  Scenario Outline: Validating Invalid USERNAME in Amazon website
    Given User should launch the "<Browser>"
    And User should launch the Amazon website
    And User should click the signIn Link
    And User should enter invalid username "<UserName>"
    Then User should verify the Username credentials

    Examples: 
      | UserName  | Browser |
      | 979111177 | chrome  |
      | 979111177 | edge    |
      | 979111177 | firefox |

  @InvalidPassword
  Scenario Outline: Validating Invalid PASSWORD in Amazon website
    Given User should launch the "<Browser>"
    And User should launch the Amazon website
    And User should click the signIn Link
    And User should enter valid username "<username>" and Invalid password "<Password>"
    Then User should verify the password credentials

    Examples: 
      | username   | Password | Browser |
      | 9976188853 | 99878933 | chrome  |
      | 9976188853 | 99878933 | edge    |
      | 9976188853 | 99878933 | firefox |

  @validLogin
  Scenario Outline: Validating valid USERNAME and Valid password in Amazon website
    Given User should launch the "<Browser>"
    And User should launch the Amazon website
    And User should click the signIn Link
    And User should enter valid username "<UserName>" and password "<Password>"
    Then User should verify the homePage

    Examples: 
      | UserName   | Password   | Browser |
      | 9976188853 | 9788188673 | chrome  |
      | 9976188853 | 9788188673 | edge    |
      | 9976188853 | 9788188673 | firefox |
