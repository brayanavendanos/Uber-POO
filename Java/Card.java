public class Card extends Payment{

    Integer numberCard;
    String dateCard;
    String cvv;
    String address;

    public Card(Integer id, Integer numberCard, String dateCard, String cvv, String address){
        super(id);
        this.numberCard = numberCard;
        this.dateCard = dateCard;
        this.cvv = cvv;
        this.address = address;
    }
    
}
