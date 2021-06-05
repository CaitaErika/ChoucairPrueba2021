# Author Erika Isabel Caita Avila
  @stories
  Feature: Academy Choucair
    As a User, I want to learn how to automate in screenplay at the choucair Academy with the automation course
    @scenario1
    Scenario: Search for automation course
      Given than santiago wants to learn automation at the academy choucair
      | strUser    | strPassword   |
      | 1020750889 | Choucair2021* |
      When he search for the course on the choucair academy platform
      | strCourse         |
      | Foundation Level  |
      Then he finds the course called
      | strCourse        |
      | Foundation Level |

