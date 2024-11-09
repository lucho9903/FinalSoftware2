package co.edu.uco.deviuco.usuarios.domain.afiliado.rules;

import java.util.UUID;

import org.springframework.stereotype.Service;
import co.edu.uco.deviuco.usuarios.domain.DomainRule;

@Service
public interface AfiliadoIdDoesNotExistsRule extends DomainRule<UUID> {

} 