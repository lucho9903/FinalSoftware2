package co.edu.uco.deviuco.usuarios.crosscutting.exception;
import co.edu.uco.deviuco.usuarios.crosscutting.exception.enums.Layer;

public final class DtoDeviUcoException extends DeviUcoException {
    
    private static final long serialVersionUID = 1L;

    private DtoDeviUcoException(final String technicalMessage, final String userMessage, final Exception rootException) {
        super(technicalMessage, userMessage, Layer.DTO, rootException);
    }
    
    public static final DtoDeviUcoException create(final String technicalMessage, final String userMessage, final Exception rootException) {
        return new DtoDeviUcoException(technicalMessage, userMessage, rootException);
    }
    
    public static final DtoDeviUcoException create(final String userMessage, final Exception rootException) {
        return new DtoDeviUcoException(userMessage, userMessage, rootException);
    }
    
    public static final DtoDeviUcoException create(final String technicalMessage, final String userMessage) {
        return new DtoDeviUcoException(technicalMessage, userMessage, new Exception());
    }
    
    public static final DtoDeviUcoException create(final String userMessage) {
        return new DtoDeviUcoException(userMessage, userMessage, new Exception());
    }
} 