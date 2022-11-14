/*
 * DIITHIYASRI A/P ANPARASAN - 1191302662
 * EROSHINI A/P MOHAN - 1181101131
 * THANISHVEN RAO A/L MADHAVA RAO - 1171102165
 */

public class LandlordTest {
    public static void main(String[] args) {
        Landlord l1 = new Landlord();
	Landlord l2 = new Landlord("Diithiyasri", "Sungai Petani", "012-4528981", "12344567R", "Available");
        
        //Test the Null Constructor
        System.out.println(l1);
        
        //Test the Full argument Constructor
	System.out.println(l2);
        
        //Test the set method(Name)
        l1.setName("Adam");
        System.out.println(l1.toString());
        
        //Test the set method(Address)
        l1.setAddress("Kuala Muda, Sungai Petani");
        System.out.println(l1.toString());
        
        //Test the set medhod(PhoneNumber)
        l1.setPhoneNumber("012-4528981");
        System.out.println(l1.toString());
        
      
        
        //Test the set medhod(LandlordStatus)
        l1.setLandlordStatus("Available");
        System.out.println(l1.toString());
        
        //test the get method(Name)
	System.out.println(l1.getName());
        
        //test the get method(Address)
	System.out.println(l1.getAddress());
        
        //test the get method(PhoneNumber)
	System.out.println(l1.getPhoneNumber());
        
       
        //test the get method(LandlordStatus)
	System.out.println(l1.getLandlordStatus());
    }
}
