package com.springboottest.autoconfiguration.importpac;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class CustomImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.springboottest.autoconfiguration.ImportClassBySelector"};
    }
}
