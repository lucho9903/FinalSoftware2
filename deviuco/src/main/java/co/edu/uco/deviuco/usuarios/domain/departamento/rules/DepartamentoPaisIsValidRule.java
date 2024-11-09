package co.edu.uco.deviuco.usuarios.domain.departamento.rules;

import org.springframework.stereotype.Service;

import co.edu.uco.deviuco.usuarios.domain.DomainRule;
import co.edu.uco.deviuco.usuarios.domain.pais.PaisDomain;


@Service
public interface DepartamentoPaisIsValidRule extends DomainRule<PaisDomain> {

} 