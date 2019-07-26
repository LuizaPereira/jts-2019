package com.luizapereira.coreengineering.tema8.persistence;

import com.luizapereira.coreengineering.tema8.main.Person;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO {

    private static String path = "Person.json";

    public void writePersonData(List<Person> person) {

        Gson gson = new Gson();
        String json = gson.toJson(person);


        try (FileWriter writer = new FileWriter(path)) {

            writer.write(json);

        } catch (IOException e) {
                e.printStackTrace();
        }
    }

    public List<Person> readPersonData() {

        Type typeFound = new TypeToken<ArrayList<Person>>() {
        }.getType();

        File file = new File(path);

        if (!file.exists()) {
            createFile();
        } else {

            try (BufferedReader jsonReader = new BufferedReader(new FileReader(path))) {

                List<Person> listPerson = new Gson().fromJson(jsonReader, typeFound);
                return listPerson;

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
