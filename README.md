# logManager

 A simple Android Library that contains all the logs printed to Logcat in the project. 📄
 
 ## Description
 
 The logging library is an easy-to-use Android library that provides a convenient way to log messages in your Android Studio projects. 
It includes a logger class that allows you to log messages at various logging levels, including debug, informational, error, verbose, warning, and "what a terrible failure" levels.
 You can also specify a custom tag for each log message to make it easier to identify the source of the message.
 With the logging library, you can easily add logging functionality to your Android apps and facilitate debugging and error tracking.
 
 
 <p align="center">
  <img src="app/src/main/res/drawable/ic_log_managar.png?raw=true">
</p>

<p align="center">
  <img src="app/src/main/res/drawable/ic_logcat.png?raw=true">
</p>
 
 
 ## How to Use

1. Add it in your root build.gradle at the end of repositories:
   ```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
   ```
2. Add the dependency:
   ```
	dependencies {
          implementation 'com.github.Anet79:logManager:v1.00.01'    
	}
   ```
3. In your project, create a variable of type logManager.
4. Start using the library in your project by calling the library function
5. Enjoy .
