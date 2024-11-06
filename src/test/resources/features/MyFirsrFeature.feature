
@tag
Feature: Search Functionality

	@tag1
  Scenario: want to add two number
    Given I have two numbers 1 and 2
    When I add these numbers
		Then Result is 3
	
	@testthis
	Scenario: Test API
	  Given I have API
    When I Hit API with product id as 9132294
		Then status code comes as 200
		And json body contain product id as 9132294
	
	
	
	
	
	
	
		

