package pack;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Add {
    public static ArrayList<Carnivorous> all_carnivorous = new ArrayList<>();
    public static ArrayList<Herbivorous> all_herbivorous= new ArrayList<>();
    public static void add() throws FileNotFoundException {
        System.out.println("★ В зоопарке собраны животные:");
        JsonElement json=new JsonParser().parse(new FileReader("src\\main\\resources\\Test_Animals_List.json"));
        JsonObject jo = (JsonObject) json;
        JsonArray carnivorous=(JsonArray) jo.get("carnivorous");
        JsonArray herbivorous=(JsonArray) jo.get("herbivorous");
        populate(carnivorous, all_carnivorous, all_herbivorous, 1 );
        populate(herbivorous, all_carnivorous, all_herbivorous, 0 );
    }
    public static void populate(JsonArray listofOfAnimalsType, ArrayList<Carnivorous> list1, ArrayList<Herbivorous> list2, int key){
        for (Object o:listofOfAnimalsType) {
            JsonObject parser = (JsonObject) o;
            String name = parser.get("name").getAsString();
            int count = parser.get("count").getAsInt();
            for (int i = 0; i < count; i++) {
                if (key == 1) {
                    Carnivorous type = new Carnivorous(name);
                    list1.add(type);
                }
                else {
                    Herbivorous type=new Herbivorous(name);
                    list2.add(type);
                }
            }
        }
    }
}
