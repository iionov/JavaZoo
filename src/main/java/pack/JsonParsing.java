package pack;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class JsonParsing {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
     void parsing() throws FileNotFoundException {
         System.out.println(ANSI_GREEN+  "★ В зоопарке собраны животные:" +ANSI_RESET);
        JsonElement json=new JsonParser().parse(new FileReader("src\\main\\resources\\Animals_List.json"));
        JsonObject jo = (JsonObject) json;
         JsonArray carnivorous=(JsonArray) jo.get("carnivorous");
         JsonArray herbivorous=(JsonArray) jo.get("herbivorous");
         populate(carnivorous, Main.all_carnivorous, Main.all_herbivorous, 1 );
         populate(herbivorous, Main.all_carnivorous, Main.all_herbivorous, 0 );
    }
    /**
     *  Packing List with carnivorous and herbivorous
     *  */
    protected void populate(JsonArray listofOfAnimalsType, ArrayList<Carnivorous> list1, ArrayList<Herbivorous> list2, int key){
        for (Object o:listofOfAnimalsType) {
            JsonObject parser = (JsonObject) o;
            String name = parser.get("name").getAsString();
            int count = parser.get("count").getAsInt();
            for (int i = 0; i < count; i++) {
                if (key == 1) {
                    Carnivorous type = new Carnivorous(name);
                    list1.add(type);
                    System.out.println(name);
                }
                else {
                    Herbivorous type=new Herbivorous(name);
                    list2.add(type);
                    System.out.println(name);
                }
            }
        }
     }
}
