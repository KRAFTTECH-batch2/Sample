Feature: Login Functionality Test

  Background:
    Given The user is on the login page

  Scenario: The user should be login with valid credentials
    When The user should fill in valid credentials
    Then The user should be able to login


  Scenario: The user should be login with parameters
    When The user should input "krafttest@proje.com" and "test123"
    Then The user should be able to login

  @login
  Scenario Outline: The user should not login when any or none of the credentials is filled in
    # valid email: krafttest@gmail.com / valid password: kraft123
    When The user should input "<email>" and "<password>"
    Then The user should be able to see warning message as "<message>"
    Examples:
      | email               | password | message                                               |
      |                     |          | Warning: No match for E-Mail Address and/or Password. |
      | krafttest@gmail.com |          | Warning: No match for E-Mail Address and/or Password. |
      |                     | kraft123 | Warning: No match for E-Mail Address and/or Password. |


  Scenario Outline: The user should be login with VALID EMAIL - INVALID PASSWORD
    # valid email: krafttest@proje.com / valid password: test123
    When The user should input "<email>" and "<password>"
    Then The user should be able to see warning message as "<message>"
    Examples:
      | email               | password | message                                               |
      | krafttest@proje.com | test12   | Warning: No match for E-Mail Address and/or Password. |
      | krafttest@proje.com | est123   | Warning: No match for E-Mail Address and/or Password. |
      | krafttest@proje.com | test-123 | Warning: No match for E-Mail Address and/or Password. |
      | krafttest@proje.com | *test123 | Warning: No match for E-Mail Address and/or Password. |


  Scenario Outline: The user should be login with INVALID EMAIL - VALID PASSWORD
    # valid email: krafttest@gmail.com / valid password: kraft123
    When The user should input "<email>" and "<password>"
    Then The user should be able to see warning message as "<message>"
    Examples:
      | email              | password | message                                               |
      | krafttes@gmail.com | kraft123 | Warning: No match for E-Mail Address and/or Password. |
      | rafttest@gmail.com | kraft123 | Warning: No match for E-Mail Address and/or Password. |
      | krafttest@gmailcom | kraft123 | Warning: No match for E-Mail Address and/or Password. |
      | krafttest@gmail.co | kraft123 | Warning: No match for E-Mail Address and/or Password. |


  Scenario Outline: The user should try to login MORE THAN 5 TIMES with INVALID PASSWORD
      # valid email: krafttest@yahoo.com / valid password: 123test
    When The user should input "<email>" and "<password>"
    Then The user should be able to see warning message as "<message>"
    Examples:
      | email               | password         | message                                                                                          |
      | krafttest@yahoo.com | invalid password | Warning: No match for E-Mail Address and/or Password.                                            |
      | krafttest@yahoo.com | invalid password | Warning: No match for E-Mail Address and/or Password.                                            |
      | krafttest@yahoo.com | invalid password | Warning: No match for E-Mail Address and/or Password.                                            |
      | krafttest@yahoo.com | invalid password | Warning: No match for E-Mail Address and/or Password.                                            |
      | krafttest@yahoo.com | invalid password | Warning: No match for E-Mail Address and/or Password.                                            |
      | krafttest@yahoo.com | 123test          | Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour. |
      | krafttest@yahoo.com | 123test          | Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour. |