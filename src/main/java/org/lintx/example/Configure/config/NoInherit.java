package org.lintx.example.Configure.config;

import org.lintx.plugins.modules.configure.YamlConfig;

@YamlConfig(path = "noinherit.yml")
public class NoInherit {

    @YamlConfig
    public String example = "test";
}
