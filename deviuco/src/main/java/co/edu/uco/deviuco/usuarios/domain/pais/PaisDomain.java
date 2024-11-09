package co.edu.uco.deviuco.usuarios.domain.pais;

import java.util.UUID;

import co.edu.uco.deviuco.usuarios.domain.Domain;

public final class PaisDomain extends Domain {
    
    private String nombre;

    private PaisDomain(final UUID id, final String nombre) {
        super(id);
        setNombre(nombre);
    }

    public static final PaisDomain create(final UUID id, final String nombre) {
        return new PaisDomain(id, nombre);
    }

    public final String getNombre() {
        return nombre;
    }

    private final void setNombre(String nombre) {
        this.nombre = nombre;
    }
} 