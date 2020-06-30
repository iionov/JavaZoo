package pack;

import com.google.gson.*;
import java.io.*;
import java.util.ArrayList;

/**
 * @author Ionov Ivan
 * In this class organisate parisng from a JSON file, after that implement the observer pattern.
 */
public class Main  {
    public static ArrayList<Carnivorous> all_carnivorous = new ArrayList<>();
    public static ArrayList<Herbivorous> all_herbivorous= new ArrayList<>();
    static public void main(String[] argv) throws JsonSyntaxException, IOException {

        //SupplementaryMaterial example= new SupplementaryMaterial();
        //new Thread(example::drow).start();
        //new Thread(example::sound).start();
        JsonParsing gson=new JsonParsing();
        gson.parsing();
        System.out.println (JsonParsing.ANSI_GREEN+ "★ Введите количество случайных событий в зоопарке:" + JsonParsing.ANSI_RESET );
        //WriteToFile writer=new WriteToFile(); //тут производиться вывод в файл, в ином случае будет вывод в консоль
       // writer.writeToFile();
        EventsAction event=new EventsAction();
        event.eventsActions();
    }
}
