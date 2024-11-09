package co.edu.uco.deviuco.usuarios.domain.tipoubicacion;

import java.util.UUID;

import co.edu.uco.deviuco.usuarios.domain.Domain;

public final class TipoUbicacionDomain extends Domain {
    
    private String nombre;

    private TipoUbicacionDomain(final UUID id, final String nombre) {
        super(id);
        setNombre(nombre);
    }

    public static final TipoUbicacionDomain create(final UUID id, final String nombre) {
        return new TipoUbicacionDomain(id, nombre);
    }

    public final String getNombre() {
        return nombre;
    }

    private final void setNombre(String nombre) {
        this.nombre = nombre;
    }
} 