package co.edu.uco.deviuco.usuarios.domain.institucion;

import java.util.UUID;

import co.edu.uco.deviuco.usuarios.domain.Domain;
import co.edu.uco.deviuco.usuarios.domain.tipoinstitucion.TipoInstitucionDomain;

public final class InstitucionDomain extends Domain {
    
    private String nombre;
    private TipoInstitucionDomain tipoInstitucion;

    private InstitucionDomain(final UUID id, final String nombre, final TipoInstitucionDomain tipoInstitucion) {
        super(id);
        setNombre(nombre);
        setTipoInstitucion(tipoInstitucion);
    }

    public static final InstitucionDomain create(final UUID id, final String nombre, final TipoInstitucionDomain tipoInstitucion) {
        return new InstitucionDomain(id, nombre, tipoInstitucion);
    }

    public final String getNombre() {
        return nombre;
    }

    private final void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public final TipoInstitucionDomain getTipoInstitucion() {
        return tipoInstitucion;
    }

    private final void setTipoInstitucion(TipoInstitucionDomain tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion;
    }
} 