class Card extends Payment{
    constructor(id, cardName, cardNumber, cvv, expirationDate, address){
        super(id);
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
        this.address = address;
    }
}