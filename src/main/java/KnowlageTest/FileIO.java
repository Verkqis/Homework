package KnowlageTest;

import java.io.*;

public class FileIO {

    private static final String PATH_TO_APP = "C:\\Users\\verne\\Desktop";

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader(PATH_TO_APP + "test.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter(PATH_TO_APP + "testOut.txt"));

        String line;
        while ((line = in.readLine()) != null) {
            out.write(line);
        }
        in.close();
        out.close();
    }

}
