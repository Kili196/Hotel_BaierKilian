import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;

/**
 * Created: 24.01.2022
 *
 * @author Kilian Baier (20190608)
 */
public class Columns {
    int OFFSET = 0;


    public static Map<String, Short> readColumns(String filename) throws IOException{
        Map<String, Short> retmap = new HashMap<>();
        RandomAccessFile raf = new RandomAccessFile(new File(filename), "rw");
        int namelenght;
        int collumlength;
        raf.seek(8);
        namelenght = raf.readShort();
        byte b[] = new byte[namelenght];
        raf.read(b);
        collumlength = raf.readShort();

        return retmap;

    }
}