package co.edu.uco.deviuco.usuarios.crosscutting.exception;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.enums.Layer;

public final class ControllerDeviUcoException extends DeviUcoException {
    
    private static final long serialVersionUID = 1L;

    private ControllerDeviUcoException(final String technicalMessage, final String userMessage, final Exception rootException) {
        super(technicalMessage, userMessage, Layer.CONTROLLER, rootException);
    }
    
    public static final ControllerDeviUcoException create(final String technicalMessage, final String userMessage, final Exception rootException) {
        return new ControllerDeviUcoException(technicalMessage, userMessage, rootException);
    }
    
    public static final ControllerDeviUcoException create(final String userMessage, final Exception rootException) {
        return new ControllerDeviUcoException(userMessage, userMessage, rootException);
    }
    
    public static final ControllerDeviUcoException create(final String technicalMessage, final String userMessage) {
        return new ControllerDeviUcoException(technicalMessage, userMessage, new Exception());
    }
    
    public static final ControllerDeviUcoException create(final String userMessage) {
        return new ControllerDeviUcoException(userMessage, userMessage, new Exception());
    }
} 