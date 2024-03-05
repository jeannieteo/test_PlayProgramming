# test_Play_programming<br />
Cucumber JUnit5 Maven JAVA Selenium<br />
<br />
Folder structure<br />
--src----</span><br />
&emsp;|--main----<br />
&emsp;|--test----<br />
    &emsp;&emsp;|--actions----folder contains actions<br />
     &emsp;&emsp;&emsp;|HomePageActions.java<br />
     &emsp;&emsp;&emsp;|QuestPageActions.java<br />
    &emsp;&emsp;|--definitions----folder contains cucumber step definitions<br />
     &emsp;&emsp;&emsp;|HomePageDefinitions.java<br />
     &emsp;&emsp;&emsp;|QuestPageDefinitions.java<br />
     &emsp;&emsp;&emsp;|Hooks.java<br />
    &emsp;&emsp;|--locators----folder contains locators<br />
     &emsp;&emsp;&emsp;|HomePageLocators.java<br />
     &emsp;&emsp;&emsp;|QuestPageLocators.java<br />
    &emsp;&emsp;|--runner----folder contains runner for junit<br />
     &emsp;&emsp;&emsp;|RunnerCucumberTests.java<br />
    &emsp;&emsp;|--utils----folder contains selenium webdriver waits, inits<br />
     &emsp;&emsp;&emsp;|Helper.java<br />
