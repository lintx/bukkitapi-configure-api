package org.lintx.example.Configure.config;


import org.lintx.plugins.modules.configure.BukkitConfigure;
import org.lintx.plugins.modules.configure.ConfigureAnnotation;

@ConfigureAnnotation.yamlFile(path = "example.yml")
public class Example extends BukkitConfigure {

    @ConfigureAnnotation.yamlConfig
    public String string1 = "";

    @ConfigureAnnotation.yamlConfig(path = "child.string1")
    public String string2 = "";
}
