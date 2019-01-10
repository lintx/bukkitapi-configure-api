package org.lintx.example.Configure.config;

import org.lintx.plugins.modules.configure.Configure;

public class Child extends Configure {
    @yamlConfig
    public String str1 = "";

    @yamlConfig
    public int int1 = 0;

    @yamlConfig
    public Grandson grandson = new Grandson();
}
