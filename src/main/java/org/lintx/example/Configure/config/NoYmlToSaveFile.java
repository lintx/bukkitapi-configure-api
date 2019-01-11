package org.lintx.example.Configure.config;

import org.lintx.plugins.modules.configure.BukkitConfigure;
import org.lintx.plugins.modules.configure.ConfigureAnnotation;

@ConfigureAnnotation.yamlFile(path = "config/noyml.yml")
public class NoYmlToSaveFile extends BukkitConfigure {

    @ConfigureAnnotation.yamlConfig
    public String string = "test string";
}
