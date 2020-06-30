package pack;

import org.junit.Test;
import java.io.File;

import static org.junit.Assert.*;
public class JsonParsingTest {
File file=new File("src\\main\\resources\\Animals_List.json");
    @Test
    public void parsing() {
    assertTrue(!file.isDirectory());
    }

}