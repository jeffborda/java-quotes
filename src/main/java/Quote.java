public class Quote {

    private String text;
    private String[] tags;
    private String author;
    private String likes;

    public String toAuthorAndTextString() {
        return text + " - " + author;
    }
}
