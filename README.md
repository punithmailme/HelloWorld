# HelloWorld Java & Android projects using [Bezirk](http://rb-bezirk.bosch.com/) 
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

From within the root project folder (HelloWorld-******)

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

From within the root project folder (HelloWorld-******)

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

From within the root project folder (HelloWorld-******)

*configure*
Add the absolute path C:\Users\<username>\AppData\Local\Temp\lib-zeromq-bin to the system Path variable.
 
*run*
```
gradlew.bat run
```


## Android Project
### Prerequisites 
* Device with android version 4.1 or higher
* Bezirk app installed on Android device (For users with access to pydio, download from -> http://52.18.79.103/pydio/ws-default/bezirk-apps)
* Android Studio http://developer.android.com/sdk/installing/index.html

### Usage
#### Android Studio
* Import as gradle project [File -> New -> Import -> HelloWorld]
* In settings.gradle file -> Uncomment the following line.
```
//include ':android'
```
* Connect android device to PC/Laptop.
* Install the android helloworld application.
