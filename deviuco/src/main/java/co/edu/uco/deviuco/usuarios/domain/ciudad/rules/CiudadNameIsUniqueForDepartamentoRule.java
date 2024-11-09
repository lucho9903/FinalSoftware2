package co.edu.uco.deviuco.usuarios.domain.ciudad.rules;

import org.springframework.stereotype.Service;

import co.edu.uco.deviuco.usuarios.domain.DomainRule;
import co.edu.uco.deviuco.usuarios.domain.ciudad.CiudadDomain;


@Service
public interface CiudadNameIsUniqueForDepartamentoRule extends DomainRule<CiudadDomain> {

} 