package com.example.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Logger;

import org.json.JSONObject;

public class JSONFormatter {
    private static final Logger LOG = Logger.getLogger(JSONFormatter.class.getName());


    public static String loadFile(String path) throws IOException {
        LOG.info("Loading JSON file...");
        String content = new String(Files.readAllBytes(Paths.get(path)));
        LOG.info("Loaded JSON file: " + content);
        return content;
    }

    private static JSONObject put(String strJson, String key, String newValue) throws IOException {
        LOG.info("Converting input to JSONObject: " + strJson);
        JSONObject json = new JSONObject(strJson);
        LOG.info("Converted input to JSONObject: " + json);
        LOG.info("Replacing value: " + newValue);
        json.put(key, newValue);
        LOG.info("Updated value: " + json.toString());
        return json;
    }

    public static String format(String json, String key, String newValue) throws IOException {
        JSONObject result = put(json, key, newValue);
        return result.toString();
    }
}
