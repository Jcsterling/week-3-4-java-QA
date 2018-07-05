public class Journal extends Item {

    private String author;

    public Journal(int barcodeNo, String author, boolean availability){
        super(barcodeNo, availability);

        this.setAuthor(author);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
