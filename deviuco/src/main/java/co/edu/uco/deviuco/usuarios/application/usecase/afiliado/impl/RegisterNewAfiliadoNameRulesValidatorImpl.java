package co.edu.uco.deviuco.usuarios.application.usecase.afiliado.impl;

import org.springframework.stereotype.Service;

import co.edu.uco.deviuco.usuarios.application.usecase.afiliado.RegisterNewAfiliadoNameRulesValidator;
import co.edu.uco.deviuco.usuarios.domain.afiliado.AfiliadoDomain;
import co.edu.uco.deviuco.usuarios.domain.afiliado.rules.AfiliadoNameFormatIsValidRule;
import co.edu.uco.deviuco.usuarios.domain.afiliado.rules.AfiliadoNameIsNotEmptyRule;
import co.edu.uco.deviuco.usuarios.domain.afiliado.rules.AfiliadoNameIsNotEqualsRule;
import co.edu.uco.deviuco.usuarios.domain.afiliado.rules.AfiliadoNameIsNotNullRule;
import co.edu.uco.deviuco.usuarios.domain.afiliado.rules.AfiliadoNameLenghtIsValidRule;
@Service
public class RegisterNewAfiliadoNameRulesValidatorImpl implements RegisterNewAfiliadoNameRulesValidator {

	private AfiliadoNameLenghtIsValidRule afiliadoNameLengthIsValidRule;
	private AfiliadoNameFormatIsValidRule afiliadoNameFormatIsValidRule;
	private AfiliadoNameIsNotEmptyRule afiliadoNameIsNotEmptyRule;
	private AfiliadoNameIsNotNullRule afiliadoNameIsNotNullRule;
	private AfiliadoNameIsNotEqualsRule afiliadoNameIsNotEqualsRule;

	public RegisterNewAfiliadoNameRulesValidatorImpl(final AfiliadoNameLenghtIsValidRule afiliadoNameLengthIsValidRule,
			final AfiliadoNameFormatIsValidRule cityNameFormatIsValidRule,
			final AfiliadoNameIsNotEmptyRule cityNameIsNotEmptyRule, final AfiliadoNameIsNotNullRule afiliadoNameIsNotNullRule, final AfiliadoNameIsNotEqualsRule afiliadoNameIsNotEqualsRule ) {
		super();
		this.afiliadoNameLengthIsValidRule = afiliadoNameLengthIsValidRule;
		this.afiliadoNameFormatIsValidRule = afiliadoNameFormatIsValidRule;
		this.afiliadoNameIsNotEmptyRule = afiliadoNameIsNotEmptyRule;
		this.afiliadoNameIsNotNullRule = afiliadoNameIsNotNullRule;
		this.afiliadoNameIsNotEqualsRule =  afiliadoNameIsNotEqualsRule ;
	}

	@Override
	public void validate(AfiliadoDomain data) {
		afiliadoNameIsNotNullRule.validate(data.getNombre());
		afiliadoNameIsNotEmptyRule.validate(data.getNombre());
		afiliadoNameLengthIsValidRule.validate(data.getNombre());
		afiliadoNameFormatIsValidRule.validate(data.getNombre());
		afiliadoNameIsNotEqualsRule.validate(data.getNombre());
	}

}
