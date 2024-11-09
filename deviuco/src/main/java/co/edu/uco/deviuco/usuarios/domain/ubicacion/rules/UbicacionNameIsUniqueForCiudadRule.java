package co.edu.uco.deviuco.usuarios.domain.ubicacion.rules;

import org.springframework.stereotype.Service;

import co.edu.uco.deviuco.usuarios.domain.DomainRule;
import co.edu.uco.deviuco.usuarios.domain.ubicacion.UbicacionDomain;


@Service
public interface UbicacionNameIsUniqueForCiudadRule extends DomainRule<UbicacionDomain> {

}
