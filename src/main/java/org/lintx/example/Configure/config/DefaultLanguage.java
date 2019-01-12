package org.lintx.example.Configure.config;


import org.lintx.plugins.modules.configure.BukkitConfigure;
import org.lintx.plugins.modules.configure.YamlConfig;

@YamlConfig(path = "language_en_us.yml")
public class DefaultLanguage extends BukkitConfigure {

    @YamlConfig
    public String string1 = "";
}
