Launcher Automation
----------------------------
[Appium](http://appium.io/) is an open-source tool for automating native mobile applications in both iOS and Android. [Cucumber](https://cucumber.io/) is a popular BDD framework to describe testing scenarios.


#### Requirements

- [Appium Server](https://appium.io/) version: `2.2.2`

#### To run the project
```bash
appium --base-path=/wd/hub
gradle testDebug
```

#### To run the project with Applitools
```bash
appium --base-path=/wd/hub
git checkout applitools
gradle testDebug
```

**Note:** Make sure you set a valid Applitools key in [configuration.properties](https://github.com/josdem/launcher-automation/blob/main/app/src/main/res/configuration.properties) file

#### Read this as reference

https://josdem.io/techtalk/android/appium_cucumber_junit5/

**Note:** This project uses [Android Launcher](https://github.com/josdem/android-launcher) as a target Android product