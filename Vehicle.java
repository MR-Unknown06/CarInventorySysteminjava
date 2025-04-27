
/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle
{
  public String LicensePlate;
  public String VehicleType;
  public int EntryTime;
     public Vehicle (String LicensePlate,String VehicleType,int EntryTime){
         this.LicensePlate=LicensePlate;
         this.VehicleType=VehicleType;
         this.EntryTime=EntryTime;
     }
     public void park(){
         System.out.println("Vehicles in A23 Parking Garage: ");
         System.out.println("Vehicle "+ VehicleType +" Parked at "+ EntryTime + ":00");
     }
     public void exit(int ExitTime){
         System.out.println("Vehicle "+ VehicleType +" Exited at "+ExitTime + ":00");
         int fee =CalculateFee(ExitTime);
         System.out.println("Parking fee:$"+fee);
         System.out.println();
     }
     public int CalculateFee(int ExitTime){
         int duration=ExitTime - EntryTime;
         int feePerHour=13;
         return duration*feePerHour;
     }
     public void getDetails(){
         System.out.println("Details on Vehicles:");
         System.out.println("License Plate:"+ LicensePlate);
         System.out.println("Vehicle Type:"+ VehicleType);
         System.out.println("Entry Time:"+ EntryTime +":00");
         
     }
}
