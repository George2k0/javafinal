package ge.edu.btu;
import java.io.File;

public class FileCounter {
    public static void main(String[] args) {

        File directory = new File("BTU_DOCUMENTS");
        File[] files = directory.listFiles();

        int count = 0;

        for (File file : files) {
            if (file.getName().startsWith("btu"))
                count++;
        }

        System.out.println("მოძებნილი ფაილების რაოდენობაა : " + count);

    }
}

