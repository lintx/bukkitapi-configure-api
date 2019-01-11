package org.lintx.example.Configure.config;


import org.lintx.plugins.modules.configure.BukkitConfigure;
import org.lintx.plugins.modules.configure.ConfigureAnnotation;

public class Grandson extends BukkitConfigure {
    @ConfigureAnnotation.yamlConfig
    public double double1 = 0;
}
