package reto1.clase03.utils;

import reto1.clase03.models.Note;

import java.io.*;

public class FileManager {

    private static final String NOTES_PATH = "C:\\Users\\Alfredo Acosta\\Desktop\\Notes.txt";
    private static File file = new File(NOTES_PATH);
//    PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
    /**
     * Use FileWriter when number of write operations are less
     * @param note file to write
     */
    public void writeFile(Note note) {
        FileWriter writer = null;

        try {
                writer = new FileWriter(file);
                writer.write(String.valueOf(note));
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            //close resources
            try {
                assert writer != null;
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

//    /**
//     * Use Streams when you are dealing with raw data
//     * @param data
//     */
//    private static void writeUsingOutputStream(String data) {
//        OutputStream os = null;
//        try {
//            os = new FileOutputStream(new File("/Users/pankaj/os.txt"));
//            os.write(data.getBytes(), 0, data.length());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally{
//            try {
//                os.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    /**
//     * Use Files class from Java 1.7 to write files, internally uses OutputStream
//     * @param data
//     */
//    private static void writeUsingFiles(String data) {
//        try {
//            Files.write(Paths.get("/Users/pankaj/files.txt"), data.getBytes());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     * Use BufferedWriter when number of write operations are more
//     * It uses internal buffer to reduce real IO operations and saves time
//     * @param data
//     * @param noOfLines
//     */
//    private static void writeUsingBufferedWriter(String data, int noOfLines) {
//        File file = new File("/Users/pankaj/BufferedWriter.txt");
//        FileWriter fr = null;
//        BufferedWriter br = null;
//        String dataWithNewLine=data+System.getProperty("line.separator");
//        try{
//            fr = new FileWriter(file);
//            br = new BufferedWriter(fr);
//            for(int i = noOfLines; i>0; i--){
//                br.write(dataWithNewLine);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally{
//            try {
//                br.close();
//                fr.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
}
