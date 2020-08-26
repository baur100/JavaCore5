package unitTest;

import lesson14.Tickets;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TicketTest {

    @Test
    public void testInfant_freeTicket() {
        //Arrange - given
        Tickets ticket = new Tickets(1000);
        //Act     - when
        Double result = ticket.getPrice(1);
        //Assert  - then
        Assert.assertEquals(result, 0.0);
    }

    @Test

    public void testChild_halfPrice() {
        Tickets ticket = new Tickets(500);

        Double result = ticket.getPrice(10);

        Assert.assertEquals(result, 250);

    }
    @Test
    public void testAdult_fullfPrice() {
        Tickets ticket = new Tickets(500);

        Double result = ticket.getPrice(20);

        Assert.assertEquals(result, 500);
    }
    @Test
    public void testAdult_80percentPrice() {
        Tickets ticket = new Tickets(500);

        Double result = ticket.getPrice(70);

        Assert.assertEquals(result, 400);
    }
}
