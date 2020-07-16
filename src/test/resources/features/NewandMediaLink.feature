@Important
Feature: News&Media Link Functionality

  @Regression
  Scenario: Verify News&Media Link Function1
    Given User is on Alexion Home Page
    When User  click on NEWS&MEDIA Link
    Then NEWS&MEDIA page should be displayed
    And User selects option from NEWS CATEGORY dropdown and Year from YEAR dropdown
    When User click on Filter button
    Then User selected Year News should be displayed on the same page

  @Smoke
  Scenario: Our Research Link Function2
    Given User launched Alexion WebPage
    When User clik on Our Research Link
    Then Our Research Link should display

  @Smoke
  Scenario: Our Research Link Function3
    Given User launched Alexion WebPage
    When User clik on Our Research Link
    Then Our Research Link should display

  @Regression
  Scenario: Our Research Link Function4
    Given User launched Alexion WebPage
    When User clik on Our Research Link
    Then Our Research Link should display
