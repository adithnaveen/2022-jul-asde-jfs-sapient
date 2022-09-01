Feature: saving contact to the system 

Scenario: save with all valid details 

Given the application is running on "chrome"
When the user name "Alok"
And email address as "alok@gmail.com"
And Phone Number as "8787878787"
And picture as "/alok.png"
When clicked on submit 
Then alert message to be shown 

