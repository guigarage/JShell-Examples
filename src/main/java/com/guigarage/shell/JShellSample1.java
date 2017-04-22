package com.guigarage.shell;

import jdk.jshell.JShell;

public class JShellSample1  {

    public static void main(String[] args) {
        JShell shell = JShell.builder().build();
        shell.eval("String name = \"VJUG\";");
        shell.eval("int i = 0;");
        shell.variables().forEach(v -> System.out.println("Variable: " + v.typeName() + " " + v.name()));
    }
}
