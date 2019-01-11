package org.lintx.example.Configure.config;

import org.lintx.plugins.modules.configure.Configure;

@Configure.yamlFile(path = "config/noyml.yml")
public class NoYmlToSaveFile extends Configure {

    @yamlConfig
    public String string = "test string";
}
