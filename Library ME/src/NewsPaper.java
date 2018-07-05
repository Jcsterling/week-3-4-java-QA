public class NewsPaper extends Item {

    private String type;

    public NewsPaper(int barcodeNo, String type, boolean availability){
        super(barcodeNo,availability);

        this.setType(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
