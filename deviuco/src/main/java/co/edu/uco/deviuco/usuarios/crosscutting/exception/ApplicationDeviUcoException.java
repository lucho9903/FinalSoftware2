package co.edu.uco.deviuco.usuarios.crosscutting.exception;
import co.edu.uco.deviuco.usuarios.crosscutting.exception.enums.Layer;

public final class ApplicationDeviUcoException extends DeviUcoException {
    
    private static final long serialVersionUID = 1L;

    private ApplicationDeviUcoException(final String technicalMessage, final String userMessage, final Exception rootException) {
        super(technicalMessage, userMessage, Layer.APPLICATION, rootException);
    }
    
    public static final ApplicationDeviUcoException create(final String technicalMessage, final String userMessage, final Exception rootException) {
        return new ApplicationDeviUcoException(technicalMessage, userMessage, rootException);
    }
    
    public static final ApplicationDeviUcoException create(final String userMessage, final Exception rootException) {
        return new ApplicationDeviUcoException(userMessage, userMessage, rootException);
    }
    
    public static final ApplicationDeviUcoException create(final String technicalMessage, final String userMessage) {
        return new ApplicationDeviUcoException(technicalMessage, userMessage, new Exception());
    }
    
    public static final ApplicationDeviUcoException create(final String userMessage) {
        return new ApplicationDeviUcoException(userMessage, userMessage, new Exception());
    }
} 