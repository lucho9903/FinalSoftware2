package co.edu.uco.deviuco.usuarios.domain.tipoidentificacion.exceptions;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class TipoIdentificacionIdIsEmptyException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private TipoIdentificacionIdIsEmptyException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final TipoIdentificacionIdIsEmptyException create() {
        var userMessage = "El identificador del tipo de identificación está vacío...";
        return new TipoIdentificacionIdIsEmptyException(userMessage, userMessage, new Exception());
    }
} 