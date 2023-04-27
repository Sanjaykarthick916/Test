Feature: Booking a hotel

Scenario: Login adaction home page
	Given Need to launch the url
	When need to given the user name
	And need to given passowrd
	Then click the login button
	
Scenario: Search the hotel
	Given User navigate to hotel serach page
	When User select the loction of the hotel
	And User select the hotels
	And User select the room type
	And User select the number of rooms
	And User select the check in date
	And User select the check out date
	And User select the adults for the room
	And User select the childern for the room
	Then need to enter the search button
 

