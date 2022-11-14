
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * DIITHIYASRI A/P ANPARASAN - 1191302662
 * EROSHINI A/P MOHAN - 1181101131
 * THANISHVEN RAO A/L MADHAVA RAO - 1171102165
 */
public class propertySaveTester {
    public static void main(String[] args) throws Exception {
        // construct a fitness class
        Landlord one = new Landlord("Limkokwing", "Malaysia", "0175552420", "2468965R", "Up to date");
        Landlord two = new Landlord("Thanishven", "India", "0124102000", "3928652R", "Up to date");
        ArrayList<Landlord> landlordList = new ArrayList<Landlord>();
        landlordList.add(one);
        landlordList.add(two);
        
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("files/landlordTest.data"));
   		os.writeObject(landlordList);
   		os.close();
    }
}
