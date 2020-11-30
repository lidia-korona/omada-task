package net.omada.config.environment

class EnvironmentProd extends Environment {

    final String appUrl

    EnvironmentProd() {
        appUrl = "https://www.omada.net/"
    }
}
