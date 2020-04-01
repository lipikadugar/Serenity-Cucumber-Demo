Feature: Search for TV Show

Scenario: As a new user, I would like to navigate to the TV Show Category and search for a specific TV Show
    Given I click on the Menu button
    And I click on Top Rated Shows
    And I search for Game of Thrones
    When I select Game of Thrones: The Last Watch’ link from the suggestion window
    Then I should abbe able to verify tile, rating and number of reviews


