package co.edu.uco.deviuco.usuarios.crosscutting.exception;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.enums.Layer;

public class RepositoryDeviUcoException extends DeviUcoException {
    
    private static final long serialVersionUID = 1L;

    private RepositoryDeviUcoException(final String technicalMessage, final String userMessage, final Exception rootException) {
        super(technicalMessage, userMessage, Layer.REPOSITORY, rootException);
    }
    
    public static final RepositoryDeviUcoException create(final String technicalMessage, final String userMessage, final Exception rootException) {
        return new RepositoryDeviUcoException(technicalMessage, userMessage, rootException);
    }
    
    public static final RepositoryDeviUcoException create(final String userMessage, final Exception rootException) {
        return new RepositoryDeviUcoException(userMessage, userMessage, rootException);
    }
    
    public static final RepositoryDeviUcoException create(final String technicalMessage, final String userMessage) {
        return new RepositoryDeviUcoException(technicalMessage, userMessage, new Exception());
    }
    
    public static final RepositoryDeviUcoException create(final String userMessage) {
        return new RepositoryDeviUcoException(userMessage, userMessage, new Exception());
    }
} 