Feature: Rest Based Calculator Application
	
	Scenario: Addition 
		Given rest api "http://localhost:8090/api/addition/?first=10&second=20"
		When I invoke api
		Then expected result 30.0


	Scenario: Substraction 
		Given rest api "http://localhost:8090/api/substraction/?first=10&second=20"
		When I invoke api
		Then expected result -10.0


	Scenario: Multiply 
		Given rest api "http://localhost:8090/api/multiply/?first=10&second=20"
		When I invoke api
		Then expected result 200.0
