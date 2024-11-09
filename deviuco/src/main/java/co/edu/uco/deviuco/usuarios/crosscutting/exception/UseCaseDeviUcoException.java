package co.edu.uco.deviuco.usuarios.crosscutting.exception;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.enums.Layer;

public final class UseCaseDeviUcoException extends DeviUcoException {
    
    private static final long serialVersionUID = 1L;

    UseCaseDeviUcoException(final String technicalMessage, final String userMessage, final Exception rootException) {
        super(technicalMessage, userMessage, Layer.USECASE, rootException);
    }
    
    public static final UseCaseDeviUcoException create(final String technicalMessage, final String userMessage, final Exception rootException) {
        return new UseCaseDeviUcoException(technicalMessage, userMessage, rootException);
    }
    
    public static final UseCaseDeviUcoException create(final String userMessage, final Exception rootException) {
        return new UseCaseDeviUcoException(userMessage, userMessage, rootException);
    }
    
    public static final UseCaseDeviUcoException create(final String technicalMessage, final String userMessage) {
        return new UseCaseDeviUcoException(technicalMessage, userMessage, new Exception());
    }
    
    public static final UseCaseDeviUcoException create(final String userMessage) {
        return new UseCaseDeviUcoException(userMessage, userMessage, new Exception());
    }
} 