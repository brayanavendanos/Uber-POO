from Car import *
from Account import Account
from UberX import UberX
from Driver import Driver

if __name__ == "__main__":
    print("Hola mundo")
    
    car = Car("AMS234", Account("Julio Lozano", "AND876"))
    print(vars(car))
    print(vars(car.driver))
    
    print("UberX")
    uberx = UberX("ASD123", Driver("Roberto Alfonso Trujillo", "123123", "roberto@gmail.com", "passwoRD*"), "Toyota", "TXL")
    print(vars(uberx))
    print(vars(uberx.driver))