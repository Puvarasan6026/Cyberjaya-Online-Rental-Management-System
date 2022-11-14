
import java.io.Serializable;

/*
 * DIITHIYASRI A/P ANPARASAN - 1191302662
 * EROSHINI A/P MOHAN - 1181101131
 * THANISHVEN RAO A/L MADHAVA RAO - 1171102165
 */

public class Person implements Serializable{
    
    private String name_;
    private String address_;
    private String phoneNumber_;
    
    
    public Person() {
    	name_ = "";
    	address_ = "";
    	phoneNumber_ = "";
       
    }
       
    public Person (String name, String address, String phone, String pps) {
    	setName(name);
        setAddress(address);
    	setPhoneNumber(phone);
        
    }
    
    public void setName(String name){
    	name_ = name;
    }

    public String getName(){
    	return name_;
    }
    
    public void setAddress(String address){
        address_ = address;
    }
    
    public String getAddress(){
        return address_;
    }
    
    public void setPhoneNumber(String phone){
        phoneNumber_ = phone;
    }
    
    public String getPhoneNumber(){
        return phoneNumber_;
    }
    
   
    
    public String toString(){
    	return "Name: "+ this.getName() +"\nAddress: "+ this.getAddress()+"\nPhone Number: "+ this.getPhoneNumber();
    }
    
}
