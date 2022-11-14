/*
 * DIITHIYASRI A/P ANPARASAN - 1191302662
 * EROSHINI A/P MOHAN - 1181101131
 * THANISHVEN RAO A/L MADHAVA RAO - 1171102165
 */

public class TenantTest {
    public static void main(String[] args) {
        Tenant t1 = new Tenant();
	Tenant t2 = new Tenant("Eroshini", "123 jalan langsat kampung tunku putra kulim kedah", "0133377206", "2638649R ","available");
        
        //Test the Null Constructor
        System.out.println(t1);
        
        //Test the Full argument Constructor
	System.out.println(t2);
        
        //Test the set method(Name)
        t1.setName("Eroshini");
        System.out.println(t1.toString());
        
        //Test the set method(Address)
        t1.setAddress("123 jalan langsat kampung tunku putra kulim kedah");
        System.out.println(t1.toString());
        
        //Test the set medhod(PhoneNumber)
        t1.setPhoneNumber("0133377206");
        System.out.println(t1.toString());
        
        
        
        //Test the set medhod(LandlordStatus)
        t1.setTenantStatus("available");
        System.out.println(t1.toString());
        
        //test the get method(Name)
	System.out.println(t1.getName());
        
        //test the get method(Address)
	System.out.println(t1.getAddress());
        
        //test the get method(PhoneNumber)
	System.out.println(t1.getPhoneNumber());
        
       
        
        //test the get method(TenantStatus)
	System.out.println(t1.getTenantStatus());
    }
}
