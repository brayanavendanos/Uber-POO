<?php
    require_once("Payment.php");
    class Card extends Payment {
        public $id;
        public $cardName;
        public $cardType;
        public $cvv;
        public $expirationDay;
        public $address;

        public function __construct($id, $cardName, $cardType, $cvv, $expirationDay, $address){
            parent::__construct($id);
            $this -> $cardName = $cardName;
            $this -> $cardType = $cardType;
            $this -> $cvv = $cvv;
            $this -> $expirationDay = $expirationDay;
            $this -> $address = $address;
        }
    }
?>