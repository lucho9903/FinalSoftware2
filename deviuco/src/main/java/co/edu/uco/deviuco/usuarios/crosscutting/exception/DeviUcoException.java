package co.edu.uco.deviuco.usuarios.crosscutting.exception;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.enums.Layer;
import co.edu.uco.deviuco.usuarios.crosscutting.helpers.ObjectHelper;
import co.edu.uco.deviuco.usuarios.crosscutting.helpers.TextHelper;

public class DeviUcoException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String userMessage;
	private Layer layer; 
	
	public DeviUcoException(final String technicalMessage,
			final String userMessage, final Layer layer, 
			final Exception rootException) {
		
		super (ObjectHelper.getDefault(technicalMessage, TextHelper.applyTrim(userMessage)), 
				ObjectHelper.getDefault(rootException, new Exception()));
		
		
		setUserMessage(userMessage);
		setLayer(layer);
	}

	public String getUserMessage() {
		return userMessage;
	}

	private final void setUserMessage (final String userMessage) {
		this.userMessage = TextHelper.applyTrim(userMessage);
	}

	public Layer getLayer() {
		return layer;
	}

	private void setLayer(final Layer layer) {
		this.layer = ObjectHelper.getDefault(layer , Layer.GENERAL);
	}
	
	
	public static  DeviUcoException create(final String technicalMessage, final String userMessage, final Exception rootException) {
		return new UseCaseDeviUcoException(technicalMessage,userMessage, rootException);
	}
	
	public static  DeviUcoException create( final String userMessage, final Exception rootException) {
		return new DeviUcoException(userMessage,userMessage,Layer.GENERAL, rootException);
	}
	
	public static  DeviUcoException create(final String technicalMessage, final String userMessage) {
		return new DeviUcoException(technicalMessage,userMessage, Layer.GENERAL,new Exception());
	}
	
	public static DeviUcoException create( final String userMessage) {
		return new DeviUcoException(userMessage,userMessage, Layer.GENERAL,new Exception());
	}
}