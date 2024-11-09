package co.edu.uco.deviuco.usuarios.domain.institucion.rules;

import org.springframework.stereotype.Service;

import co.edu.uco.deviuco.usuarios.domain.DomainRule;
import co.edu.uco.deviuco.usuarios.domain.institucion.InstitucionDomain;


@Service
public interface InstitucionNameIsUniqueForTipoInstitucionRule extends DomainRule<InstitucionDomain> {

}
