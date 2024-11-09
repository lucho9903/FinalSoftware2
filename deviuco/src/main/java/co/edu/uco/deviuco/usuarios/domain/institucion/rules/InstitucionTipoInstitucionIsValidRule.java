package co.edu.uco.deviuco.usuarios.domain.institucion.rules;

import org.springframework.stereotype.Service;

import co.edu.uco.deviuco.usuarios.domain.DomainRule;
import co.edu.uco.deviuco.usuarios.domain.tipoinstitucion.TipoInstitucionDomain;


@Service
public interface InstitucionTipoInstitucionIsValidRule extends DomainRule<TipoInstitucionDomain> {

} 