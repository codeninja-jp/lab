package com.example;

import java.io.IOException;

import com.example.utils.JSONFormatter;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        String path = "static/test.json";
        String key = "category";
        String newValue = "new value";

        String res = JSONFormatter.format(path, key, newValue);
        System.out.println(res);
    }
}
