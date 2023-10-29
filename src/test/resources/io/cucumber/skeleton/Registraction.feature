Feature: Rejestracja nowego uzytkownika
  Scenario: Rejestracja uzytkownika
    Given Użytkownik znajduje sie na stronie Tantis i akceptuje cookies
    When Użytkownik wpisuje imię w pole imię
    And Użytkownik wpisuje nazwisko w polu nazwisko
    And Użytkownik wpisuje e-mail w pole e-mail
    And Użytkownik wpisuje hasło w pole hasło
    And Użytkownik akceptuje regulamin
    Then Użytkownik rejestruje sie