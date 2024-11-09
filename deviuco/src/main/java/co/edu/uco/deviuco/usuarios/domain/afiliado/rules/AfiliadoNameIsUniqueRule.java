package co.edu.uco.deviuco.usuarios.domain.afiliado.rules;

import org.springframework.stereotype.Service;

import co.edu.uco.deviuco.usuarios.domain.DomainRule;
import co.edu.uco.deviuco.usuarios.domain.afiliado.AfiliadoDomain;


@Service
public interface AfiliadoNameIsUniqueRule extends DomainRule<AfiliadoDomain> {

} 