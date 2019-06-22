package org.academiadecodigo.bootcamp.mapeditor;

import java.io.*;

public class FileManager {

    private static final String FILE = "resources/mapEditor.txt";


    public static void writeFileByLine(String str) {


        try {

            BufferedWriter bWriter = new BufferedWriter(new FileWriter(FILE));

            bWriter.write(str);

            bWriter.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("No file found");
            e.printStackTrace();
        }
    }


    public static String readFileByLine() {


        String result = "";
        String line;


        try {

            BufferedReader bReader = new BufferedReader(new FileReader(FILE));

            while ((line = bReader.readLine()) != null) {
                result += line + "\n";
            }

            bReader.close();


        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return result;

    }
}
