package co.edu.uco.deviuco.usuarios.domain.sede.rules;

import java.util.UUID;

import org.springframework.stereotype.Service;

import co.edu.uco.deviuco.usuarios.domain.DomainRule;

@Service
public interface SedeIdDoesExistsRule extends DomainRule<UUID> {

} 