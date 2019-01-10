package org.lintx.example.Configure.config;


import org.lintx.plugins.modules.configure.Configure;

@Configure.yamlFile(path = "example.yml")
public class Example extends Configure {

    @yamlConfig
    public String string1 = "";

    @yamlConfig(path = "child.string1")
    public String string2 = "";
}
