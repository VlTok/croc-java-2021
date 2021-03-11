
public class Cage {

    private String size;

    private Dictionary cleaningCage;

    public Cage(String size, Dictionary cleaningCage) {
        this.size = size;
        this.cleaningCage = cleaningCage;
    }

    public Cage() {
        size = "";
        cleaningCage = new Dictionary();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Dictionary getCleaningCage() {
        return cleaningCage;
    }

    public void setCleaningCage(Dictionary cleaningCage) {
        this.cleaningCage = cleaningCage;
    }

    @Override
    public String toString() {
        return "Cage{" +
                "size='" + size + '\'' +
                ", cleaningCage=" + cleaningCage +
                '}';
    }
}
