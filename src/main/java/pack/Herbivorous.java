package pack;

public class Herbivorous extends Animals implements AnimalAction, Observer   {
    public Herbivorous (String name){
        sleep_status=false;
        noise_status=false;
        this.name=name;
    }

    /**
     * This is behavior methods for herbivorous
     */
    @Override
    public void goSleep(){
        if (sleep_status=true){
            System.out.println(name+" спит, тк было событие "+eventName +". SLEEP STATUS: " +sleep_status);}
        else {System.out.println(name + "не спит, тк было слбытие "+ eventName+". SLEEP STATUS: " +sleep_status);}
    }
    @Override
    public void makeNoise(){
        if (noise_status==false){
            if (sleep_status==true){
                wakeUp();
            }
            noise_status=true;
            System.out.println(name +" шумит, тк было событие "+eventName +". NOISE STATUS: " +noise_status);
        }
        else {
            System.out.println(name +" шумит, тк было событие "+eventName+". NOISE STATUS: " +noise_status);
        }
    }
    @Override
    public void eat(){
        noise_status=false;
        System.out.println(name + " поел и ведет себя тихо, тк было событие "+ eventName +". NOISE STATUS:"+ noise_status );
    }
    @Override
    public void wakeUp(){
        if (sleep_status==true){
            sleep_status=false;
            System.out.println(name +" проснулся, тк было событие "+eventName+". SLEEP STATUS: " +sleep_status);
        }
    }
    @Override
    public void reactionOnEvent(String eventName){
        switch (eventName){
            case("the zookeeper_is_here"):
                makeNoise();
                break;
            case ("feeding_animals"):
                eat();
                break;
            case ("morning"):
                if (sleep_status==true){
                    wakeUp();
                    break;
                }
                else {
                    System.out.println(name + " активен, тк произшло событие "+eventName+". SLEEP STATUS: " +sleep_status);
                    break;
                }
            case ("night"):
                if (noise_status==false){
                    goSleep();
                    break;
                }
                else {System.out.println(name + " SLEEP STATUS: " +sleep_status);
                break;
                }
            case ("thunder"):
                wakeUp();
                makeNoise();
                break;
            case ("carnivorous_make noise"):
                System.out.println(name+ " ведет себя тихо. NOISE STATUS: " +noise_status);
                break;
            default:
                System.out.println(name+" не знает что делать в случае " +eventName);
        }
    }

    /**
     * @param eventName The event causes a specific reaction for animal.
     */
    @Override
    public void update(String eventName) {
        this.eventName=eventName;
        reactionOnEvent(eventName);
    }
}
