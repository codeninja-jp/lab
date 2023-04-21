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
    public static void main(String[] args) throws Exception {
        Example.print();
    }
}
