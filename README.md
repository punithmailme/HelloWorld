# [Bezirk](http://bezirk.com/) HelloWorld for Java SE and Android 
This repository contains one Java SE and one Android project demonstrating how to configure a basic Bezirk project, fetch the Bezirk API, and publish a simple event using the API. 

## Java SE
### Prerequisites 
* [Oracle JDK 1.7+](http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html)

### Usage
#### Command-line/Terminal

- Linux and Mac OS X: `./gradlew run`
- Windows: `gradlew.bat run`

#### Android Studio/Other IDEs

To run the Java SE example from Android Studio (recommended) or some other IDE, you must configure your operating system's environment variable used to set the `java.library.path` system property to include the directory where Bezirk's [ZeroMQ](http://zeromq.org/) dependencies are located. The Bezirk middleware contains copies of these dependencies and automatically copies their correct versions onto the system during the first run.

From the root folder of the cloned repository:

- Linux: `sh scripts/linux_configure.sh`
- Mac OS X: `sh scripts/osx_configure.sh` 
- Windows: Add the absolute path C:\Users\\**\<username\>**\AppData\Local\Temp\lib-zeromq-bin to the system's `PATH` variable.

You will need to restart any instance of Android Studio that is already open for the environment variable changes to have an effect.

## Android
### Prerequisites 
* Device with Android version 4.1 or higher
* [Android Studio](http://developer.android.com/sdk/installing/index.html)

### Usage
#### Android Studio
* Import as Gradle Project [File -> New -> Import Project... -> HelloWorld]
* Connect Android device to PC/Laptop.
* Install android/bezirk-app/control-ui-debug.apk
* Rebuild HelloWorld project [Build -> Rebuild Project]
* Install the Android HelloWorld application.
