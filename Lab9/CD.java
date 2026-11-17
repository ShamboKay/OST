package Lab9;


public class CD extends LibraryItem implements LoanItem {
    private String band;
    private String title;
    private int numTracks;

    public CD(String type, String ID, String band, String title, int numTracks) {
        super(type, ID);
        this.band = band;
        this.title = title;
        this.numTracks = numTracks;
    }

    @Override
    public double calculatePrice() {
        return numTracks * 0.50;
    }

    @Override
    public String toString() {
        return super.toString() + ", Title: " + title + ", Band: " + band + ", Tracks: " + numTracks;
    }
}
