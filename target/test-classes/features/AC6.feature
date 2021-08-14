Feature:

	#{color:#00875a}*User Story :* {color}
	#
	#As a user, I should be able to login.
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criteria:_*{color}
	#
	#1-User can login with valid credentials 
	#2-User can not login with any invalid credentials
	#3-User can see the password in a form of dots by default
	#4-User can see the password explicitly if needed
	#5-User can see an option link like "forgot password" on the login page to be able to reset the password
	#*6-User can see valid placeholders on Username and Password fields*
	@SYMU-368
	Scenario Outline: Verify that user can see valid valid placeholders on Username and Password fields
		Given the user on the login page
		Then "<title>" place holders should be seen

		Examples:
			| title |
			|Username or email|
			|Password         |
		