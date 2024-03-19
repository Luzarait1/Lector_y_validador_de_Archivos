package ValidadorArchivos.Controllers;

import ValidadorArchivos.Models.RegistroCSV;
import ValidadorArchivos.Models.RegistroExcel;
import ValidadorArchivos.Services.CSVValidator;
import ValidadorArchivos.Services.ExcelValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArchivoController {

    private CSVValidator validadorCSV;
    private ExcelValidator validadorExcel;

    @Autowired
    public ArchivoController(CSVValidator validadorCSV) {
        this.validadorCSV = validadorCSV;
    }
    @Autowired
    public ArchivoController(ExcelValidator validadorExcel) {
        this.validadorExcel = validadorExcel;
    }


    @GetMapping("/CSVValidator/validadorCSV")
    public Boolean validarEstructuraCSV(@RequestBody RegistroCSV registroCSV)  {
        return this.validadorCSV.validarEstructura(registroCSV);
    }

    @GetMapping("")
    public Boolean validarEstructuraExcel(@RequestBody RegistroExcel registroExcel) {
        return this.validadorExcel.validarEstructura(registroExcel);
    }

}
