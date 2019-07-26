package com.luizapereira.coreengineering.tema8.persistence;

import com.luizapereira.coreengineering.tema8.main.Loan;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class LoanDAO {

    private static String path = "Loan.json";

    public void writeLoanData(List<Loan> loans) {

        Gson gson = new Gson();
        String json = gson.toJson(loans);

        try (FileWriter writer = new FileWriter(path)) {
            writer.write(json);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Loan> readLoanData() {

        Type typeFound = new TypeToken<ArrayList<Loan>>() { }.getType();

        File file = new File(path);

        if (!file.exists()) {
            createFile();
        } else {
            try (BufferedReader jsonReader = new BufferedReader(new FileReader(path))) {

                List<Loan> loanList = new Gson().fromJson(jsonReader, typeFound);
                return loanList;

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
