package co.edu.uco.deviuco.usuarios.domain.ubicacion.rules;

import java.util.UUID;

import org.springframework.stereotype.Service;

import co.edu.uco.deviuco.usuarios.domain.DomainRule;

@Service
public interface UbicacionIdIsNotEmptyRule extends DomainRule<UUID> {

} 