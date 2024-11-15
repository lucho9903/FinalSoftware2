package co.edu.uco.deviuco.usuarios.domain.afiliado.exceptions;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;
public class AfiliadoIdIsEmptyException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private AfiliadoIdIsEmptyException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final AfiliadoIdIsEmptyException create() {
        var userMessage = "El identificador del afiliado está vacío...";
        return new AfiliadoIdIsEmptyException(userMessage, userMessage, new Exception());
    }
} 