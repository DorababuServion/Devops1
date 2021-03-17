Feature: Free CRM Login Feature

Scenario Outline: Open url of application

Given: enter vaild username"<username>" and password "<password>"
Then: enter login button
Then: enter invaild username "<username>" and password "<password>"
Then enter login button
And: vaildation of username and password

Examples:
	|username|password	|
	|3r0939q0|rkwfjkjsaf|