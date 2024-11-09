package co.edu.uco.deviucopay.deviucopay_microservices.domain.institucion.rules;

import java.util.UUID;

import org.springframework.stereotype.Service;

import co.edu.uco.deviuco.usuarios.domain.DomainRule;
@Service
public interface InstitucionIdIsNotEmptyRule extends DomainRule<UUID> {

} 