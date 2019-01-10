package org.lintx.example.Configure.config;

import org.lintx.plugins.modules.configure.Configure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configure.yamlFile
public class Default extends Configure {
    enum exampleenum{
        A,B,C
    }

    @yamlConfig
    public String string1 = "default";

    @yamlConfig(path = "string2")
    public String aliasstring = "";

    @yamlConfig
    public int int1 = 0;

    @yamlConfig(path = "int2")
    public int aliasint = 0;

    @yamlConfig
    public double double1 = 0;

    @yamlConfig
    public exampleenum enum1 = exampleenum.C;

    @yamlConfig
    public List<String> liststr1 = new ArrayList<String>();

    @yamlConfig
    public List<Integer> listint1 = new ArrayList<Integer>();

    @yamlConfig(path = "child1")
    public Child child = new Child();

    @yamlConfig
    public Child child2 = new Child();

    @yamlConfig(path = "map1")
    public Map<String,String> map = new HashMap<String, String>();
}
