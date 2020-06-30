package pack;
import javazoom.jl.player.Player;
import java.io.FileInputStream;

public class SupplementaryMaterial extends Thread {

    public void drow(){
        String[] arr = {
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░ \n" +
                        "░░░░░░░░░░░▄██▄░░░░░░▄▄░░░░░ \n" +
                        "░░░░░░░░░░▐███▀░░░░░▄███▌░░░ \n" +
                        "░░░░░▄▀░░▄█▀▀░░░░░░░░▀██░░░░ \n" +
                        "░░░░█░░░██░░░░░░░░░░░░░░░░░░ \n" +
                        "░░░█▌░░▐██░░▄██▌░░▄▄▄░░░▄░░░\n" +
                        "░░░██░░▐██▄░▀█▀░░░▀██░░▐▌░░░\n" +
                        "░░░██▄░▐███▄▄░░▄▄▄░▀▀░▄██░░░\n" +
                        "░░░▐███▄██████▄░▀░▄█████▌░░░\n" +
                        "░░░▐████████████▀▀██████░░░░\n" +
                        "░░░░▐████▀██████░░█████░░░░░\n" +
                        "░░░░░░▀▀▀░░█████▌░████▀░░░░░\n" +
                        "░░░░░░░░░░░░▀▀███░▀▀▀░░░░░░░\n" +
                        "░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                        "░▀█░░▀█▀░█▀░▀█░░▀█▀░█▀░█▀▀▀░\n" +
                        "░░░█░░█░░█░░░░█░░█░░█░░█▀▀░░\n" +
                        "░░░░██░██░░░░░░██░██░░░█░░░░\n" +
                        "░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                        "░░░░░░░░░░░░░░░░░░░░░░░░░░░░"
        };
        try {
            for(String s : arr){
                Thread.sleep(100);
                System.out.println(s);
            }
        } catch (InterruptedException e) {
           e.printStackTrace();
        }

    }

    public void sound(){
        try {
            FileInputStream stream = new FileInputStream("src\\main\\resources\\sound.mp3");
            Player player = new Player(stream);
            player.play();
        }catch(Exception e) {}
    }
}
