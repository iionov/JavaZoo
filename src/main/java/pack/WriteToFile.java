package pack;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WriteToFile {
    protected void  writeToFile() throws FileNotFoundException {
        Date date = new Date();
        Format formatter = new SimpleDateFormat("YYYY-MM-dd_kk-mm-ss");
        PrintStream out = new PrintStream(new FileOutputStream("logs\\"+"JavaZoo_"+ formatter.format(date) + ".txt"));
        System.setOut(out);
    }
}
