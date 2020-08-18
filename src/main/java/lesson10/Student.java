package lesson10;

public class Student {
    private String name;
    private String lastname;
    private String collegename;
    private Subjects major;

    public Student(String n, String l, String cn, Subjects m){
        this.name=n;
        this.lastname=l;
        this.collegename=cn;
        this.major=m;
    }
    public String getName(){    //SET and GET дают возможность устанавливать или выводить на печать определенные парамерътры обьекта
        return name;
    }
    public String getLastname(){
        return lastname;
    }
    public String getcollegeName(){
        return collegename;
    }
    public  void se5tName(String name){
        this.name=name;
    }
    public void setLastname(String lastname){
        this.lastname=lastname;
    }


}
