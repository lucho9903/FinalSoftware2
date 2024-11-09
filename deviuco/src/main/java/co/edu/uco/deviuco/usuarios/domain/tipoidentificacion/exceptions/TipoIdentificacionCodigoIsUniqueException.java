package co.edu.uco.deviuco.usuarios.domain.tipoidentificacion.exceptions;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class TipoIdentificacionCodigoIsUniqueException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private TipoIdentificacionCodigoIsUniqueException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final TipoIdentificacionCodigoIsUniqueException create() {
        var userMessage = "Ya existe un tipo de identificación con el código indicado...";
        return new TipoIdentificacionCodigoIsUniqueException(userMessage, userMessage, new Exception());
    }
} 