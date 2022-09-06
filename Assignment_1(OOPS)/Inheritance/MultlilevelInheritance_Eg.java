class HomePage{  
    void Categories(){
	System.out.println("Categories contains the catergories of the courses");}  
    } 
 
class Profile extends HomePage{  
    void Edit_Profile(){
	System.out.println("Edit Profile contains Users can edit the profile");}  
	}  

class Notifications extends HomePage{  
    void Notification_Settings(){
	System.out.println("In Notification Settings users can modify the settings");
}  

}  

class MultlilevelInheritance_Eg{  
    public static void main(String args[]){  
    	Notifications n = new Notifications ();  
   	n.Categories();  
    	//n.Edit_Profile();  
    	n.Notification_Settings();  
    }
}  