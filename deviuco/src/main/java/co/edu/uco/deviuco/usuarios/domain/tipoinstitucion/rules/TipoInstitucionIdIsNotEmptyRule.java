package co.edu.uco.deviuco.usuarios.domain.tipoinstitucion.rules;

import java.util.UUID;

import org.springframework.stereotype.Service;

import co.edu.uco.deviuco.usuarios.domain.DomainRule;

@Service
public interface TipoInstitucionIdIsNotEmptyRule extends DomainRule<UUID> {

} 