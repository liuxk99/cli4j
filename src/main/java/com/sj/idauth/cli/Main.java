package com.sj.idauth.cli;

import com.sj.idauth.core.IdAuthFactory;
import picocli.CommandLine;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        int exitCode = new CommandLine(new IdAuthCommand(IdAuthFactory.getProduct())).execute(args);
        System.exit(exitCode);
    }
}
