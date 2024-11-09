package co.edu.uco.deviuco.usuarios.domain.departamento.exceptios;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class DepartamentoIdIsEmptyException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private DepartamentoIdIsEmptyException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final DepartamentoIdIsEmptyException create() {
        var userMessage = "El identificador del departamento está vacío...";
        return new DepartamentoIdIsEmptyException(userMessage, userMessage, new Exception());
    }
} 