package pack;

public  class Publisher {
    /**
     * After events occur, the observer notifies subscribers (all animals are subscribers)
     * @param eventName it is an event that may occur
     */
     public void originEventAndNotification(String eventName){
         System.out.println("..................");
        System.out.println("Event:"+eventName);
        System.out.println("..................");
         switch (eventName){
             case("the zookeeper_is_here"):
             case ("feeding_animals"):
             case ("morning"):
             case ("night"):
             case ("thunder"):
             case ("carnivorous_make noise"):
                 Publisher publisher=new Publisher();
                 publisher.update(eventName);
                 break;
             case ("herbivorous_make_noise"):
                 for (int i=0; i<Main.all_carnivorous.size();i++){
                     Main.all_carnivorous.get(i).update("herbivorous_make_noise");
                 }
                 break;
             default:
                 System.out.println("Субъект не знает что делать в случае " +eventName);
         }
     }

    /**
     *There is a notification for animals.
     * @param eventName
     */
    private  void update(String eventName) {
        Main.all_herbivorous.forEach(n->n.update(eventName));
        Main.all_carnivorous.forEach(n->n.update(eventName));
    }
}
