##SHAUN REED IQ ASSESSMENT (RECEIVER)

IntelliJ was used while developing this maven project, using Java 8.

When cloning this project and opening in the IDE, please make sure that the maven dependencies are imported, when that is done you may run the project
***
###NB:
###MAKE SURE YOU RUN THIS APPLICATION BEFORE YOU RUN THE SENDER APPLICATION

**Link Below:**
<br /> *https://github.com/original-shaun-reed/shaun-reed-iqbusinessgroup-assessment-sender*
***
##NB: I made use of the RABBITMQ plugin to serve as a message bus. Please install that plugin if it doesn't pull through from the **pom.xml** file when importing maven dependencies  
***
To run this project 

*Run the main method of the following file*
<br />**../shaun-reed-iqbusinessgroup-assessment-receiver/src/main/java/shaun/reed/iqbusinessgroup/assessment/main/Receiver.java**
***
*When the project is in runtime;*
<br /> **This application will listen for a message from clients;**
<br /> **Once that message has been obtain by this application it will display it in the console.**


<br />The first thing you'll see in your console is;
<br /> **-> Ready to receive messages**
<br /> **-------------------------------------------**


Once a message has been received it will look like this

Example:
<br /> *Output:* -> Hello my name is, James 
<br /> *Output:* -> Hello James, I am your father! 
***

###NB:
###YOU WILL HAVE TO STOP THE APPLICATION IN RUNTIME MANUALLY. . .
