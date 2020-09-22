package unitTest;

import lesson14.Tickets;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TicketTestParametrization_my {
    @DataProvider (name = "Ages")
    public Object [][] createData(){
        return new Object[][]{
                {1000,1,0.0},
                {500,10,250.0},
                {500,20,500.0},
                {500,70,400.0}
        };
    }
    @Test (dataProvider = "Ages")
    public void testTicket_checkPrice(int fare, int age, double price) {
        // Arrange - Given
        Tickets ticket = new Tickets(fare);

        // Act - When
        Double result = ticket.getPrice(age);

        // Assert - Then
        Assert.assertEquals(result, price);
    }
}
