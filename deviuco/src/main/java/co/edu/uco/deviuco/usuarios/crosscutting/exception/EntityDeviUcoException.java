package co.edu.uco.deviuco.usuarios.crosscutting.exception;
import co.edu.uco.deviuco.usuarios.crosscutting.exception.enums.Layer;

public final class EntityDeviUcoException extends DeviUcoException {
    
    private static final long serialVersionUID = 1L;

    private EntityDeviUcoException(final String technicalMessage, final String userMessage, final Exception rootException) {
        super(technicalMessage, userMessage, Layer.ENTITY, rootException);
    }
    
    public static final EntityDeviUcoException create(final String technicalMessage, final String userMessage, final Exception rootException) {
        return new EntityDeviUcoException(technicalMessage, userMessage, rootException);
    }
    
    public static final EntityDeviUcoException create(final String userMessage, final Exception rootException) {
        return new EntityDeviUcoException(userMessage, userMessage, rootException);
    }
    
    public static final EntityDeviUcoException create(final String technicalMessage, final String userMessage) {
        return new EntityDeviUcoException(technicalMessage, userMessage, new Exception());
    }
    
    public static final EntityDeviUcoException create(final String userMessage) {
        return new EntityDeviUcoException(userMessage, userMessage, new Exception());
    }
} 