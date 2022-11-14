/*
 * DIITHIYASRI A/P ANPARASAN - 1191302662
 * EROSHINI A/P MOHAN - 1181101131
 * THANISHVEN RAO A/L MADHAVA RAO - 1171102165
 */

public class PropertyTest {
    public static void main(String[] args) {
        Property p1 = new Property();
        Property p2 = new Property();
        
        //test null constructor
        System.out.println(p1);
	//test the full argument constructor
	System.out.println(p2);
        
        //Test the set method(Address)
        p1.setAddress_("Garden Residence");
        System.out.println(p1.toString());
        
        //Test the set method(Beds)
        p1.setBeds_("3");
        System.out.println(p1.toString());
        
        //Test the set method(Property Type)
        p1.setPropertyType_("Condominium");
        System.out.println(p1.toString());
        
        //Test the set method(Rent)
        p1.setRentAmount_("RM1200");
        System.out.println(p1.toString());
        
        //Test the set method(Property Status)
        p1.setPropertyStatus_("available");
        System.out.println(p1.toString());
        
        //test the get method(Address)
	System.out.println(p1.getAddress_());
        
        
        
        //test the get method(Facilities)
	System.out.println(p1.getFacilities_());
        
        //test the get method(Property Type)
	System.out.println(p1.getPropertyType_());
        
        //test the get method(Rent)
	System.out.println(p1.getRentAmount_());
        
        //test the get method(Property Status)
	System.out.println(p1.getPropertyStatus_());
}
}