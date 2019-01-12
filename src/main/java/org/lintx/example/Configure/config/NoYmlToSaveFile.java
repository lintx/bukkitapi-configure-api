package org.lintx.example.Configure.config;

import org.lintx.plugins.modules.configure.BukkitConfigure;
import org.lintx.plugins.modules.configure.YamlConfig;

@YamlConfig(path = "config/noyml.yml")
public class NoYmlToSaveFile extends BukkitConfigure {

    @YamlConfig
    public String string = "test string";
}
