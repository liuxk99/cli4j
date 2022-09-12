package com.sj.idauth.cli;

import picocli.CommandLine;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        int exitCode = new CommandLine(new IdAuthCommand()).execute(args);
        System.exit(exitCode);
    }
}