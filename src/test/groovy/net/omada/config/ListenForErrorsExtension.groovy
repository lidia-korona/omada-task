package net.omada.config

import org.spockframework.runtime.extension.AbstractGlobalExtension
import org.spockframework.runtime.model.SpecInfo

class ListenForErrorsExtension extends AbstractGlobalExtension {

    @Override
    void visitSpec(SpecInfo specInfo) {
        specInfo.addListener(new ListenForErrorsListener())
    }
}
