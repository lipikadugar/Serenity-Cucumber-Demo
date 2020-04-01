Feature: Search for TV Show

Scenario: As a new user, I would like to navigate to the TV Show Category and search for a specific TV Show
    Given I click on the Menu button
    And I click on Top Rated Shows
    And I search for "Game of Thrones"
    When I select "Game of Thrones: The Last Watch" link from the suggestion window
    Then the title should be "Game of Thrones: The Last Watch", number of reviews should be "5253" and rating should be "7.2"


