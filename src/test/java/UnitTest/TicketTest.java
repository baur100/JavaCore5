package UnitTest;

import lesson14.Tickets;                                           //ПРАВИЛА ТЕСТИРОВАНИЯ
import org.testng.Assert;                                   // PRIVATE FUNCTION  НЕ ТЕСТИРУЮТСЯ
import org.testng.annotations.Test;                        //  
// Unit tests  тестируют только методы внутри 1 класса
public class TicketTest {
    @Test
    public void testInfant_freeTicket() {
        //Arrange   /Given
        Tickets ticket = new Tickets(1000);
        //Act       /When
        double result = ticket.getPrice(1);
        //Assert    /Then
        Assert.assertEquals(result, 0.0);
    }

    @Test
    public void testChild_halfPrice() {
        //Arrange   /Given
        Tickets ticket = new Tickets(500);
        //Act       /When
        double result = ticket.getPrice(10);
        //Assert    /Then
        Assert.assertEquals(result, 250.0);
    }

    @Test
    public void testAdult_fullPrice() {
        //Arrange   /Given
        Tickets ticket = new Tickets(1000);
        //Act       /When
        double result = ticket.getPrice(30);
        //Assert    /Then
        Assert.assertEquals(result, 1000.0);
    }

    @Test
    public void testSenior_80Price() {
        //Arrange   /Given
        Tickets ticket = new Tickets(1000);
        //Act       /When
        double result = ticket.getPrice(70);
        //Assert    /Then
        Assert.assertEquals(result, 800.0);
    }
}
