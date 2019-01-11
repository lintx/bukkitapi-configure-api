package org.lintx.example.Configure.config;


import org.lintx.plugins.modules.configure.BukkitConfigure;
import org.lintx.plugins.modules.configure.ConfigureAnnotation;

@ConfigureAnnotation.yamlFile(path = "language_en_us.yml")
public class DefaultLanguage extends BukkitConfigure {

    @ConfigureAnnotation.yamlConfig
    public String string1 = "";
}
