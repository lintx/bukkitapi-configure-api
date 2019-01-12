package org.lintx.example.Configure.config;


import org.lintx.plugins.modules.configure.BukkitConfigure;
import org.lintx.plugins.modules.configure.YamlConfig;

@YamlConfig(path = "example.yml")
public class Example extends BukkitConfigure {

    @YamlConfig
    public String string1 = "";

    @YamlConfig(path = "child.string1")
    public String string2 = "";
}
