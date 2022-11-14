import javax.swing.*;
import java.awt.*;

/*
 * DIITHIYASRI A/P ANPARASAN - 1191302662
 * EROSHINI A/P MOHAN - 1181101131
 * THANISHVEN RAO A/L MADHAVA RAO - 1171102165
 */
public class AmendLandlordGUI extends JFrame {
    
    private static final int WIDTH = 800;
    private static final int HEIGHT = 500;
    
    private JLabel nameL, addressLine1L, addressLine2L, addressLine3L, countryL, landLPhoneL, landlordStatusL,  landlordIDL, blankL, blank2L;
    private JTextField nameTF, addressLine1TF, addressLine2TF, addressLine3TF, countryTF, landLPhoneTF, landlordPPSTF, landlordStatusTF, landlordIDTF;
    private String[] countries = {"Malaysia","India","Bangladesh","Thailand","Indonesia","China","Saudi Arabia","Sri Lanka","Pakistan",
            "Afghanistan","Japan","Korea","United States","United Kingdom","France","Spain","Russia","South Africa","Australia","Italy","Maldives",
            "Singapore","Sweden"};
    private JComboBox countryComboBox;
    private JButton addB, cancelB;
    
    public static Landlord landlord_;
    
    public AmendLandlordGUI(Landlord landlord){
        
        landlord_ = landlord;
        
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
        landLPhoneTF = new JTextField(10);
        landlordPPSTF = new JTextField(10);
        landlordStatusTF = new JTextField(10);
        landlordIDTF = new JTextField(10);
        landlordIDTF.setEditable(false);

        //County Drop Down Menu
        countryComboBox = new JComboBox(countries);
        
        nameTF.setText(landlord_.getName());
        addressLine1TF.setText(landlord_.getAddress());
        landLPhoneTF.setText(landlord_.getPhoneNumber());
        landlordStatusTF.setText(landlord_.getLandlordStatus());
        landlordIDTF.setText(""+landlord_.getLandlordID());
        
         //Buttons:
        //Add Button
        addB = new JButton("Commit Changes");
        addB.setFont(myFont);
        addB.setToolTipText("Click to submit details to the system.\n NOTE: Make sure details are correct with landlord");
        addB.addActionListener(ae->{
            landlord_.setName(nameTF.getText());
            landlord_.setAddress(addressLine1TF.getText());
            landlord_.setPhoneNumber(landLPhoneTF.getText());
            landlord_.setLandlordStatus(landlordStatusTF.getText()); 
            
            landlordIDTF.setText(""+landlord_.getLandlordID());
            JOptionPane.showMessageDialog(null, "Landlord info updated!");
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
        
        setTitle("Edit Landlord Details");
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null); //Position application in center of screen
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        toFront();
    }
}
