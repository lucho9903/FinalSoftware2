package co.edu.uco.deviuco.usuarios.domain.sede.rules;

import org.springframework.stereotype.Service;

import co.edu.uco.deviuco.usuarios.domain.DomainRule;
import co.edu.uco.deviuco.usuarios.domain.sede.SedeDomain;


@Service
public interface SedeNameIsUniqueForInstitucionRule extends DomainRule<SedeDomain> {

} 