# abh-technical
This test demonstrates how to use Selenium WebDriver with Java to automate the process of searching for a company ("Atlantbh") on the Navigator website and verifying its address.
The test is basic without any major code complexity.
I've decided to identify this as a Smoke test because Navigator is an application that relies on the crucial functionality of searching for streets and places.
If the search doesn't work, the application is unusable.

**Technologies used:**
- Selenium: A framework for automating web browsers.
- Java: A Programming language used to write the automation script.
- ChromeDriver: WebDriver implementation for Google Chrome.
- WebDriverWait: Used to wait for certain conditions before proceeding with further actions (such as waiting for an element to be clickable or visible).

**Pre-conditions:**
- Java Development Kit (JDK)
- Make sure you have JDK 8 or above installed.
- Maven (Optional, if using Maven for dependency management)
- Install Maven if you're managing dependencies using Maven.
- Chrome WebDriver
- Download the correct ChromeDriver version based on your Chrome browser version.
- Place the downloaded chromedriver.exe in a suitable location on your system.
- Selenium WebDriver Library
- Ensure that the selenium-java dependency is added to your project.

**Setup:**
- Clone this repository to your local machine using the following command: https://github.com/VuduPopaj/abh-technical.git
- Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse, VS Code).
- If you are using Maven, ensure that Maven dependencies are correctly downloaded. You can do this by running: mvn clean install
- Set the path to your ChromeDriver in the Java code. 
  In the firstTest.java file, replace the path in the System.setProperty() method with the correct path to your chromedriver.exe:
  System.setProperty("webdriver.chrome.driver", "C:/chromedriver-win64/chromedriver-win64/chromedriver.exe");

**Running the test:**
- Open your terminal or command prompt and navigate to the project directory.
- Compile and run the firstTest.java file using your IDE.
- The script will open Google Chrome and execute the test on the https://www.navigator.ba website.
