# ATLANTBH PROJECT

In this framework, I have 13 test cases. I implemented Behavior Driven Development/Cucumber approach to implement my smoke testing. I used Page Object Model to store my WebElements, I used Maven as a build automation tool where it comes with its default pom.xml file, It allowed me to store & manage dependencies. I used Gherkin Language in my feature files. 

I created specific utilities such as Driver, ConfigurationReader. I used encapsulation to reach my driver which is one of the OOP concepts. I used getDriver method. In that method, driver name is declared from configuration.properties file with the help of getProperty method which comes from ConfigurationReader utility class. 

I created a TestBase class where I store my pagefactory method. I used inheritance to initialize my locators in my pages.

### RUNNER CLASSES 

I used CukesRunner class as my main RunnerClass where I'm able to run my scenarios by putting a tag above them. I used CucumberReports plugin to see my results for my test scenarios online. I provided the path of my feature directory so that my runner can find my feature files. I provided a path for my step definitions where I store my Java codes. At the end it automatically combines my Java code and my feature file to run my tests. I also provide tags to declare which scenarios will be running. 

I also have FailedTestRunner class where it allows me to run only the tests that have failed. I provided a path for my step definitions again. I also provided a path for my rerun.txt file where it only displays when there is a scenario failed. This allows me to run only the tests that have failed. Which is time saving for tests such as Smoke and Regression. If any of my scenario fails, I have a screenshot method stored in my After method (Hooks class)

### METHODS AND LIBRARIES USED

In these tests I have used Selenium WebDriver and Java. I implemented many methods from different libraries & classes: 

Selenium WebDriver: 
getCurrentUrl(); 
click(); 
getText(); 
sendKeys(); 
Select class (selectByVisibleText(), selectByValue())
WebDriverWait

Java:
foreach loop
List<WebElements>
Inheritance
Encapsulation

actions class: 
moveToElement().perform;

String class: 
contains

Java Faker: 
username 
email address
password
address
first name
last name
phone number

Annotations:
@Findby
@Before
@After

Assertions: 
JUnit
assertTrue();
assertEquals();

### JENKINS
I also used Jenkins to take advantage of a cloud automation server for my smoke testing. I created my EC2 console on AWS. Then I build my Jenkins job where it runs every day at 6 in the morning. I got the results of my test cases on my email as cucumber reports. 