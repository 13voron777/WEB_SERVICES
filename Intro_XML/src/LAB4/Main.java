package LAB4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Content> contents = new ArrayList<>();
        contents.add(new Content(34, "Super product", 1));
        contents.add(new Content(56, "Wonderful product", 3));
        Order order = new Order(12345, "Ivan Ivanov", "ivanov@example.com", contents, true);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(order);
        String path = "Intro_XML\\src\\LAB4\\order.json";
        Files.write(Paths.get(path), json.getBytes());

        JsonReader jsonReader = new JsonReader(new InputStreamReader(new FileInputStream(path)));
        Order orderData = gson.fromJson(jsonReader, Order.class);
        System.out.println(orderData);
    }
}
