package co.edu.uco.deviuco.usuarios.domain.ubicacion.exceptions;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class UbicacionNameIsUniqueException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private UbicacionNameIsUniqueException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final UbicacionNameIsUniqueException create() {
        var userMessage = "Ya existe una ubicación con el nombre indicado...";
        return new UbicacionNameIsUniqueException(userMessage, userMessage, new Exception());
    }
} 