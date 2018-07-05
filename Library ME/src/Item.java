public abstract class Item {

    private int barcodeNo;
    private boolean availability;

    public Item( int barcodeNo, boolean availability){

        this.setBarcodeNo(barcodeNo);
        this.setAvailability(availability);

    }

    public int getBarcodeNo() {
        return barcodeNo;
    }

    public void setBarcodeNo(int barcodeNo) {
        this.barcodeNo = barcodeNo;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
