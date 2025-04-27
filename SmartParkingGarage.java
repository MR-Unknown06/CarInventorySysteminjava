
/**
 * Write a description of class MainClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SmartParkingGarage
{
  public static void main(String[] args){
    Vehicle Van = new Vehicle("AKHDK-J-5394","Van",10);
    Vehicle Car = new Vehicle("TFA-O-1671","Car",7);
    Vehicle Motercycle = new Vehicle("TABS-U-6373","Motercycle",12);
    Vehicle Truck = new Vehicle("POAS-T-2173","Truck",8);
    Van.park();
    Van.getDetails();
    Van.exit(19);
    Truck.park();
    Truck.getDetails();
    Truck.exit(14);
    Motercycle.park();
    Motercycle.getDetails();
    Motercycle.exit(17);
    Car.park();
    Car.getDetails();
    Car.exit(12);
  }
}
