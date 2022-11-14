
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

/*
 * DIITHIYASRI A/P ANPARASAN - 1191302662
 * EROSHINI A/P MOHAN - 1181101131
 * THANISHVEN RAO A/L MADHAVA RAO - 1171102165
 */

public class RegisterLandlordGUI extends JFrame{
    
    private static final int WIDTH = 900;
    private static final int HEIGHT = 600;
    
    private JLabel nameL, addressLine1L, addressLine2L, addressLine3L, countryL, landLPhoneL, landlordPPSL, landlordStatusL,  landlordIDL, blankL, blank2L;
    private JTextField nameTF, addressLine1TF, addressLine2TF, addressLine3TF, countryTF, landLPhoneTF, landlordPPSTF, landlordStatusTF, landlordIDTF;
    private String[] countries = {"Malaysia","India","Bangladesh","Thailand","Indonesia","China","Saudi Arabia","Sri Lanka","Pakistan",
            "Afghanistan","Japan","Korea","United States","United Kingdom","France","Spain","Russia","South Africa","Australia","Italy","Maldives",
            "Singapore","Sweden"};
    private JComboBox countryComboBox;
    private JButton addB, cancelB;
    
    public RegisterLandlordGUI(){
        
        //Setting Font Properties
        Font myFont = new Font("Times New Roman", Font.BOLD, 20);
        
        //Instantiate the labels
        nameL = new JLabel("Landlord Name: " , SwingConstants.RIGHT);
        addressLine1L = new JLabel("Address Line 1: ", SwingConstants.RIGHT);
        addressLine2L = new JLabel("Address Line 2: ", SwingConstants.RIGHT);
        addressLine3L = new JLabel("Address Line 3: ", SwingConstants.RIGHT);
        countryL = new JLabel("Country: ", SwingConstants.RIGHT);
        landLPhoneL = new JLabel("Contact No: ", SwingConstants.RIGHT);
        landlordStatusL = new JLabel("Landlord Status: ", SwingConstants.RIGHT);
        landlordIDL = new JLabel("Landlord's ID Number: ", SwingConstants.RIGHT);
        blankL = new JLabel("", SwingConstants.RIGHT);
        blank2L = new JLabel("", SwingConstants.RIGHT);
        
        //Text Fields:
        nameTF = new JTextField(10);
        addressLine1TF = new JTextField(10);
        addressLine2TF = new JTextField(10);
        addressLine3TF = new JTextField(10);
        countryTF = new JTextField(10);
        landLPhoneTF = new JTextField(10);
        landlordPPSTF = new JTextField(10);
        landlordStatusTF = new JTextField(10);
        landlordIDTF = new JTextField(10);
        landlordIDTF.setEditable(false);

        //County Drop Down Menu
        countryComboBox = new JComboBox(countries);
        
        
         //Buttons:
        //Add Button
        addB = new JButton("Add Landlord");
        addB.setFont(myFont);
        addB.setToolTipText("Click to submit details to the system.\n NOTE: Make sure details are correct with landlord");
        addB.addActionListener(ae->{
            Landlord l1 = new Landlord();
            l1.setName(nameTF.getText());
            l1.setAddress(addressLine1TF.getText() + "\n" + addressLine2TF.getText() + "\n" + addressLine3TF.getText() + "\n" + countryComboBox.getSelectedItem());
            l1.setPhoneNumber(landLPhoneTF.getText());
            l1.setLandlordStatus(landlordStatusTF.getText());             
            HomeScreenGUI.landlordList.add(l1);   //Add to the landlord arrayList declared in the Home Screen
            landlordIDTF.setText(""+l1.getLandlordID());
            JOptionPane.showMessageDialog(null, "Landlord added to landlord list!");
        });
        
        //Cancel Button
        cancelB = new JButton("Cancel");
        cancelB.setFont(myFont);
        cancelB.addActionListener(ae->{
            setVisible(false);
            dispose();
        });
        
        setLayout(new GridLayout(11, 2));

        //Add components to the JFrame
        add(nameL);
        add(nameTF);
        add(addressLine1L);
        add(addressLine1TF);
        add(addressLine2L);
        add(addressLine2TF);
        add(addressLine3L);
        add(addressLine3TF);
        add(countryL);
        add(countryComboBox);
        add(landLPhoneL);
        add(landLPhoneTF);
        add(landlordStatusL);
        add(landlordStatusTF);
        add(landlordIDL);
        add(landlordIDTF);
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
