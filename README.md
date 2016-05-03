# HelloWorld Java & Android projects using [Bezirk](http://bezirk.com/) 
The Java & Android projects showcase how to publish an event using the Bezirk API. 

## Java
### Prerequisites 
* Oracle JRE (or JDK) 1.7 [Download](http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html)
* Verify java installation using windows console/terminal, cmd
```
java -version
```
* Set JAVA_HOME environment variable [Windows, Unix systems](https://docs.oracle.com/cd/E19509-01/820-3208/inst_cli_jdk_javahome_t/)

### Usage

#### Command-line/Terminal

##### Mac (OSX)

From within the root project folder (HelloWorld-master)

*configure*
```
sh scripts/osx_configure.sh
```

*refresh variables for current terminal instance* 
```
source ~/.bash_profile
```

*run*
```
./gradlew run
```

##### Linux Systems

From within the root project folder (HelloWorld-master)

*configure*
```
sh scripts/linux_configure.sh
```

*refresh variables for current terminal instance* 
```
source ~/.bash_profile
```

*run*
```
./gradlew run
```

##### Windows

*configure*

Add the absolute path C:\Users\\**\<username\>**\AppData\Local\Temp\lib-zeromq-bin to the system Path variable.

*run*

From within the root project folder (HelloWorld-master)
```
gradlew.bat run
```


## Android Project
### Prerequisites 
* Device with android version 4.1 or higher
* Android Studio http://developer.android.com/sdk/installing/index.html

### Usage
#### Android Studio
* Import as gradle project [File -> New -> Import -> HelloWorld-master]
* Connect android device to PC/Laptop.
* Install android/bezirk-app/control-ui-debug.apk
* In settings.gradle file -> Uncomment the following line.
```
//include ':android'
```
* Rebuild HelloWorld project [Build -> Rebuild Project]
* Install the android helloworld application.
