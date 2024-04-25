Feature: Purchase mobile functionality of netify 
Scenario: Verify order id on  placing the order
When When click on shopnow button 
And Click Products under Hairproducts
And Click Hair BeautyPath Link
And Click Addto Cart button
And Click on the cart button
And Click Checkout Button
And Select the Shipping Method
And Click Make payment button
Then Verify orderid and printorder id 