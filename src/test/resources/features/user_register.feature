Feature: Register a user on the website
  As website
  I need to have a registration module
  For users visiting the website

  @SuccessfulRegistration
  Scenario:Successful registration
    Given the user is on the website and wishes to register
    When the user finishes correctly entering the information for the registration
      | name    | lastname | email              | dateOfBirth | city     | postalCode | country  | password        |
      | william | betancur | william1@gmail.com | 09/11/1992  | Medellin | 0500100    | Colombia | Medellin1913*** |
    Then he will see the message Welcome to the world's largest community of freelance software testers!
