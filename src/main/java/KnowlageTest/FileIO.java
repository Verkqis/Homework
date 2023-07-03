package KnowlageTest;

import java.io.*;

public class FileIO {

    private static final String PATH_TO_APP = "C:\\Users\\verne\\Desktop\\";

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader(PATH_TO_APP + "tests.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter(PATH_TO_APP + "stset.txt"));

        String line;
        while ((line = in.readLine()) != null) {
            StringBuffer rev = new StringBuffer(line);
            out.write(String.valueOf(rev.reverse()));
        }
        in.close();
        out.close();
    }

//
//    #### (File I/O)
//    Write a program that will read any file and save it in the same folder. The content and title of the new file should be reversed (from the back).
//            (you can freely choose folder and file to test functionality)
}
