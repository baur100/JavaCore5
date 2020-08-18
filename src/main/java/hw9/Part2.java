package hw9;

public class Part2 {
    public static void main(String[] args) {
        University un1=new University();
        un1.publicname="Miami Technical University";
        un1.address="2020 NW 20th St, Hialeah, FL";
        un1.code=954;
        un1.cellfon= 6788444;

        un1.numbers();

        University un2=new University();
        un2.publicname="Florida New Technological University";
        un2.address="19 S Jonson St, Hollywood, FL";
        un2.code=305;
        un2.cellfon= 9999444;

        un2.numbers();
    }
}
