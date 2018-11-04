package task4;

import task4.model.*;
import task4.util.MarathonHelper;
import task4.util.comparator.TimeComparator;
import task4.view.Menu;

import java.util.List;

public class Task4App {

    private static final List<MarathonParticipant> participants = MarathonHelper.
            createParticipants(MarathonStatistic.getNames(), MarathonStatistic.getTime());
    private static final Menu menu = new Menu();

    public static void main(String[] args) {
        participants.sort(new TimeComparator());
        MarathonHelper.setPlaces(participants);
        menu.printMenu(participants);
    }
}
