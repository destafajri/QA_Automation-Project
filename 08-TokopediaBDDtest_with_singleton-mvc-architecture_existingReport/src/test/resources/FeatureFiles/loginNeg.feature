Feature: Login negative test

Scenario: unregist phone numb
	Given User access the URL tokopedia
	When User move to login page
	And login with unregistered phone number
	Then User get allert "Nomor HP belum terdaftar"