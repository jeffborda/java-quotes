public class Quote {

    private String text;
    private String[] tags;
    private String author;
    private String likes;

    public Quote(String text, String[] tags, String author, String likes) {
        this.text = text;
        this.tags = tags;
        this.author = author;
        this.likes = likes;
    }

    public String toAuthorAndTextString() {
        return text + " - " + author;
    }

    public String getText() {
        return text;
    }
}
