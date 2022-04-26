package com.senina.maria.springbasics.cdi;

import javax.inject.Named;

@Named
public class SomeCdiDao {
    // CDI is a JavaEE standard.
    // Spring implements CDI.
    // The outcome is the same, only the annotation names are different.
    // Spring provides implementations for the CDI annotations.
    // @Component = @Named
    // @Autowired = @Inject
    // @Scope = @Scope
    // @Qualifier = @Qualifier
    // @Scope("singleton") = @Singleton
}
