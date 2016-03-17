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

#### Command-line

##### Mac (OSX)

From within the root project folder (HelloWorld-******)

*configure*
```
sh scripts/osx_configure.sh
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

*run*
```
./gradlew run
```

##### Windows

From within the root project folder (HelloWorld-******)

*configure*
//TODO
 
*run*
//check
```
gradlew.bat run
```


## Android Project
### Prerequisites 
* Device with android version 4.1 or higher
* Bezirk app (For users with access to pydio, download from -> http://52.18.79.103/pydio/ws-default/bezirk-apps)
* Android Studio http://developer.android.com/sdk/installing/index.html

### Usage
#### Android Studio
* Import as gradle project [File -> New -> Import -> HelloWorld]
* Connect android device to PC/Laptop.
* Install & run the bezirk application.
* Install the android helloworld application.
