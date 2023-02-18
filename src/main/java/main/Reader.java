package main;

import java.io.*;

public class Reader {
    public static String[] read(){
        File file = new File("grammar.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String grammar = "";

            String st;

            while ((st = reader.readLine()) != null){
                grammar += st + "\n";
            }

            return grammar.trim().split("\n");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
