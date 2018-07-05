public class Book extends Item {

    private String genre;

    public Book(int barcodeNo , String genre, boolean availability){
        super(barcodeNo, availability);

        this.setGenre(genre);
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
