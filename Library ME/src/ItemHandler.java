import java.util.ArrayList;

public class ItemHandler {

    ArrayList<Book>bookArrayList;
    ArrayList<Journal>journalArrayList;
    ArrayList<NewsPaper>newsPaperArrayList;


    public ItemHandler(){
        bookArrayList = new ArrayList<>();
        journalArrayList = new ArrayList<>();
        newsPaperArrayList = new ArrayList<>();

    }
    public void addBook(Book b){
        this.bookArrayList.add(b);

    }

    public void addJournal( Journal j){
        this.journalArrayList.add(j);

    }

    public void addNewsPaper(NewsPaper n){
        this. newsPaperArrayList.add(n);

    }

    public void removeBook(Book b){
        this.bookArrayList.remove(b);

    }

    public  void removeJournal(Journal j){
        this.journalArrayList.remove(j);

    }

    public  void removeNewspapers(NewsPaper n){
        this.newsPaperArrayList.remove(n);

    }

    public void updateBook(int barcodeNo, Book b){

        int position = getPositionOfBook(barcodeNo);
        if (position != -1){

            bookArrayList.add(position,b);
        }

    }
    public void updateJournal(int barcodeNo, Journal j){
        int position = getPositionOfJournal(barcodeNo);
        if(position != -1){
            journalArrayList.add(position,j);
        }


    }
    public void updateNewsPaper(int barcodeNo, NewsPaper n){
        int position = getPositionOfNewsPaper(barcodeNo);
        if(position != -1) {
            newsPaperArrayList.add(position, n);
        }
    }

    public int getPositionOfBook(int barcodeNo){
        int indexPosition = 0;
        int foundPosition = -1;

        for (Book b: bookArrayList) {
            if (b.getBarcodeNo() == barcodeNo) {
                foundPosition = indexPosition;
            }
            indexPosition++;

        }
        return foundPosition;

    }

    public int getPositionOfJournal(int barcodeNo){
        int indexPosition = 0;
        int foundPosition = -1;

        for (Journal j: journalArrayList) {
            if (j.getBarcodeNo() == barcodeNo) {
                foundPosition = indexPosition;
            }
            indexPosition++;

        }
        return foundPosition;

    }

    public int getPositionOfNewsPaper(int barcodeNo){

        int indexPosition = 0;
        int foundPosition = -1;

        for (NewsPaper n: newsPaperArrayList) {
            if (n.getBarcodeNo() == barcodeNo) {
                foundPosition = indexPosition;
            }
            indexPosition++;

        }
        return foundPosition;
    }





    public Book getBook(int barcodeNo) {
        return bookArrayList.get(getPositionOfBook(barcodeNo));

    }
    public NewsPaper getNewspaper(int barcodeNo) {
        return newsPaperArrayList.get(getPositionOfNewsPaper(barcodeNo));
    }

    public Journal getJournal(int barcodeNo) {
        return  journalArrayList.get(getPositionOfJournal(barcodeNo));


    }






}
