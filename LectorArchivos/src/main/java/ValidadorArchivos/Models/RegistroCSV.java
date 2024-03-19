package ValidadorArchivos.Models;

public class RegistroCSV {

    private String email;
    private String dateOfBirth;
    private String jobTitle;

    public RegistroCSV(String email, String dateOfBirth, String jobTitle) {
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.jobTitle = jobTitle;
    }

    public String getEmail() {
        return email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}
