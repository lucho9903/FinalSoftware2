package co.edu.uco.deviuco.usuarios.crosscutting.exception;
import co.edu.uco.deviuco.usuarios.crosscutting.exception.enums.Layer;

public final class DomainDeviUcoException extends DeviUcoException {
    
    private static final long serialVersionUID = 1L;

    private DomainDeviUcoException(final String technicalMessage, final String userMessage, final Exception rootException) {
        super(technicalMessage, userMessage, Layer.DOMAIN, rootException);
    }
    
    public static final DomainDeviUcoException create(final String technicalMessage, final String userMessage, final Exception rootException) {
        return new DomainDeviUcoException(technicalMessage, userMessage, rootException);
    }
    
    public static final DomainDeviUcoException create(final String userMessage, final Exception rootException) {
        return new DomainDeviUcoException(userMessage, userMessage, rootException);
    }
    
    public static final DomainDeviUcoException create(final String technicalMessage, final String userMessage) {
        return new DomainDeviUcoException(technicalMessage, userMessage, new Exception());
    }
    
    public static final DomainDeviUcoException create(final String userMessage) {
        return new DomainDeviUcoException(userMessage, userMessage, new Exception());
    }
} 