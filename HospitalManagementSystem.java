abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double roomCharges;
    private double medicationCharges;
    private String diagnosis;
    private StringBuilder medicalHistory;

    public InPatient(String patientId, String name, int age, double roomCharges, double medicationCharges) {
        super(patientId, name, age);
        this.roomCharges = roomCharges;
        this.medicationCharges = medicationCharges;
        this.medicalHistory = new StringBuilder();
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    @Override
    public double calculateBill() {
        return roomCharges + medicationCharges;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.append(record).append("\n");
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History for " + getName() + ":");
        System.out.println(medicalHistory.toString());
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String diagnosis;
    private StringBuilder medicalHistory;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalHistory = new StringBuilder();
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.append(record).append("\n");
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History for " + getName() + ":");
        System.out.println(medicalHistory.toString());
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient inPatient = new InPatient("P001", "John Doe", 30, 500.0, 200.0);
        Patient outPatient = new OutPatient("P002", "Jane Smith", 25, 100.0);

        ((InPatient) inPatient).setDiagnosis("Fever");
        ((InPatient) inPatient).addRecord("Admitted on 2023-10-01");
        ((InPatient) inPatient).addRecord("Prescribed antibiotics");

        ((OutPatient) outPatient).setDiagnosis("Cough");
        ((OutPatient) outPatient).addRecord("Visited on 2023-10-02");
        ((OutPatient) outPatient).addRecord("Prescribed cough syrup");

        inPatient.getPatientDetails();
        System.out.println("Total Bill: $" + inPatient.calculateBill());
        ((MedicalRecord) inPatient).viewRecords();

        outPatient.getPatientDetails();
        System.out.println("Total Bill: $" + outPatient.calculateBill());
        ((MedicalRecord) outPatient).viewRecords();
    }
}