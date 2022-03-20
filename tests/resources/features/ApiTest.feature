Feature: Sample API Test for CRUD on an object

  @FirstTestTag
  Scenario Outline: As a user, I can <action> file
    Given user is logged in
    Then user can <action> a file
    Examples:
      | action |
      | create |
      | view   |
      | update |
      | delete |
