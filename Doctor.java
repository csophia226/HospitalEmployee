//Doctor.java   Java Foundations

public class Doctor extends HospitalEmployee
{
   protected String specialty;
   
   public Doctor(String empName, int empNumber, String special)
   {
      super(empName, empNumber);
      specialty = special;
   }
   
   public void setSpecialty(String special)
   {
      specialty = special;
   }
   
   public String getSpecialty()
   {
      return specialty;
   }
   
   public String toString()
   {
      return super.toString() + "\t" + specialty;
   }
   
   public void daignose()
   {
      System.out.println(name + " is a(n) " +specialty + " doctor.");
   }
}

