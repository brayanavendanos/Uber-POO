class Main {
    public static void main(String[] args) {

        System.out.println("Loading...");
        
        Car car = new Car("AMQ123", new Account("Andres Herrera", "1123112", "andresherrera@hotmail.com", "123asd123"));
        car.setPassenger(4);
        car.printDataCar();

        Car car2 = new Car("QWE567", new Account("Antonia Ruiz", "123123", "pertulia@hotmail.com", "123ad123"));
        car2.setPassenger(4);
        car2.printDataCar();

        System.out.println("Uber X...");
        UberX uberx = new UberX("123ASD", new Account("Juan bernal", "1238716", "juan@gmail.es", "123asd12"), "Lamborghini", "URUS");
        uberx.setPassenger(4);
        uberx.printDataCar();
        uberx.printDataUberx();

        UberVan uberV = new UberVan("123ASD", new Account("Jose", "5412312", "ubervan@uber.com", "123zdc1213"));
        uberV.setPassenger(6);
        uberV.printDataCar();

    }
}