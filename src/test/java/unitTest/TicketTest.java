package unitTest;

import lesson14.Tickets;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TicketTest {
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
    public void testChild_halfPrice(){
        // Arrange
        Tickets ticket = new Tickets(500);

        //Act
        Double result = ticket.getPrice(10);

        //Assert
        Assert.assertEquals(result,250.0);
    }

    @Test
    public void testAdult_fullPrice(){
        // Arrange
        Tickets ticket = new Tickets(500);

        //Act
        Double result = ticket.getPrice(20);

        //Assert
        Assert.assertEquals(result,500.0);
    }
    @Test
    public void testSenior_80percentPrice(){
        // Arrange
        Tickets ticket = new Tickets(500);

        //Act
        Double result = ticket.getPrice(70);

        //Assert
        Assert.assertEquals(result,400.0);
    }
}
