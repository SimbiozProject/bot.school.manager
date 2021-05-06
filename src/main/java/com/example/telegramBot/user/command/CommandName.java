package com.example.telegramBot.user.command;

public enum CommandName {

    START ("/start"),
    HELP ("/help"),
    HELLO ("/hello"),
    SETTINGS ("/settings"),
    NO("nocommand"),
    TEST("inline.test"),
    TEST_ANSWER("english");
    private final String commandName;

    CommandName(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandName() {
        return commandName;
    }



}