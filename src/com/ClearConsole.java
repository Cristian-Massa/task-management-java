package com;

import java.io.IOException;

public class ClearConsole {
    public static void clearConsole() {
        try {
            // Check if the OS is Windows
            if (System.getProperty("os.name").contains("Windows")) {
                // Execute the "cls" command to clear the CMD
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }else{
                Runtime.getRuntime().exec("clear");
            }
        } catch (IOException | InterruptedException e) {
            String error = e.getMessage();
            System.out.println(error);
        }
    }
}
