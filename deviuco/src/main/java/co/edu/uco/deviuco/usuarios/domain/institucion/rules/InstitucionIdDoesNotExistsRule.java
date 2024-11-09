package co.edu.uco.deviuco.usuarios.domain.institucion.rules;

import java.util.UUID;

import org.springframework.stereotype.Service;

import co.edu.uco.deviuco.usuarios.domain.DomainRule;

@Service
public interface InstitucionIdDoesNotExistsRule extends DomainRule<UUID> {

} 