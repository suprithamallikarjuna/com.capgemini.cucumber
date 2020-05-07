Feature: Login

  Scenario: Successful login with valid credentials
    Given User opened the browser
    When user selected un and pwd at excel
    Then User clicks on login
    Then user clicks on profile
    Then user clicks on GiftCard
    Then user navigate to sendgiftcard page and click on sendgiftcard
    Then user navigate to different giftcards page and selects gift card
    Then user clicks on next button
    Then user enters  recipient email as given data in excel
    Then user enters  confirmrecipient email as given data in excel
    Then user will click on Amount
    Then user enters name in the to field as given data in excel
    Then user clicks on show preview button
    Then user clicks on pay button
    Then user navigate to payment page and click on the phonepe/googlepay/bhmiupi
    Then user selects the phonpe
    Then user selects the paynow button
