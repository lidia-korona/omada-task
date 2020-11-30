# Spock tests suite

## Overview
In this project you can find tests for Omada website (https://www.omada.net/) that are written
in the form of Specification by Example thanks to Spock framework. 
Selenium WebDriver with combination of Testcontainers (https://www.testcontainers.org/) were used for browser testing.

## Execution

Configuration properties:

|Property       | Description|
|:--------------|:--------------|
|omada.browser  | Browser to use. Available values: [chrome, firefox]. By default chrome is chosen.|

To execute type:
`./gradlew clean test -Domada.browser=chrome`

## Test reports

Can be found here: `build/spock-reports/index.html`

For failed tests video is recorder in the FLV format.