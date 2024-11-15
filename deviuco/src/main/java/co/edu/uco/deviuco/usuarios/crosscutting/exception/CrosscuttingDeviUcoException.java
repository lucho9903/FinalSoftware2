package co.edu.uco.deviuco.usuarios.crosscutting.exception;
import co.edu.uco.deviuco.usuarios.crosscutting.exception.enums.Layer;

public final class CrosscuttingDeviUcoException extends DeviUcoException {
    
    private static final long serialVersionUID = 1L;

    private CrosscuttingDeviUcoException(final String technicalMessage, final String userMessage, final Exception rootException) {
        super(technicalMessage, userMessage, Layer.CROSSCUTTING, rootException);
    }
    
    public static final CrosscuttingDeviUcoException create(final String technicalMessage, final String userMessage, final Exception rootException) {
        return new CrosscuttingDeviUcoException(technicalMessage, userMessage, rootException);
    }
    
    public static final CrosscuttingDeviUcoException create(final String userMessage, final Exception rootException) {
        return new CrosscuttingDeviUcoException(userMessage, userMessage, rootException);
    }
    
    public static final CrosscuttingDeviUcoException create(final String technicalMessage, final String userMessage) {
        return new CrosscuttingDeviUcoException(technicalMessage, userMessage, new Exception());
    }
    
    public static final CrosscuttingDeviUcoException create(final String userMessage) {
        return new CrosscuttingDeviUcoException(userMessage, userMessage, new Exception());
    }
} 