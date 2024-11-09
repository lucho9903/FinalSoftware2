package co.edu.uco.deviuco.usuarios.domain.tiposede.rules;

import java.util.UUID;

import org.springframework.stereotype.Service;

import co.edu.uco.deviuco.usuarios.domain.DomainRule;

@Service
public interface TipoSedeIdFormatIsValidRule extends DomainRule<UUID> {

} 