var car = new Car("AW456", new Account("Andres Herrera", "QWE234"))
car.passenger = 4;
car.printDataCar();

var uberX = new UberX("AW456", new Account("Andrea Ferran", "ANDA76"), "Chevrolet", "Spark")
uberX.passenger = 4;
uberX.printDataCar();
uberX.printDataUberX();

console.log("***User***")
var user = new User("Jorge Riaño", "123123123", "example@gmail.com", "paswroDSW")
user.printDataUser();

