package org.lintx.example.Configure.config;

import org.lintx.plugins.modules.configure.BukkitConfigure;
import org.lintx.plugins.modules.configure.ConfigureAnnotation;

public class Child extends BukkitConfigure {
    @ConfigureAnnotation.yamlConfig
    public String str1 = "";

    @ConfigureAnnotation.yamlConfig
    public int int1 = 0;

    @ConfigureAnnotation.yamlConfig
    public Grandson grandson = new Grandson();
}
