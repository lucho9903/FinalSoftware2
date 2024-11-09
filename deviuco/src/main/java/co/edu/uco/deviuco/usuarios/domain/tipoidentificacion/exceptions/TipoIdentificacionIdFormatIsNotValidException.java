package co.edu.uco.deviuco.usuarios.domain.tipoidentificacion.exceptions;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class TipoIdentificacionIdFormatIsNotValidException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private TipoIdentificacionIdFormatIsNotValidException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final TipoIdentificacionIdFormatIsNotValidException create() {
        var userMessage = "El tipo de identificación tiene un identificador con formato no válido correspondiente al valor por defecto...";
        return new TipoIdentificacionIdFormatIsNotValidException(userMessage, userMessage, new Exception());
    }
}
