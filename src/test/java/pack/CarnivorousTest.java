package pack;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;
import static pack.Add.all_carnivorous;

public class CarnivorousTest {
    @BeforeClass
    public static void adding() throws FileNotFoundException {Add.add();}
    @Test
    public void test1(){
        for (int i=0;i<all_carnivorous.size();i++){
            (all_carnivorous.get(i)).update("night");
            assertEquals(true, all_carnivorous.get(i).sleep_status);
            assertEquals(false, all_carnivorous.get(i).noise_status);
        }
    }
    @Test
    public void test2(){
        for (int i=0;i<all_carnivorous.size();i++){
            (all_carnivorous.get(i)).update("morning");
            assertEquals(false, all_carnivorous.get(i).sleep_status);
            assertEquals(false, all_carnivorous.get(i).noise_status);
        }
    }
    @Test
    public void test3(){
        for (int i=0;i<all_carnivorous.size();i++){
            (all_carnivorous.get(i)).update("thunder");
            assertEquals(false, all_carnivorous.get(i).sleep_status);
            assertEquals(true, all_carnivorous.get(i).noise_status);
        }
    }
    @Test
    public void test4(){
        for (int i=0;i<all_carnivorous.size();i++){
            (all_carnivorous.get(i)).update("the zookeeper_is_here");
            assertEquals(false, all_carnivorous.get(i).sleep_status);
            assertEquals(true, all_carnivorous.get(i).noise_status);
        }
    }
    @Test
    public void test5(){
        for (int i=0;i<all_carnivorous.size();i++){
            (all_carnivorous.get(i)).update("feeding_animals");
            assertEquals(false, all_carnivorous.get(i).sleep_status);
            assertEquals(false, all_carnivorous.get(i).noise_status);
        }
    }
    @Test
    public void test6(){
        for (int i=0;i<all_carnivorous.size();i++){
            (all_carnivorous.get(i)).update("herbivorous_make_noise");
            assertEquals(false, all_carnivorous.get(i).sleep_status);
            assertEquals(true, all_carnivorous.get(i).noise_status);
        }
    }
}