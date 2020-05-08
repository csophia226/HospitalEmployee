//HospitalEmployee.java     Java Foundations
// Solution to Programming Project 8.2

public class HospitalEmployee

{
   protected String name;
   protected int number;
   
   public HospitalEmployee(String empName, int empNumber)
   {
      name = empName;
      number = empNumber;
   }
   
   public void setName(String empName)
   {
      name = empName;
   }
   
   public void setNumber(int empNumber)
   {
      number = empNumber;
   }
   
   public String getName()
   {
      return name;
   }
   
   public int getNumber()
   {
      return number;
   }
 
   public String toString()
   {
      return name + "/+" + number;
   }
   
   public void work()
   {
      System.out.println(name + " works at hospital.");
   }
}
      