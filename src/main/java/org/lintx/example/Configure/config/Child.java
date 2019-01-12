package org.lintx.example.Configure.config;

import org.lintx.plugins.modules.configure.BukkitConfigure;
import org.lintx.plugins.modules.configure.YamlConfig;

public class Child extends BukkitConfigure {
    @YamlConfig
    public String str1 = "";

    @YamlConfig
    public int int1 = 0;

    @YamlConfig
    public Grandson grandson = new Grandson();
}
