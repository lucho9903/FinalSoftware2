package co.edu.uco.deviuco.usuarios.domain.afiliado.exceptions;
import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class AfiliadoNameIsUniqueException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private AfiliadoNameIsUniqueException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final AfiliadoNameIsUniqueException create() {
        var userMessage = "Ya existe un afiliado con el nombre indicado...";
        return new AfiliadoNameIsUniqueException(userMessage, userMessage, new Exception());
    }
} 