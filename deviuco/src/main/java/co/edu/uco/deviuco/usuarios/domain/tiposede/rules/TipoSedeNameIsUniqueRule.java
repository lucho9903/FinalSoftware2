package co.edu.uco.deviuco.usuarios.domain.tiposede.rules;

import org.springframework.stereotype.Service;

import co.edu.uco.deviuco.usuarios.domain.DomainRule;
import co.edu.uco.deviuco.usuarios.domain.tiposede.TipoSedeDomain;


@Service
public interface TipoSedeNameIsUniqueRule extends DomainRule<TipoSedeDomain> {

} 