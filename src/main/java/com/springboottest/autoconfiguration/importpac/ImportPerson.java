package com.springboottest.autoconfiguration.importpac;

import com.springboottest.autoconfiguration.ImportClass;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Import({ImportClass.class, CustomImportSelector.class, CustomBeanDifinitionRegister.class})
@Component
public class ImportPerson {

}
