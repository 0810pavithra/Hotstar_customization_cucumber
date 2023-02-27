
Feature: Search for Hotstar feature.

  Scenario Outline: Verify that the user can able to search
    Given The user navigates to the home page.
    When The user enter  the search as "<searchfields>" .
    Then The result should be display.
    Examples:
    |searchfields|
    |TV          |
    |Sports      |

  Scenario: Verify that the user can able to search a movies
    Given The user navigates to the home page.
    When The user enter  the movies name.
    Then The movies result should be display

  Scenario: verify that user able to access the Channels successfully.
    Given The user need to clicked the menu list,categories should be visible.
    When The user clicked the  Channels should be displayed.
    Then Then user can selected the Channels.

  Scenario: verify that user able to access the Languages successfully.
    Given The user need to clicked the menu list,categories should be visible.
    When The user clicked the Languages list should be displayed.
    Then Then user can selected the Languages.

  Scenario: verify that user able to access the Genres successfully.
    Given The user need to clicked the menu list,categories should be visible.
    When The user clicked the Genres list should be displayed.
    Then Then user can selected the movies.

  Scenario: verify that user able to access the kids successfully.
    Given The user clicked the kids,it will move to kids section.
    When The user enter  the kids movies name.
    And  The kids movies result should be display.
    Then Get back to the home page.


  Scenario: verify that user able to Login with empty credentials.
    Given The user navigates to the home page.
    When The user need to clicked login button.
    Then The user pressed the enter key with empty string








