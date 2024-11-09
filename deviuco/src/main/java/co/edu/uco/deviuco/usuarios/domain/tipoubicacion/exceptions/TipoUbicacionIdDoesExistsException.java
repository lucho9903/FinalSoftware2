package co.edu.uco.deviuco.usuarios.domain.tipoubicacion.exceptions;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class TipoUbicacionIdDoesExistsException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private TipoUbicacionIdDoesExistsException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final TipoUbicacionIdDoesExistsException create() {
        var userMessage = "El tipo de ubicación ya existe en el sistema...";
        return new TipoUbicacionIdDoesExistsException(userMessage, userMessage, new Exception());
    }
} 