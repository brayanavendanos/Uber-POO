from Payment import Payment 

class Card(Payment):
    id = int
    card_name = str
    card_number = int
    ccv = int
    expiration_date = int
    address = str
    
    def __init__(self, id, card_name, card_number, ccv, expiration_date, address):
        
        super().__init__(id)
        self.card_name = card_name
        self.card_number = card_number
        self.ccv = ccv
        self.expiration_date = expiration_date
        self.address = address