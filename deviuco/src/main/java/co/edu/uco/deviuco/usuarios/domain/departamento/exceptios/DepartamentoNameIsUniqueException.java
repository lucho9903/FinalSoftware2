package co.edu.uco.deviuco.usuarios.domain.departamento.exceptios;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class DepartamentoNameIsUniqueException extends RuleDeviUcoException {

    private static final long serialVersionUID = 1L;
    
    private DepartamentoNameIsUniqueException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }

    public static final DepartamentoNameIsUniqueException create() {
        var userMessage = "Ya existe un departamento con el nombre indicado...";
        return new DepartamentoNameIsUniqueException(userMessage, userMessage, new Exception());
    }
} 