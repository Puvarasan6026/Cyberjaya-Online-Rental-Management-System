
import java.io.Serializable;

/*
 * DIITHIYASRI A/P ANPARASAN - 1191302662
 * EROSHINI A/P MOHAN - 1181101131
 * THANISHVEN RAO A/L MADHAVA RAO - 1171102165
 */

public class Property extends PropertyRent implements Serializable{
    
    private final int propertyID_;
    private String address_;
    private String beds_;
    private String rooms_;
    private String bathrooms_;
    private String facilities_;
    private String propertyType_;
    private String rentAmount_;
    private String propertyStatus_;
    private static int nextPropertyID_ = 1;
        
    public Property(){
        propertyID_ = getNextPropertyID_();
        setAddress_("Unassigned");
        setBeds_("Unassigned");
        setRooms_("Unassigned");
        setBathrooms_("Unassigned");
        setFacilities_("Unassigned");
        setPropertyType_("Unassigned");
        setRentAmount_("Unassigned");
        setPropertyStatus_("Unassigned");
    }
    
    public Property(String address, String beds,String rooms,String bathrooms,String facilities, String pType, String rent, String pStatus){
        propertyID_ = getNextPropertyID_();
        nextPropertyID_++;
        setAddress_(address);
        setBeds_(beds);
        setBeds_(rooms);
        setBeds_(bathrooms);
        setFacilities_(facilities);
        setPropertyType_(pType);
        setRentAmount_(rent);
        setPropertyStatus_(pStatus);
    }
          
    public int getPropertyID_(){
	return propertyID_;
    }
    
    public static int getNextPropertyID_(){
        if(HomeScreenGUI.propertyAvailable.isEmpty()){
            int Id = nextPropertyID_;
            nextPropertyID_++;
            return Id;
        }
        else{
            int Id = HomeScreenGUI.propertyAvailable.get(HomeScreenGUI.propertyAvailable.size() - 1).getPropertyID_();
            return (Id +1);
        }
    }
    
    public void setAddress_(String address){
    	address_ = address;
    }
    
    public String getAddress_(){
	return address_;
    }
    
    public void setBeds_(String beds){
        beds_ = beds;
    }
    
    public String getBeds_(){
        return beds_;
    }
    
      public void setRooms_(String rooms){
        rooms_ = rooms;
    }
    
    public String getRooms_(){
        return rooms_;
       
    }
    
      public void setBathrooms_(String bathrooms){
        bathrooms_ = bathrooms;
    }
    
    public String getBathrooms_(){
        return bathrooms_;
    }
    
       
        public void setFacilities_(String facilities){
        facilities_ = facilities;
    }
    
    public String getFacilities_(){
        return facilities_;
    }
    
    public void setPropertyType_(String pType){
        propertyType_ = pType;
    }
    
    public String getPropertyType_(){
        return propertyType_;
    }
    
    public void setRentAmount_(String rent){
        rentAmount_ = rent;
    }
    
    public String getRentAmount_(){
        return rentAmount_;
    }
    
    public void setPropertyStatus_(String pStatus){
        propertyStatus_ = pStatus;
    }
    
    public String getPropertyStatus_(){
        return propertyStatus_;
    }
        
    public String toString(){
		return "\n" + super.toString()+ "\nProperty ID: " + this.getPropertyID_() + "\nAddress: " + this.getAddress_() +
			"\nBeds: " + this.getBeds_() +"\nRooms: " + this.getRooms_()+"\nBathrooms: " + this.getBathrooms_()+ "\nFacilities: " + this.getFacilities_()  + "\nProperty Type: " + this.getPropertyType_()  + "\nRent Amount: " + this.getRentAmount_() +
                        "\nProperty Status: " + this.getPropertyStatus_();
	}
}
