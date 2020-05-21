#Cucumber Page Objects

For this project, I used Junit and Cucumber. Using cucumber we can have Behavior Data-Driven Tests, which makes it possible for the stakeholders to have a better understanding of what we test.


## Framework
* Selenium WebDriver
* Junit
* Hamcrest
* Cucumber
* Cluecucumber


### How to use it
To copy this project run the following command in the command line:
```sh
git clone https://github.com/ccmenezes/cucumber-page-objects.git

cd cucumber-page-objects

mvn install
```

### Project structure
As a Maven project we have the source folder with main and test folders. 

In the main folder there's java that contains the enum, with some information that I used in differents parts. Page Objects that's responsible
to interact with the page elements by page, util that's make possible to handle the browser capabilities and the resources that contain the browser drivers.

In the test we have the steps that is responsible to join the action from the feature, and the web pages.


### To perform the tests
```shGo to src/test/java RunCucumberTest.java
Run your tests and once this is done navigate to the terminal:

Type mvn cluecumber-report:reporting

After performing the test open the report at target/generated-report/index.html, right-click Open in Browser.
```

References:

https://en.wikipedia.org/wiki/Behavior-driven_development

https://cucumber.io/

https://github.com/trivago/cluecumber-report-plugin


