
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


/*
 * DIITHIYASRI A/P ANPARASAN - 1191302662
 * EROSHINI A/P MOHAN - 1181101131
 * THANISHVEN RAO A/L MADHAVA RAO - 1171102165
 */

public class RecordNewPropertyGUI extends JFrame{
    
    private static final int WIDTH = 900;
    private static final int HEIGHT = 600;
    
    private JLabel addressLine1L, addressLine2L, addressLine3L, countryL, bedsL,roomsL,bathroomsL, facilitiesL, propertyTypeL, rentAmountL, propertyStatusL, landlordL, propertyIDL, blankL, blank2L;
    private JTextField addressLine1TF, addressLine2TF, addressLine3TF, countryTF, bedsTF,roomsTF,bathroomsTF, facilitiesTF, propertyTypeTF, rentAmountTF, propertyStatusTF, landlordTF, propertyIDTF;
    private String[] countries = {"Malaysia","India","Bangladesh","Thailand","Indonesia","China","Saudi Arabia","Sri Lanka","Pakistan",
            "Afghanistan","Japan","Korea","United States","United Kingdom","France","Spain","Russia","South Africa","Australia","Italy","Maldives",
            "Singapore","Sweden"};
    private JComboBox countryComboBox;
    private JButton addB, cancelB;
    
    public RecordNewPropertyGUI(){
        
        //Setting Font Properties
        Font myFont = new Font("Times New Roman", Font.BOLD, 20);
        
        //Instantiate the labels
        addressLine1L = new JLabel("Address Line 1: ", SwingConstants.RIGHT);
        addressLine2L = new JLabel("Address Line 2: ", SwingConstants.RIGHT);
        addressLine3L = new JLabel("Address Line 3: ", SwingConstants.RIGHT);
        countryL = new JLabel("County: ", SwingConstants.RIGHT);
        bedsL = new JLabel("Number of Beds: ", SwingConstants.RIGHT);
        roomsL = new JLabel("Number of Rooms: ", SwingConstants.RIGHT);
        bathroomsL = new JLabel("Number of Bathrooms: ", SwingConstants.RIGHT);
        facilitiesL = new JLabel("Facilities: ", SwingConstants.RIGHT);
        propertyTypeL = new JLabel("Property Type: ", SwingConstants.RIGHT);
        rentAmountL = new JLabel("Rent Amount: ", SwingConstants.RIGHT);
        propertyStatusL = new JLabel("Property Status: ", SwingConstants.RIGHT);
        //landlordL = new JLabel("Landlord: ", SwingConstants.RIGHT);
        propertyIDL = new JLabel("Property ID: ", SwingConstants.RIGHT);
        blankL = new JLabel("", SwingConstants.RIGHT);
        blank2L = new JLabel("", SwingConstants.RIGHT);
        
        //Text Fields:
        addressLine1TF = new JTextField(10);
        addressLine2TF = new JTextField(10);
        addressLine3TF = new JTextField(10);
        countryTF = new JTextField(10);
        bedsTF = new JTextField(10);
        roomsTF = new JTextField(10);
        bathroomsTF = new JTextField(10);
        facilitiesTF = new JTextField(10);
        propertyTypeTF = new JTextField(10);
        rentAmountTF = new JTextField(10);
        propertyStatusTF = new JTextField(10);
        //landlordTF = new JTextField(10);
        propertyIDTF = new JTextField(10);
        propertyIDTF.setEditable(false);
        
         //County Drop Down Menu
        countryComboBox = new JComboBox(countries);
        
        //Buttons:
        //Add Button
        addB = new JButton("Add Property");
        addB.setFont(myFont);
        addB.setToolTipText("Click to submit details to the system.\n NOTE: Make sure details are correct");
        addB.addActionListener(ae->{
            Property p1 = new Property();
            p1.setAddress_(addressLine1TF.getText() + "\n" + addressLine2TF.getText() + "\n" + addressLine3TF.getText() + "\n" + countryComboBox.getSelectedItem());
            p1.setBeds_(bedsTF.getText());
            p1.setRooms_(roomsTF.getText());
            p1.setBathrooms_(bathroomsTF.getText());
            p1.setFacilities_(facilitiesTF.getText());
            p1.setPropertyType_(propertyTypeTF.getText());
            p1.setRentAmount_(rentAmountTF.getText());
            p1.setPropertyStatus_(propertyStatusTF.getText());
            HomeScreenGUI.propertyList.add(p1);   //Add to the propertyList arrayList declared in the Home Screen
            HomeScreenGUI.propertyAvailable.add(p1); //Add to the propertyAvailable arrayList declared in the Home Screen
            propertyIDTF.setText(""+p1.getPropertyID_());
            JOptionPane.showMessageDialog(null, "Property added to the property list!");
        });
        
        //Cancel Button
        cancelB = new JButton("Cancel");
        cancelB.setFont(myFont);
        cancelB.addActionListener(ae->{
            setVisible(false);
            dispose();
        });
        
        setLayout(new GridLayout(15, 2));
        
        //Add components to the JFrame
        add(addressLine1L);
        add(addressLine1TF);
        add(addressLine2L);
        add(addressLine2TF);
        add(addressLine3L);
        add(addressLine3TF);
        add(countryL);
        add(countryComboBox);
        add(bedsL);
        add(bedsTF);
        add(roomsL);
        add(roomsTF);
        add(bathroomsL);
        add(bathroomsTF);
        add(facilitiesL);
        add(facilitiesTF);
        add(propertyTypeL);
        add(propertyTypeTF);
        add(rentAmountL);
        add(rentAmountTF);
        add(propertyStatusL);
        add(propertyStatusTF);
        add(propertyIDL);
        add(propertyIDTF);
        add(blankL);
        add(blank2L);
        add(addB);
        add(cancelB);
        
        setTitle("Register new Landlord Screen");
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null); //Position application in center of screen
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        toFront();
    }
}
