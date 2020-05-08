// Hospital.java

public class Hospital
{
   public static void main(String[] args)
   {
      HospitalEmployee vito = new HospitalEmployee("Vito", 12);
      Doctor michael = new Doctor("Michael", 234, "Heart");
      Nurse sonny = new Nurse("Sonny", 789, 6);
      
      
      System.out.println(vito);
      System.out.println(michael);
      System.out.println(sonny);
      
      
      vito.work();
      michael.diagnose();
      sonny.assist();
   }
}