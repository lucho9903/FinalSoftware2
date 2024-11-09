package co.edu.uco.deviuco.usuarios.domain.ciudad.rules;

import java.util.UUID;

import org.springframework.stereotype.Service;

import co.edu.uco.deviuco.usuarios.domain.DomainRule;

@Service
public interface CiudadIdDoesExistsRule extends DomainRule<UUID> {

} 