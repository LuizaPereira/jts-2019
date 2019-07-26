package com.luizapereira.coreengineering.tema8.persistence;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.luizapereira.coreengineering.tema8.main.Book;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    private static String path = "Book.json";

    public void writeBookData(List<Book> books) {

        Gson gson = new Gson();
        String json = gson.toJson(books);

        try (FileWriter writer = new FileWriter(path)) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Book> readBookData() {

        Type typeFound = new TypeToken<ArrayList<Book>>() {
        }.getType();

        File file = new File(path);

        if (!file.exists()) {
            createFile();
        } else {
            try (BufferedReader jsonReader = new BufferedReader(new FileReader(path))) {

                List<Book> bookList = new Gson().fromJson(jsonReader, typeFound);
                return bookList;

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return new ArrayList<>();
    }

    public void createFile() {
        try {
            FileWriter writer = new FileWriter(path);
            writer.write("[]");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
