package net.omada.spec

import spock.lang.Title

@Title('As a potential customer I want to browse around training services')
class OmadaAcademyST extends E2ESpecification {

    def 'I can search and register for self-paced training'() {
        expect: 'I explore information about Omada Academy'

        and: 'I explore information about self-paced training'

        and: 'I explore information about foundation training'

        and: 'I fill in my contact details'
    }
}
