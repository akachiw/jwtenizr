/*
 */
package com.airhacks.jwtenizr.control;

/**
 *
 * @author airhacks.com
 */
public enum TerminalColors {

    INFO("\033[0;33m"), TIME("\033[1;90m"), RESET("\u001B[0m"), COMMAND("\033[0;97m");

    private final String value;


    private TerminalColors(String value) {
        this.value =  value;
    }

    public String value() {
        return this.value;
    }


}
