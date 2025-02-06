import java.util.ArrayList;
import java.util.List;

class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public void consult(Patient patient) {
        patients.add(patient);
        System.out.println("Dr. " + name + " is consulting " + patient.getName());
    }
}

class Patient {
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("ankit");
        Patient patient = new Patient("rohit");
        doctor.consult(patient);
    }
}
