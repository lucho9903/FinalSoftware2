package co.edu.uco.deviuco.usuarios.domain.tiposede;

import java.util.UUID;

import co.edu.uco.deviuco.usuarios.domain.Domain;

public final class TipoSedeDomain extends Domain {
    
    private String nombre;
    private String codigo;

    private TipoSedeDomain(final UUID id, final String nombre, final String codigo) {
        super(id);
        setNombre(nombre);
        setCodigo(codigo);
    }

    public static final TipoSedeDomain create(final UUID id, final String nombre, final String codigo) {
        return new TipoSedeDomain(id, nombre, codigo);
    }

    public final String getNombre() {
        return nombre;
    }

    private final void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public final String getCodigo() {
        return codigo;
    }

    private final void setCodigo(String codigo) {
        this.codigo = codigo;
    }
} 