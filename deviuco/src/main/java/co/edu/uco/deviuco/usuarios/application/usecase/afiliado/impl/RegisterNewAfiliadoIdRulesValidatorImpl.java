package co.edu.uco.deviuco.usuarios.application.usecase.afiliado.impl;

import org.springframework.stereotype.Service;

import co.edu.uco.deviuco.usuarios.application.usecase.afiliado.RegisterNewAfiliadoIdRulesValidator;
import co.edu.uco.deviuco.usuarios.domain.afiliado.AfiliadoDomain;
import co.edu.uco.deviuco.usuarios.domain.afiliado.exceptions.AfiliadoIdDoesExistsException;
import co.edu.uco.deviuco.usuarios.domain.afiliado.rules.AfiliadoIdDoesNotExistsRule;
@Service
public class RegisterNewAfiliadoIdRulesValidatorImpl implements RegisterNewAfiliadoIdRulesValidator {

	private AfiliadoIdDoesNotExistsRule afiliadoIdDoesNotExistRule;

	public RegisterNewAfiliadoIdRulesValidatorImpl(final AfiliadoIdDoesNotExistsRule afiliadoIdDoesNotExistRule) {
		super();
		this.afiliadoIdDoesNotExistRule = afiliadoIdDoesNotExistRule;
	}


	@Override
	public void validate(AfiliadoDomain data) {
		data.generateId();
		try {
			afiliadoIdDoesNotExistRule.validate(data.getId());
		} catch (final AfiliadoIdDoesExistsException exception) {
			validate(data);
		}
	}
	
}