Feature: Volkswagen Financial Services feature

  Scenario: Volkswagen Driver Away Insurance Test

    Given user on vwfsinsuranceportal page

    When user enters vehicle registration number

    And  Clicks Find Vehicle button

    Then it displays result for registered vehicle