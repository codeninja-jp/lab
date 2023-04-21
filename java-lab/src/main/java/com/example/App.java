package com.example;

import java.io.IOException;

import com.example.util.JSONFormatter;
import com.example.infrastructure.mybatis.Example;
/**
 * App
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

        String json = JSONFormatter.loadFile(path);
        String res = JSONFormatter.format(json, key, newValue);
        System.out.println(res);

        Example.getUser();
        
    }
}
