package ar.edu.untref.dyasc;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public void save(String filepath , String content) throws IOException {

        File file = new File(filepath);

        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(content);

        writer.close();


    }
}
