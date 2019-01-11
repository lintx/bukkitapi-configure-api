package org.lintx.example.Configure.config;

import org.lintx.plugins.modules.configure.Configure;

@Configure.yamlFile(path = "language_en_us.yml")
public class DefaultLanguage extends Configure {

    @yamlConfig
    public String string1 = "";
}
