package co.edu.uco.deviuco.usuarios.domain.departamento.rules;

import java.util.UUID;

import org.springframework.stereotype.Service;

import co.edu.uco.deviuco.usuarios.domain.DomainRule;

@Service
public interface DepartamentoIdDoesNotExistsRule extends DomainRule<UUID> {

} 