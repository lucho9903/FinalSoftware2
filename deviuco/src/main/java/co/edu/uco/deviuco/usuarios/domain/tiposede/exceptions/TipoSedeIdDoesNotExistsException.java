package co.edu.uco.deviuco.usuarios.domain.tiposede.exceptions;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class TipoSedeIdDoesNotExistsException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private TipoSedeIdDoesNotExistsException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final TipoSedeIdDoesNotExistsException create() {
        var userMessage = "No existe ningún tipo de sede con el identificador indicado...";
        return new TipoSedeIdDoesNotExistsException(userMessage, userMessage, new Exception());
    }
} 