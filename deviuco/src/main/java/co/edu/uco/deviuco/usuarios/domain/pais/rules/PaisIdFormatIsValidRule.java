package co.edu.uco.deviuco.usuarios.domain.pais.rules;

import java.util.UUID;

import org.springframework.stereotype.Service;

import co.edu.uco.deviuco.usuarios.domain.DomainRule;
@Service
public interface PaisIdFormatIsValidRule extends DomainRule<UUID> {

} 