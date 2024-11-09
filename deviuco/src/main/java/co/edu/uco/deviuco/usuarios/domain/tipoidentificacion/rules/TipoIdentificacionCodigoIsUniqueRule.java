package co.edu.uco.deviuco.usuarios.domain.tipoidentificacion.rules;

import org.springframework.stereotype.Service;
import co.edu.uco.deviuco.usuarios.domain.DomainRule;
import co.edu.uco.deviuco.usuarios.domain.tipoidentificacion.TipoIdentificacionDomain;

@Service
public interface TipoIdentificacionCodigoIsUniqueRule extends DomainRule<TipoIdentificacionDomain> {

}
