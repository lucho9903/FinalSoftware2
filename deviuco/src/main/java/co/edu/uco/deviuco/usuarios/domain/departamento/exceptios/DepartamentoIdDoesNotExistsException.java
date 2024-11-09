package co.edu.uco.deviuco.usuarios.domain.departamento.exceptios;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class DepartamentoIdDoesNotExistsException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private DepartamentoIdDoesNotExistsException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final DepartamentoIdDoesNotExistsException create() {
        var userMessage = "No existe ningún departamento con el identificador indicado...";
        return new DepartamentoIdDoesNotExistsException(userMessage, userMessage, new Exception());
    }
} 