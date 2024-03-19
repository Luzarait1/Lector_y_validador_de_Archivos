package ValidadorArchivos.Models;

public class RegistroExcel {

    private String injuryLocation;
    private String reportType;

    public RegistroExcel(String injuryLocation, String reportType) {
        this.injuryLocation = injuryLocation;
        this.reportType = reportType;
    }

    public String getInjuryLocation() {
        return injuryLocation;
    }

    public String getReportType() {
        return reportType;
    }
}
