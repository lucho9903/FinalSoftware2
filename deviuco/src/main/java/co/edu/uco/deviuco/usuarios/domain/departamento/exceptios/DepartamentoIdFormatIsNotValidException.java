package co.edu.uco.deviuco.usuarios.domain.departamento.exceptios;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class DepartamentoIdFormatIsNotValidException extends RuleDeviUcoException {

    private static final long serialVersionUID = 1L;
    
    public DepartamentoIdFormatIsNotValidException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }

    public static final DepartamentoIdFormatIsNotValidException create() {
        var userMessage = "El departamento tiene un identificador con formato no válido correspondiente al valor por defecto... ";
        return new DepartamentoIdFormatIsNotValidException(userMessage, userMessage, new Exception());
    }
} 