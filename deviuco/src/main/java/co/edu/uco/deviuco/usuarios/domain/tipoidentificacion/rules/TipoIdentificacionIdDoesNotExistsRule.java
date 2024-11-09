package co.edu.uco.deviuco.usuarios.domain.tipoidentificacion.rules;

import java.util.UUID;

import org.springframework.stereotype.Service;

import co.edu.uco.deviuco.usuarios.domain.DomainRule;

@Service
public interface TipoIdentificacionIdDoesNotExistsRule extends DomainRule<UUID> {

}
