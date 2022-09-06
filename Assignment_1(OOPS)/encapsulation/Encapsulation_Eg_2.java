public class EncapEg {
   private String name;
   private String idNum;
   private int age;

   public int getAge() {
      return age;
   }

   public String getName() {
      return name;
   }

   public String getIdNum() {
      return idNum;
   }

   public void setAge( int newAge) {
      age = newAge;
   }

   public void setName(String newName) {
      name = newName;
   }

   public void setIdNum( String newId) {
      idNum = newId;
   }
}

public class Encapsulation_Eg_2 {

   public static void main(String args[]) {
      EncapEg e = new EncapEg();
      e.setName("Ramya");
      e.setAge(24);
      e.setIdNum("Ramya123");

      System.out.print("Name : " + e.getName() + " Age : " + e.getAge());
   }
}