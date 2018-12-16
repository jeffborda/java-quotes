public class Quote {

    private String author;
    private String text;

    public Quote(String author, String text) {
        this.author = author;
        this.text = text;
    }

    // Only for saving Ron Swanson quotes
    public Quote(String text) {
        this.text = text;
        this.author = "Ron Swanson";
    }

    public String toAuthorAndTextString() {
        return text + " - " + author;
    }

}
