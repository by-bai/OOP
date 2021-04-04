
public class ElectronicBook extends Book implements Comparable<ElectronicBook> {

    private MyDate date;

    public ElectronicBook(String title, int price, String[] authors, MyDate expiryDate) {
        super(title, price, authors);
        date = expiryDate; 
    }

    public int getPriceInCents() { 
        return Math.round(super.getPriceInCents() * 7/9);
        // return (super.getPriceInCents() / 9) * 7; 
    }

    public MyDate getExpiryDate() {
        return date;
    }

    public boolean equals(Object another) {
        if (another == null) {
            return false;
        }
        if (another instanceof ElectronicBook) {
            ElectronicBook e = (ElectronicBook) another;
            return super.equals(e) && getExpiryDate().equals(e.getExpiryDate());
        }
        return false;
    }

    public int compareTo(ElectronicBook o) {
        //getTitle is inherited from Book

        //TITLE
        int i = getTitle().compareTo(o.getTitle());
        if (i != 0) {
            return i;
        }

        //EXPIRY DATE
        int j = getExpiryDate().compareTo(o.getExpiryDate());
        if (j != 0) {
            return j;
        }

        return -1;

        //TO-DO: AUTHORS


    }

    public String toString() {
        return super.getTitle() + " : " + date.toString(); 
    }

}
