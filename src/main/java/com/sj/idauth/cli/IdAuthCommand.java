package com.sj.idauth.cli;

import com.google.common.base.Strings;
import picocli.CommandLine;

@CommandLine.Command(name = "IdAuth")
public class IdAuthCommand {
    @CommandLine.Spec
    private CommandLine.Model.CommandSpec spec;

    @CommandLine.Command(name = "login")
    public int login(
            @CommandLine.Option(names = {"-u", "--user"}, required = true, description = "User name to login.") final String user,
            @CommandLine.Option(names = {"-p", "--password"}, required = true, description = "Password for user to login.") final String password) {

        if (Strings.isNullOrEmpty(user)) {
            throw new CommandLine.ParameterException(spec.commandLine(), "empty {user} is not allowed");
        }
        if (Strings.isNullOrEmpty(password)) {
            throw new CommandLine.ParameterException(spec.commandLine(), "empty {password} is not allowed");
        }

        System.out.printf("%s('%s', '%s')\n", "login", user, password);
        return 0;
    }

    @CommandLine.Command(name = "logout")
    public int logout() {
        System.out.printf("%s\n", "logout()");

        return 0;
    }
}