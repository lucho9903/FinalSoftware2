package co.edu.uco.deviuco.usuarios.application.primaryports.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;
import co.edu.uco.deviuco.usuarios.application.primaryports.dto.AfiliadoDTO;
import co.edu.uco.deviuco.usuarios.domain.afiliado.AfiliadoDomain;

@Mapper
public interface AfiliadoDtoMapper {

	AfiliadoDtoMapper INSTANCE = Mappers.getMapper(AfiliadoDtoMapper.class);

	AfiliadoDomain dtoToDomain(AfiliadoDTO dto);

	AfiliadoDTO domainToDto(AfiliadoDomain domain);

	List<AfiliadoDTO> domainToDtoCollection(List<AfiliadoDomain> domainCollection);

	List<AfiliadoDomain> dtoToDomainCollection(List<AfiliadoDTO> entityCollection);

}
