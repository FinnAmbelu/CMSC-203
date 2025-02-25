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

public class Procedure {
    public Procedure() {
        this.procedureName = "";
        this.procedureDate = "";
        this.practitioner = "";
        this.charges = 0.0;
    }
    private String procedureName, procedureDate, practitioner;
    private double charges;

    public Procedure(String name, String date, String practitioner, double charges) {
        this.procedureName = name;
        this.procedureDate = date;
        this.practitioner = practitioner;
        this.charges = charges;
    }

    public double getCharges() {
        return charges;
    }

    @Override
    public String toString() {
        return "\t\tProcedure: " + procedureName + "\n" +
               "\t\tProcedureDate= " + procedureDate + "\n" +
               "\t\tPractitioner= " + practitioner + "\n" +
               "\t\tCharge= " + String.format("$%,.2f", charges) + "\n";
    }
}
