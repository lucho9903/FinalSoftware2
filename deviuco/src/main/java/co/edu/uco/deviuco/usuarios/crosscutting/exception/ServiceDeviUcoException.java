package co.edu.uco.deviuco.usuarios.crosscutting.exception;
import co.edu.uco.deviuco.usuarios.crosscutting.exception.enums.Layer;

public final class ServiceDeviUcoException extends DeviUcoException {
    
    private static final long serialVersionUID = 1L;

    private ServiceDeviUcoException(final String technicalMessage, final String userMessage, final Exception rootException) {
        super(technicalMessage, userMessage, Layer.SERVICE, rootException);
    }
    
    public static final ServiceDeviUcoException create(final String technicalMessage, final String userMessage, final Exception rootException) {
        return new ServiceDeviUcoException(technicalMessage, userMessage, rootException);
    }
    
    public static final ServiceDeviUcoException create(final String userMessage, final Exception rootException) {
        return new ServiceDeviUcoException(userMessage, userMessage, rootException);
    }
    
    public static final ServiceDeviUcoException create(final String technicalMessage, final String userMessage) {
        return new ServiceDeviUcoException(technicalMessage, userMessage, new Exception());
    }
    
    public static final ServiceDeviUcoException create(final String userMessage) {
        return new ServiceDeviUcoException(userMessage, userMessage, new Exception());
    }
} 