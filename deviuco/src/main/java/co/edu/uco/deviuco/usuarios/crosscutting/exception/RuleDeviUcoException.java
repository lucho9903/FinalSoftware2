package co.edu.uco.deviuco.usuarios.crosscutting.exception;
import co.edu.uco.deviuco.usuarios.crosscutting.exception.enums.Layer;

public class RuleDeviUcoException extends DeviUcoException {
    
    private static final long serialVersionUID = 1L;

    protected RuleDeviUcoException(final String technicalMessage, final String userMessage, final Exception rootException) {
        super(technicalMessage, userMessage, Layer.RULE, rootException);
    }
    
    public static final RuleDeviUcoException create(final String technicalMessage, final String userMessage, final Exception rootException) {
        return new RuleDeviUcoException(technicalMessage, userMessage, rootException);
    }
    
    public static final RuleDeviUcoException create(final String userMessage, final Exception rootException) {
        return new RuleDeviUcoException(userMessage, userMessage, rootException);
    }
    
    public static final RuleDeviUcoException create(final String technicalMessage, final String userMessage) {
        return new RuleDeviUcoException(technicalMessage, userMessage, new Exception());
    }
    
    public static final RuleDeviUcoException create(final String userMessage) {
        return new RuleDeviUcoException(userMessage, userMessage, new Exception());
    }
} 