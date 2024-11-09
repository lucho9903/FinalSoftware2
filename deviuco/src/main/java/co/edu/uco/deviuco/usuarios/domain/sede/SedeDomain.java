package co.edu.uco.deviuco.usuarios.domain.sede;

import java.util.UUID;

import co.edu.uco.deviuco.usuarios.domain.Domain;
import co.edu.uco.deviuco.usuarios.domain.institucion.InstitucionDomain;
import co.edu.uco.deviuco.usuarios.domain.tiposede.TipoSedeDomain;
import co.edu.uco.deviuco.usuarios.domain.ubicacion.UbicacionDomain;

public final class SedeDomain extends Domain {
    
    private String nombre;
    private InstitucionDomain institucion;
    private TipoSedeDomain tipoSede;
    private UbicacionDomain ubicacion;

    private SedeDomain(final UUID id, final String nombre, final InstitucionDomain institucion, 
                      final TipoSedeDomain tipoSede, final UbicacionDomain ubicacion) {
        super(id);
        setNombre(nombre);
        setInstitucion(institucion);
        setTipoSede(tipoSede);
        setUbicacion(ubicacion);
    }

    public static final SedeDomain create(final UUID id, final String nombre, final InstitucionDomain institucion,
                                        final TipoSedeDomain tipoSede, final UbicacionDomain ubicacion) {
        return new SedeDomain(id, nombre, institucion, tipoSede, ubicacion);
    }

    public final String getNombre() {
        return nombre;
    }

    private final void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public final InstitucionDomain getInstitucion() {
        return institucion;
    }

    private final void setInstitucion(InstitucionDomain institucion) {
        this.institucion = institucion;
    }

    public final TipoSedeDomain getTipoSede() {
        return tipoSede;
    }

    private final void setTipoSede(TipoSedeDomain tipoSede) {
        this.tipoSede = tipoSede;
    }

    public final UbicacionDomain getUbicacion() {
        return ubicacion;
    }

    private final void setUbicacion(UbicacionDomain ubicacion) {
        this.ubicacion = ubicacion;
    }
} 