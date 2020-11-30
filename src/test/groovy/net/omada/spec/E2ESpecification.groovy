package net.omada.spec

import net.omada.config.environment.Environment
import net.omada.config.environment.EnvironmentProd
import spock.lang.Shared
import spock.lang.Specification

class E2ESpecification extends Specification {

    @Shared
    static Environment env = createConfiguration()

    static Environment createConfiguration() {
        new EnvironmentProd()
    }
}
