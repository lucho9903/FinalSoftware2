package co.edu.uco.deviuco.usuarios.domain.tipoinstitucion.exceptions;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class TipoInstitucionIdDoesNotExistsException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private TipoInstitucionIdDoesNotExistsException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final TipoInstitucionIdDoesNotExistsException create() {
        var userMessage = "No existe ningún tipo de institución con el identificador indicado...";
        return new TipoInstitucionIdDoesNotExistsException(userMessage, userMessage, new Exception());
    }
} 