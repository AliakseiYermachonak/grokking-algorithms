package by.alexeyerma.learning.algorithms.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleDiscusser {
    public String readInputLine() {
        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr)) {
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException("Something went wrong", e);
        }
    }

    public int readNumber() {
        try {
            return Integer.parseInt(readInputLine());
        } catch (NumberFormatException e) {
            throw new RuntimeException("Not an int", e);
        }
    }

    public double readFloatingPoint() {
        try {
            return Double.parseDouble(readInputLine());
        } catch (NumberFormatException e) {
            throw new RuntimeException("Not an int", e);
        }
    }
}
