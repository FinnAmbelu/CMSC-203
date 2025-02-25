/*
 * Class: CMSC203 31274
 * Instructor: Professor Ahmed Tarek
 * Description: Program simulates managing patient records and medical procedures using three Java classes.
 * Due: 02/25/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   		Fsihatsion A.Ambelu(Finn)
*/


public class Patient {
    public Patient() {
        this.firstName = "";
        this.middleName = "";
        this.lastName = "";
        this.address = "";
        this.city = "";
        this.state = "";
        this.zip = "";
        this.phone = "";
        this.emergencyName = "";
        this.emergencyPhone = "";
    }
    private String firstName, middleName, lastName;
    private String address, city, state, zip;
    private String phone;
    private String emergencyName, emergencyPhone;

    public Patient(String fName, String mName, String lName, String addr, String city, String state, String zip, String phone, String eName, String ePhone) {
        this.firstName = fName;
        this.middleName = mName;
        this.lastName = lName;
        this.address = addr;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.emergencyName = eName;
        this.emergencyPhone = ePhone;
    }

    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    public String buildAddress() {
        return address + " " + city + " " + state + " " + zip;
    }

    public String buildEmergencyContact() {
        return emergencyName + " " + emergencyPhone;
    }

    @Override
    public String toString() {
        return "Patient info:\n" +
               "\tName: " + buildFullName() + "\n" +
               "\tAddress: " + buildAddress() + "\n" +
               "\tEmergency Contact: " + buildEmergencyContact() + "\n";
    }
}
