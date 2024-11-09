package co.edu.uco.deviuco.usuarios.domain.ubicacion.exceptions;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class UbicacionIdFormatIsNotValidException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private UbicacionIdFormatIsNotValidException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final UbicacionIdFormatIsNotValidException create() {
        var userMessage = "La ubicación tiene un identificador con formato no válido correspondiente al valor por defecto...";
        return new UbicacionIdFormatIsNotValidException(userMessage, userMessage, new Exception());
    }
} 