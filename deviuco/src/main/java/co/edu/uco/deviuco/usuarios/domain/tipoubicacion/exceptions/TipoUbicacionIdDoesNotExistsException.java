package co.edu.uco.deviuco.usuarios.domain.tipoubicacion.exceptions;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class TipoUbicacionIdDoesNotExistsException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private TipoUbicacionIdDoesNotExistsException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final TipoUbicacionIdDoesNotExistsException create() {
        var userMessage = "No existe ningún tipo de ubicación con el identificador indicado...";
        return new TipoUbicacionIdDoesNotExistsException(userMessage, userMessage, new Exception());
    }
} 