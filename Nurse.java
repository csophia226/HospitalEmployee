//Nurse.java   Java Foundations

public class Nurse extends HospitalEmployee
{

   protected int numPatients;
   
   public Nurse(String empName, int empNumber, int numPat)
   {
      super(empName, empNumber);
      numPatients = numPat;
   }
   
   public void setNumbPatients(int pat)
   {
      numPatients = pat;
   }
   
   public int getNumPatients()
   {
      return numPatients;
   }
   
   public String toString()
   {
      return super.toString() + " has " + numPatients + "patients.";
   }
   
   public void assist()
   {
      System.out.println(name + " is a nurse with " +
              numPatients + " patients.");
   }
}