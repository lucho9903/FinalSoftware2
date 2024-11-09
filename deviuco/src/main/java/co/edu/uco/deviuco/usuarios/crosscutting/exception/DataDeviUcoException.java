package co.edu.uco.deviuco.usuarios.crosscutting.exception;
import co.edu.uco.deviuco.usuarios.crosscutting.exception.enums.Layer;

public final class DataDeviUcoException extends DeviUcoException {
    
    private static final long serialVersionUID = 1L;

    private DataDeviUcoException(final String technicalMessage, final String userMessage, final Exception rootException) {
        super(technicalMessage, userMessage, Layer.DATA, rootException);
    }
    
    public static final DataDeviUcoException create(final String technicalMessage, final String userMessage, final Exception rootException) {
        return new DataDeviUcoException(technicalMessage, userMessage, rootException);
    }
    
    public static final DataDeviUcoException create(final String userMessage, final Exception rootException) {
        return new DataDeviUcoException(userMessage, userMessage, rootException);
    }
    
    public static final DataDeviUcoException create(final String technicalMessage, final String userMessage) {
        return new DataDeviUcoException(technicalMessage, userMessage, new Exception());
    }
    
    public static final DataDeviUcoException create(final String userMessage) {
        return new DataDeviUcoException(userMessage, userMessage, new Exception());
    }
} 