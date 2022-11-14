

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Eroshini", "123 jalan langsat kampung tunku putra kulim kedah", "0133377206", "1234567R");

        //test null constructor
        System.out.println(p1);
	//test the full argument constructor
	System.out.println(p2);
        
        //Test the set method(Name)
        p1.setName("Eroshini");
        System.out.println(p1.toString());
        
        //Test the set method(Name)
        p1.setAddress("123 jalan langsat kampung tunku putra kulim kedah");
        System.out.println(p1.toString());
        
        //Test the set method(Phone Number)
        p1.setPhoneNumber("0133377206");
        System.out.println(p1.toString());
        
        
        //test the get method(Name)
	System.out.println(p1.getName());
        
        //test the get method(Address)
	System.out.println(p1.getAddress());
        
        //test the get method(Phone Number)
	System.out.println(p1.getPhoneNumber());
        
        
}
}
