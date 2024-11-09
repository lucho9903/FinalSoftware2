package co.edu.uco.deviuco.usuarios.domain.departamento.exceptios;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class DepartamentoIdDoesExistsException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private DepartamentoIdDoesExistsException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final DepartamentoIdDoesExistsException create() {
        var userMessage = "El departamento ya existe en el sistema...";
        return new DepartamentoIdDoesExistsException(userMessage, userMessage, new Exception());
    }
} 