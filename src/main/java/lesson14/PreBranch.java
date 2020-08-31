package lesson14;

public class PreBranch {
    private String address;
    private int number;

    public PreBranch(int number,String address){
        this.number=number;
        this.address=address;
    }
    public void setAddress(String NewAddress){
        this.address=NewAddress;
    }
    public String getAddress(){
        return address;
    }
    public void setNumber(int NewNumber){
        this.number=NewNumber;
    }
    public int getNumber(){
        return number;
    }

}
