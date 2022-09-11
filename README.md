Documentation
-------------

This project contains a Selenium WebDriver test application using Junit and Maven.
It contains six tests: all of them should pass.

Requirements
-------------

- Requirements : Java 8 or higher, Maven
- Browser: tests are runnable in Chrome.

Execution
-------------
LogIn Test:
```
mvn test -Dtest=LogInTest#successfulLogInTest
```
LogOut test:
```
mvn test -Dtest=LogOutTest#successfulLogOutTest
```
Navigate to Assets Page test:
```
mvn test -Dtest=GoToAssetsTest#navigateToAssetsPageTest
```
Upload public asset test:
```
mvn test -Dtest=UploadAssetsTest#uploadPublicAssetTest
```
Upload private asset test:
```
mvn test -Dtest=UploadAssetsTest#uploadPrivateAssetTest
```
Replace asset test:
```
mvn test -Dtest=ReplaceAssetTest#replaceAssetTest
```
Run all tests:
```
mvn clean test 
```