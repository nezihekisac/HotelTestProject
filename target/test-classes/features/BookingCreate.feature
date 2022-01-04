Feature:Booking


  @Test1
    Scenario Outline: Entering valid info into Firstname and Surname fields

    When User navigates to Firstname field
    And User clicks on the Firstname field
    Then User should be able to enter valid "<firstname>" info
    When User navigates to Surname field
    And User clicks on the Surname field
    Then User should be able to enter valid  and "<surname>" info

    Examples:
    | firstname          | surname               |
    |    Jack            |   Beans               |
    |    jack            |   beans               |
    |    JACK            |   beans               |
    |    jack            |   BEANS               |
    |    JACK            |   BEANS               |


    @Test2
    Scenario Outline: Entering invalid info into Firstname and Surname fields

      When User navigates to Firstname field with invalid info
      And User clicks on the Firstname field with invalid info
      Then User should not be able to enter invalid frstname"<firstname2>" info
      When User navigates to Surname field with invalid info
      And User clicks on the Surname field with invalid info
      Then User should not be able to enter invalid  surname "<surname2>" info

      Examples:
        | firstname2        | surname2          |
        |                   |                   |
        |   rose3           |     sparkle34     |
        |   M               |     s             |
        |   1234            |     1345          |
        |   (*&^            |     @£+_-         |


  @Test3
  Scenario Outline: Entering valid info into Price field

    When User navigates to Price field
    And User clicks on the Price field
    Then User should be able to enter valid price vprc "<price>" info

    Examples:
    | price       |
    |  1          |
    |  1.2        |
    |  1234567890 |
    |  0.60       |


  @Test4
  Scenario Outline: Entering invalid info into Price field

    When User navigates to Price field with invalid info
    And User clicks on the Price field with invalid info
    Then User should not be able to enter invalid prc"<price>" info

    Examples:
      | price       |
      | a           |
      | adf         |
      | ,           |
      |  .          |
      |  2$         |
      |  56.        |
      |  .5         |
      |  !@@£-     |
      |  3  5       |
      |  3 4        |

  @Test5
  Scenario: Selecting both options from the Deposit Select button

    When User navigates to Deposit field
    And User clicks on the Deposit field
    And User clicks on true option on the selection
    Then User should be able to see true option is selected
    And User clicks on false option on the selection
    Then User should be able to see false option is selected


  @Test6
    Scenario Outline: Making booking with valid check-in,check-out dates

    When User navigates to the check-in
    And User clicks on the check-in
    And User hovers over on the check-in date picker
    Then User should be able to click the valid checkin"<check-in>" date
    When User navigates to the check-out
    And User clicks on the check-out
    And User hovers over on the check-out date picker
    Then User should be able to click the valid checkout"<check-out>" date

    Examples:
      |  check-in          |check-out         |
      |  2021-12-03 now    |  2021-12-03 now  |
      |  2021-12-03 now    |  2021-12-05 ftr  |
      |  2021-12-05 ftr    |  2021-12-08 ftr  |


  @Test7
  Scenario Outline:Making booking with invalid check-in ,check-out dates

    When User navigates to the check-in field
    And User clicks on the check-in field
    And User hovers over on the check-in date picker field
    Then User should not be able to click the invalid check-in "<check-in>" date
    When User navigates to the check-out field
    And User clicks on the check-out field
    And User hovers over on the check-out date picker field
    Then User should not be able to click the invalid check-out "<check-out>" date


    Examples:
      |  check-in          |check-out         |
      |   2021-12-01 bf    | 2021-12-03 now   |
      |   2021-12-01 bf    |                  |
      |                    | 2021-01-03  now  |
      |                    |                  |
      |   2021-12-03 now   | 2021-12-01 bf    |
      |   2021-12-01 bf    |  2021-12-02 bf   |
      |   2021-12-01 bf    |  2021-12-05 ftr  |
      |    2021-12-05 ftr  |  2021-12-03 now  |
      |    2021-12-05 ftr  |   2021-12-01 bf  |
      |    2021-12-03 now  |                  |
      |                    | 2021-12-05 ftr   |
      |  --                |   2021-12-05 ftr |
      |  123               |   2021-12-05 ftr |
      |  2021-12-03 now    |  1234            |
      |   2021-12-03 now   |   ---            |





