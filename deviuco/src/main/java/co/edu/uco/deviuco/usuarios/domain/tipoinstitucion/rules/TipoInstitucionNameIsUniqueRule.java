package co.edu.uco.deviuco.usuarios.domain.tipoinstitucion.rules;

import org.springframework.stereotype.Service;

import co.edu.uco.deviuco.usuarios.domain.DomainRule;
import co.edu.uco.deviuco.usuarios.domain.tipoinstitucion.TipoInstitucionDomain;


@Service
public interface TipoInstitucionNameIsUniqueRule extends DomainRule<TipoInstitucionDomain> {

} 