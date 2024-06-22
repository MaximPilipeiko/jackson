package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.net.URL;
import java.nio.file.Paths;

public class Main {
    private static final ObjectMapper mapper = new ObjectMapper();
    public static void main(String[] args) throws Exception {
        URL res = Main.class.getClassLoader().getResource("tree.json");
        File file = Paths.get(res.toURI()).toFile();
        Node treeRootJson = mapper.readValue(file, Node.class);
        System.out.println(treeRootJson);
    }
}
