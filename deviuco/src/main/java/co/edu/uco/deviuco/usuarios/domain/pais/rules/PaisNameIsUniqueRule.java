package co.edu.uco.deviuco.usuarios.domain.pais.rules;

import org.springframework.stereotype.Service;

import co.edu.uco.deviuco.usuarios.domain.DomainRule;
import co.edu.uco.deviuco.usuarios.domain.pais.PaisDomain;


@Service
public interface PaisNameIsUniqueRule extends DomainRule<PaisDomain> {

} 