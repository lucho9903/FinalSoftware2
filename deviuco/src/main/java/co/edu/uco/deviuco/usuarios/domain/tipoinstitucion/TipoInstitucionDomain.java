package co.edu.uco.deviuco.usuarios.domain.tipoinstitucion;

import java.util.UUID;

import co.edu.uco.deviuco.usuarios.domain.Domain;

public final class TipoInstitucionDomain extends Domain {
    
    private String nombre;

    private TipoInstitucionDomain(final UUID id, final String nombre) {
        super(id);
        setNombre(nombre);
    }

    public static final TipoInstitucionDomain create(final UUID id, final String nombre) {
        return new TipoInstitucionDomain(id, nombre);
    }

    public final String getNombre() {
        return nombre;
    }

    private final void setNombre(String nombre) {
        this.nombre = nombre;
    }
} 