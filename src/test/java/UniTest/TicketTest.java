package UniTest;

import org.testng.annotations.Test;
import work14.Tickets;

public class TicketTest {
    @Test
    public void testInfant_freeTicket(){
//        Arrange - Given
        Tickets tickets = new Tickets(1000);
//        Act - When
        Doubleresult = tickets.getPrice();
//        Assert - Then
    }
}
