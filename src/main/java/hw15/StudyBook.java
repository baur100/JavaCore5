package hw15;

public class StudyBook implements Hardbook {
    private String sBName;
    private String subject;
    private int sBPrice;

    public StudyBook(String sBName, String subject, int sBPrice) {
        this.sBName = sBName;
        this.subject = subject;
        this.sBPrice = sBPrice;
    }

    public void hardCover(){
        System.out.println( "Study book " + sBName + " was reedited to hard book version in 2019");

    }

    public void printOnParer() {
        System.out.println("Study Book" + sBName + " has printed and audio version");

    }



    public String aboutStudy(String sBName) {
        return "StudyBook{" +
                "sBName='" + sBName + '\'' +
                ", subject='" + subject + '\'' +
                ", sBPrice=" + sBPrice +
                '}';
    }
}
