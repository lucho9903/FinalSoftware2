package co.edu.uco.deviuco.usuarios.domain.tipoinstitucion.exceptions;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class TipoInstitucionIdDoesExistsException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private TipoInstitucionIdDoesExistsException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final TipoInstitucionIdDoesExistsException create() {
        var userMessage = "El tipo de institución ya existe en el sistema...";
        return new TipoInstitucionIdDoesExistsException(userMessage, userMessage, new Exception());
    }
} 