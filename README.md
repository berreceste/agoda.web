## About this template

This is a template to get started with a Gauge project that uses Selenium as the driver to interact with a web browser.

## Installing this template

    gauge --install java_selenium

# Scenario3Page README
 
## Overview
 
The `Scenario3Page` class is a Selenium page object used for interacting with specific elements on a web page and performing certain test operations.
 
## Class Structure
 
- **Log**: A logging instance created using Apache Commons Logging.
- **TestiniumLabel** and **TestiniumButton**: Custom classes for interacting with labels and buttons on the page.
- **Driver**: The WebDriver instance used for browser interactions.
- **spans**: A list that stores specific `WebElement` instances on the page.
 
## Features
 
- **Label_Destination**: Represents the "Destination" text input field on the web page.
- **BTN_Destination**: Represents the destination button.
- **BTN_EnterDate**: Represents the date picker button.
- **spans**: A list of `WebElement` instances representing available dates on the page.
 
## Methods
 
### `getInstance()`
 
A static method that returns the singleton instance of the `ExamplePage` class.
 
### `mainPage()`
 
Performs the following steps:
1. **Enter Destination**: Uses `Label_Destination` to enter the text "Antalya" and clicks the `BTN_Destination`.
2. **Select Date**: Clicks the `BTN_EnterDate` and collects available dates into the `spans` list.
3. **Process Dates**: Iterates over the list, prints each date to the console, and clicks on the date "5" if it matches.
 
## Usage
 
1. **Selenium and WebDriver**: Ensure Selenium WebDriver is correctly set up for the `Scenario3Page` class to function.
2. **Testinium Classes**: Make sure the `TestiniumLabel` and `TestiniumButton` classes are included in the project and properly configured.
 
## Requirements
 
- Java 8 or later
- Selenium WebDriver
- Apache Commons Logging
- Testinium classes and configurations
 
## Notes
 
- **Exception Handling**: The `mainPage()` method handles `InterruptedException`, typically caused by `Thread.sleep()` calls. In production code, a more reliable waiting strategy should be used.

