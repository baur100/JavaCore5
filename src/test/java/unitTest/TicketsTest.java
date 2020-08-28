package unitTest;

import lessons14.Tickets;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TicketsTest {
    @Test
    public void testInfant_freeTicket(){
        // Arrange - Given
        Tickets ticket = new Tickets(1000);
        // Act - When
        Double result = ticket.getPrice(1);
        // Assert - Then
        Assert.assertEquals(result,0.0);
    }


    @Test
    public void test_Child_halfPrice(){
        Tickets tickets = new Tickets(500);
        Double result = tickets.getPrice(10);
        Assert.assertEquals(result,250.0);
    }
    @Test
    public void testAdult_fullPrice(){
        Tickets tickets = new Tickets(500);
        Double result = tickets.getPrice(20);
        Assert.assertEquals(result,500.0);
    }
    @Test
    public void testSenior_80percentPrice(){
        Tickets tickets = new Tickets(500);
        Double result = tickets.getPrice(70);
        Assert.assertEquals(result,400.0);
    }
}
