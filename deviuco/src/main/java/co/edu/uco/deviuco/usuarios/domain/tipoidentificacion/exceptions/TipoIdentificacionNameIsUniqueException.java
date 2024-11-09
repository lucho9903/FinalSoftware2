package co.edu.uco.deviuco.usuarios.domain.tipoidentificacion.exceptions;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class TipoIdentificacionNameIsUniqueException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private TipoIdentificacionNameIsUniqueException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final TipoIdentificacionNameIsUniqueException create() {
        var userMessage = "Ya existe un tipo de identificación con el nombre indicado...";
        return new TipoIdentificacionNameIsUniqueException(userMessage, userMessage, new Exception());
    }
} 