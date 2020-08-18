package hw9;

public class University {
    private String publicname;
    private  String address;
    private int cellfon;
    private int code;

    public University(String n, String add, int cell, int cd){
        publicname=n;
        address=add;
        cellfon=cell;
        code=cd;
    }
   public void numbers(){
       System.out.println("==============UNIVERSITY INFORMATION================");
       System.out.println(publicname);
       System.out.println(address);
       System.out.println("Contact number: +"+"("+code+")"+cellfon);
   }

}
