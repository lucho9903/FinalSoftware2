package co.edu.uco.deviuco.usuarios.domain.afiliado.exceptions;
import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class AfiliadoIdFormatIsNotValidException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private AfiliadoIdFormatIsNotValidException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final AfiliadoIdFormatIsNotValidException create() {
        var userMessage = "El afiliado tiene un identificador con formato no válido correspondiente al valor por defecto...";
        return new AfiliadoIdFormatIsNotValidException(userMessage, userMessage, new Exception());
    }
} 