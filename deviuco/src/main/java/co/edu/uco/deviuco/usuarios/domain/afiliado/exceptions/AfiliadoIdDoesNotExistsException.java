package co.edu.uco.deviuco.usuarios.domain.afiliado.exceptions;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;
public class AfiliadoIdDoesNotExistsException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private AfiliadoIdDoesNotExistsException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final AfiliadoIdDoesNotExistsException create() {
        var userMessage = "No existe ningún afiliado con el identificador indicado...";
        return new AfiliadoIdDoesNotExistsException(userMessage, userMessage, new Exception());
    }
} 