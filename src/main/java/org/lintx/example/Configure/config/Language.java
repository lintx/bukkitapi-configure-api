package org.lintx.example.Configure.config;


import org.lintx.plugins.modules.configure.BukkitConfigure;
import org.lintx.plugins.modules.configure.ConfigureAnnotation;

public class Language extends BukkitConfigure {

    @ConfigureAnnotation.yamlConfig
    public String string1 = "";
}
