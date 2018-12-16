public class Quote {

    public String text;
    public String author;

    public Quote(String text, String author) {
        this.text = text;
        this.author = author;
    }

    // Only for saving Ron Swanson quotes
    public Quote(String text) {
        this.text = text;
        this.author = "Ron Swanson";
    }

    @Override
    public String toString() {
        return text + " - " + author;
    }

}
