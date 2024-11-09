package co.edu.uco.deviuco.usuarios.domain.tiposede.exceptions;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class TipoSedeIdDoesExistsException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private TipoSedeIdDoesExistsException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final TipoSedeIdDoesExistsException create() {
        var userMessage = "El tipo de sede ya existe en el sistema...";
        return new TipoSedeIdDoesExistsException(userMessage, userMessage, new Exception());
    }
} 