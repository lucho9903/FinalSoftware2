package co.edu.uco.deviuco.usuarios.application.secondaryports.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import co.edu.uco.deviuco.usuarios.application.secondaryports.entity.TipoIdentificacionEntity;
import co.edu.uco.deviuco.usuarios.domain.tipoidentificacion.TipoIdentificacionDomain;

@Mapper
public interface TipoIdentificacionEntityMapper {
	
	TipoIdentificacionEntityMapper INSTANCE = Mappers.getMapper(TipoIdentificacionEntityMapper.class);
	
	TipoIdentificacionDomain entityToDomain(TipoIdentificacionEntity entity);
	TipoIdentificacionEntity domainToEntity(TipoIdentificacionDomain domain);
	
	List<TipoIdentificacionEntity> domainToEntityCollection(List<TipoIdentificacionDomain> domainCollection);

	List<TipoIdentificacionDomain> entityToDomainCollection(List<TipoIdentificacionEntity> entityCollection);
	
}

