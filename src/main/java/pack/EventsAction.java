package pack;

import java.util.*;

/**
 * Events are generated here in random order.
 * "columOfEvents" - number of events from user.
 */
public class EventsAction {
    private List<String> listOfEvents = new ArrayList(Arrays.asList("night", "thunder", "rain", "the zookeeper_is_here", "feeding_animals"));
    protected void eventsActions(){
        Scanner sc = new Scanner(System.in);
        int columOfEvents= sc.nextInt();
        sc.close();
        for (int i=1;i<=columOfEvents;i++){
            Collections.shuffle(listOfEvents);
            System.out.println("*********************");
            Publisher publisher=new Publisher();
            publisher.originEventAndNotification(listOfEvents.get(0));
        }
    }
}
