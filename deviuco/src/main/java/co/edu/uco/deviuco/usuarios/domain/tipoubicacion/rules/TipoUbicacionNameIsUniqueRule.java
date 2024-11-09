package co.edu.uco.deviuco.usuarios.domain.tipoubicacion.rules;

import org.springframework.stereotype.Service;
import co.edu.uco.deviuco.usuarios.domain.DomainRule;
import co.edu.uco.deviuco.usuarios.domain.tipoubicacion.TipoUbicacionDomain;

@Service
public interface TipoUbicacionNameIsUniqueRule extends DomainRule<TipoUbicacionDomain> {

} 