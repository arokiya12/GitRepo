Feature: Purchase mobile functionality of netify 
Scenario Outline: Verify order id on  placing the order
Given launch the browser
And Load the Url
When When click on first mobile phone 
And Click on Add to cart
And Accepting the alert
And Click on the Cart link
And Click 'Place Order'
And Enter the name as <name>
And Enter the credit card number as <creditcardnumber>
And Click on the purchase button
Then Verify order ID

Examples:
|name|creditcardnumber|
|Arun|234567889990|
|Gokul|89876655667|