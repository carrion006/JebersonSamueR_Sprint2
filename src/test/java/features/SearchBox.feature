Feature: Searchbox Action
 
 Scenario Outline: Validating searchbox element
    	Given user is on browser
    		When user clicks on searchbox
    			And user enters a movie name<name>
    					Then movie appears successfully
    	Examples:
    	|name|
    	|venom|
    	
  Scenario Outline: Validating invalid searchbox element
    	Given user is on browser
    		When user clicks on searchbox
    			And user enters a movie name<name>
    					Then movie appears successfully
    	Examples:
    	|name|
    	|aabddgbdh|