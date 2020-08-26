package hw11;

public class Jewelry {

    private String necklace;
    private String ring;
    private String bracelet;
    private String earrings;

    public Jewelry(String necklace, String ring, String bracelet, String earrings) {
        this.necklace = necklace;
        this.ring = ring;
        this.bracelet = bracelet;
        this.earrings = earrings;
    }

    public String getNecklace() {
        return necklace;
    }

    public void setNecklace(String necklace) {
        this.necklace = necklace;
    }

    public String getRing() {
        return ring;
    }

    public void setRing(String ring) {
        this.ring = ring;
    }

    public String getBracelet() {
        return bracelet;
    }

    public void setBracelet(String bracelet) {
        this.bracelet = bracelet;
    }

    public String getEarrings() {
        return earrings;
    }

    public void setEarrings(String earrings) {
        this.earrings = earrings;
    }
}
