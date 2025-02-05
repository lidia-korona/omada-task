package net.omada.spec

import spock.lang.Title

@Title('As a potential customer I want to learn about best methodology for IGA project')
class IdentityProjectST extends E2ESpecification {

    def 'I can download the guide book about IGA project methodology'() {
        expect: 'I explore information about IGA project methodology'

        and: 'I choose to download e-book'

        and: 'I fill in my contact details'

    }
}
