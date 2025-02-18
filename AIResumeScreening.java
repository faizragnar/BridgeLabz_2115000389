import java.util.ArrayList;
import java.util.List;

abstract class JobRole {
    private String candidateName;
    private String skills;

    public JobRole(String candidateName, String skills) {
        this.candidateName = candidateName;
        this.skills = skills;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public String getSkills() {
        return skills;
    }
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, String skills) {
        super(candidateName, skills);
    }
}

class DataScientist extends JobRole {
    public DataScientist(String candidateName, String skills) {
        super(candidateName, skills);
    }
}

class ProductManager extends JobRole {
    public ProductManager(String candidateName, String skills) {
        super(candidateName, skills);
    }
}

class Resume<T extends JobRole> {
    private List<T> resumes = new ArrayList<>();

    public void addResume(T resume) {
        resumes.add(resume);
    }

    public List<T> getResumes() {
        return resumes;
    }
}

class ResumeScreeningUtil {
    public static void processResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            System.out.println("Processing resume for: " + resume.getCandidateName() + " | Skills: " + resume.getSkills());
        }
    }
}

public class AIResumeScreening {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> softwareResumes = new Resume<>();
        softwareResumes.addResume(new SoftwareEngineer("A", "Java"));
        softwareResumes.addResume(new SoftwareEngineer("B", "Python"));

        Resume<DataScientist> dataResumes = new Resume<>();
        dataResumes.addResume(new DataScientist("C", "Machine Learning"));
        dataResumes.addResume(new DataScientist("D", "Deep Learning"));

        Resume<ProductManager> pmResumes = new Resume<>();
        pmResumes.addResume(new ProductManager("E", "Market Analysis"));
        pmResumes.addResume(new ProductManager("F", "Business"));

        System.out.println("Software Engineer Resumes:");
        ResumeScreeningUtil.processResumes(softwareResumes.getResumes());

        System.out.println("\nData Scientist Resumes:");
        ResumeScreeningUtil.processResumes(dataResumes.getResumes());

        System.out.println("\nProduct Manager Resumes:");
        ResumeScreeningUtil.processResumes(pmResumes.getResumes());
    }
}
