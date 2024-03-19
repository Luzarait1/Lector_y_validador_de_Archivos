package ValidadorArchivos.Services;

import ValidadorArchivos.Models.RegistroExcel;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ExcelValidator {

    //Validar el injury location
    public Boolean validarInjuryLocation(String injuryLocation) {
        Boolean validarInjuryLocation = false;
        if (injuryLocation != "N/A") {
            validarInjuryLocation = true;
            return validarInjuryLocation;
        }
        return validarInjuryLocation;
    }

    //Validar el report type
    public Boolean validarReportType(String reportType) {
        String[] type = {"Near Miss", "Lost Time", "First Aid"};
        List<String> types = Arrays.asList(type);

        boolean existe = types.contains(reportType);
        Boolean validarReportType = false;
        if (existe) {
            validarReportType = true;
            return validarReportType;
        }
        return validarReportType;
    }

    //Validar la estructura del Excel
    public Boolean validarEstructura(RegistroExcel registroExcel) {
        return validarInjuryLocation(registroExcel.getInjuryLocation()) && validarReportType(registroExcel.getReportType());
    }
}
