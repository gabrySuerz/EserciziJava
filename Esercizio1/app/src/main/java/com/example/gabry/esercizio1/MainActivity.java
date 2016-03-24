package com.example.gabry.esercizio1;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends Activity {

    private static final String TAG = "TEST_CSV";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        parser();
    }

    public void parser() {
        try {
            InputStream inputStream = getResources().openRawResource(R.raw.dati);
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String line = br.readLine();

            String[] element = new String[18];

            int i = 0;

            Map<Address, ArrayList<Integer>> addresses = new HashMap<Address, ArrayList<Integer>>();
            Address address = null;

            StringBuilder builder = new StringBuilder();

            ArrayList<Integer> sameAddress = new ArrayList<Integer>();

            while ((line = br.readLine()) != null) {
                //loop per prendere la linea completa di ogni record
                while (countOccurrences(line, ';') < 17) {
                    line = line.concat(br.readLine());
                    System.out.println("numero" + i);
                }

                //array che salva i valori del record
                element = line.split(";");

                //se l'indirizzo è valido, crea oggetto
                if (element[2].length() > 0 && element[3].length() > 0 && element[4].length() > 0) {
                    address = new Address(element[2], element[3], element[4], element[5]);
                    ++i;
                    //prende lista di indirizzi già esistenti
                    ArrayList<Integer> temp = addresses.get(address);
                    //controlla se esiste la lista, se sì
                    if (temp == null) {
                        sameAddress = new ArrayList<Integer>();
                        sameAddress.add(i);
                        addresses.put(address, sameAddress);
                    } else {
                        temp.add(i);
                        addresses.put(address, temp);
                    }
                }
            }
            System.out.println("Numero record: " + (i - 1));

            /*FileWriter fw = new FileWriter("nomefileout.csv");
            PrintWriter pw = new PrintWriter(fw);
            pw.println("id1;lat;lng;google address");*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static int countOccurrences(String str, char c) {
        int i = 0;
        for (int j = 0; j < str.length(); ++j) {
            if (str.charAt(j) == c)
                ++i;
        }
        return i;
    }

}