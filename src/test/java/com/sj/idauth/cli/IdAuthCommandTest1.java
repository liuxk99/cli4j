package com.sj.idauth.cli;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import picocli.CommandLine;

class IdAuthCommandTest {
    private CommandLine cli;

    @BeforeEach
    void setUp() {
        cli = new CommandLine(new IdAuthCommand());
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void should_login_without_parameters() {
        // 1
        cli.execute("login");
//        Missing required options: '--user=<arg0>', '--password=<arg1>'
//        Usage: IdAuth login -p=<arg1> -u=<arg0>
//                -p, --password=<arg1>   Password for user to login.
//                -u, --user=<arg0>       User name to login.
    }

    @Test
    public void should_login_with_parameters() {
        final String user = System.getenv("MY_USER");
        final String password = System.getenv("MY_PASSWORD");
        System.out.println("user:" + user);
        System.out.println("password:" + password);

        cli.execute("login", "-u=" + user, "-p=" + password);
    }

    @Test
    void should_logout() {
        cli.execute("logout");
    }
}