import java.util.Arrays;
import java.util.Comparator;

public class TicketComparator implements Comparator<Ticket> {

    @Override
    public int compare(Ticket o1, Ticket o2) {
        if (o1.getPrice() > o2.getPrice()) {
            return 1;
        } else {
            if (o1.getPrice() < o2.getPrice()) {
                return -1;
            }
        }
        return 0;
    }


}
