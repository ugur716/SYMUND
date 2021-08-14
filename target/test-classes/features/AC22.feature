@SYMU-301
Feature: 

	#{color:#00875a}*User Story :* {color}
	#
	#As a user, I should be able to login.
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criteria:_*{color}
	#
	#*1-User can login with valid credentials* 
	#2-User can not login with any invalid credentials
	#3-User can see the password in a form of dots by default
	#4-User can see the password explicitly if needed
	#5-User can see an option link like "forgot password" on the login page to be able to reset the password
	#6-User can see valid placeholders on Username and Password fields
	@SYMU-300
	Scenario: As a user, I should be able to login.
		Given the user on the login page
		When the user enter valid credentials
		Then the user should be login with push enter
		And user should be land on the dashboard page
		And username should be seen under profile icon	

	#{color:#00875a}*User Story :* {color}
	#
	#As a user, I should be able to login.
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criteria:_*{color}
	#
	#1-User can login with valid credentials 
	#*2-User can not login with any invalid credentials*
	#3-User can see the password in a form of dots by default
	#4-User can see the password explicitly if needed
	#5-User can see an option link like "forgot password" on the login page to be able to reset the password
	#6-User can see valid placeholders on Username and Password fields
	#
	#{color:#de350b} {color}
	@SYMU-313
	Scenario: Verify that user can not login with any invalid credentials
		Given the user on the login page
		When user enter invalid credentials
		Then the user should be login with click login
		And user should be see error message