package hw10;

import java.util.Arrays;

public class Buyers {
    private String name;
    private int numberpurchases;
    private double payment;
    private Days[] buy;
    private Brand[] purchase;

    //DEFAULT CONSTRUCTION
    public Buyers() {
    }

    ;

    //CONSTRUCTION
    public Buyers(String name1, int numberpurchases1, double payment1, Days[] buy1, Brand[] purchase1) {
        name = name1;
        numberpurchases = numberpurchases1;
        payment = payment1;
        buy = buy1;
        purchase = purchase1;
    }

    public Buyers(int numberpurchases2, double payment2, Days[] buy2, Brand[] purchase2) {
        numberpurchases = numberpurchases2;
        payment = payment2;
        buy = buy2;
        purchase = purchase2;
    }

    public Buyers(String name3, int numberpurchases3, double payment3, Brand[] purchase3) {
        name = name3;
        numberpurchases = numberpurchases3;
        payment = payment3;
        purchase = purchase3;
    }

    public Buyers(double payment4, Days[] buy4, Brand[] purchase4) {
        payment = payment4;
        buy = buy4;
        purchase = purchase4;
    }

    public Buyers(double payment5, Brand[] purchase5) {
        payment = payment5;
        purchase = purchase5;
    }

    public Buyers(String name6, double payment6, Days[] buy6) {
        name = name6;
        payment = payment6;
        buy = buy6;
    }

    public Buyers(String name7, Brand[] purchase7) {
        name = name7;
        purchase = purchase7;
    }

    public Buyers(Days[] buy8, Brand[] purchase8) {
        buy = buy8;
        purchase = purchase8;
    }

    //SETTERS and GETTERS
    public String getName() {
        return name;
    }

    public void setName(String NewName) {
        this.name = NewName;
    }

    public int getNumberpurchases() {
        return numberpurchases;
    }

    public void setNumberP(int NewNumberP) {
        this.numberpurchases = NewNumberP;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double NewPayment) {
        this.payment = NewPayment;
    }

    public Days[] getBuy() {
        return buy;
    }

    public void setDayBuy(Days[] NewDayBuy) {
        this.buy = NewDayBuy;
    }

    public String printDayBuy() {
        return Arrays.toString(buy);
    }

    public Brand[] getPurchase() {
        return purchase;
    }

    public void setPurchase(Brand[] NewPurchase) {
        this.purchase = NewPurchase;
    }

    public String printPurchase() {
        return Arrays.toString(purchase);
    }

    //PRINT ALL ATTRIBUTES
    public void printClass() {
        System.out.println("=============ORDER INFORMATION=============");
        System.out.println(name + " bought on" + printDayBuy() + ". Amount of purchases " + numberpurchases + ", brands such as" + printPurchase());
        System.out.println("Total payment: " + payment);
    }
}
