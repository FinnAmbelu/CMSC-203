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

public class PatientDriverApp {
    public static void main(String[] args) {
        Patient patient = new Patient("Jenny", "Elaine", "Santori", "123 Main Street", "MyTown", "CA", "01234", "777-555-1212", "Bill Santori", "777-555-1212");

        Procedure procedure1 = new Procedure("Physical Exam", "7/20/2019", "Dr. Irvine", 999999.99);
        Procedure procedure2 = new Procedure("X-ray", "7/20/2019", "Dr. Jamison", 999999.99);
        Procedure procedure3 = new Procedure("Blood Test", "7/20/2019", "Dr. Smith", 999999.99);

        displayPatient(patient);
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.printf("Total Charges:\t$%,.2f\n", totalCharges);

        System.out.println("\nStudent Name: Fsihatsion A.Ambelu(Finn)");
        System.out.println("MC#: M21210594");
        System.out.println("Due Date: 02/25/2025");
    }

    public static void displayPatient(Patient patient) {
        System.out.println(patient);
    }

    public static void displayProcedure(Procedure procedure) {
        System.out.println(procedure);
    }

    public static double calculateTotalCharges(Procedure proc1, Procedure proc2, Procedure proc3) {
        return proc1.getCharges() + proc2.getCharges() + proc3.getCharges();
    }
}