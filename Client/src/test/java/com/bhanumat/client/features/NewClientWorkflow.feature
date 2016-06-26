Feature: 
  As a User
  I want to be able to add new clients in the system
  So that I can add accounting data to that client

  Scenario: Sign up a new user
    Given the user is on landing page
    When she chooses to sign up
    And she provides the first name as Bhanumat
    And she provides the last name as Wiwatmaikul
    And she provides the email as bhanumat2.w@gmail.com
    And she provides the password as password
    And she provides the confirm password again as password
    And she signs-up
    Then she should be logged in to the application
