package co.edu.uco.deviuco.usuarios.domain.ubicacion;

import java.util.UUID;

import co.edu.uco.deviuco.usuarios.domain.Domain;
import co.edu.uco.deviuco.usuarios.domain.ciudad.CiudadDomain;
import co.edu.uco.deviuco.usuarios.domain.tipoubicacion.TipoUbicacionDomain;

public final class UbicacionDomain extends Domain {
    
    private String nombre;
    private String direccion;
    private CiudadDomain ciudad;
    private TipoUbicacionDomain tipoUbicacion;

    private UbicacionDomain(final UUID id, final String nombre, final String direccion, 
                           final CiudadDomain ciudad, final TipoUbicacionDomain tipoUbicacion) {
        super(id);
        setNombre(nombre);
        setDireccion(direccion);
        setCiudad(ciudad);
        setTipoUbicacion(tipoUbicacion);
    }

    public static final UbicacionDomain create(final UUID id, final String nombre, final String direccion,
                                             final CiudadDomain ciudad, final TipoUbicacionDomain tipoUbicacion) {
        return new UbicacionDomain(id, nombre, direccion, ciudad, tipoUbicacion);
    }

    public final String getNombre() {
        return nombre;
    }

    private final void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public final String getDireccion() {
        return direccion;
    }

    private final void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public final CiudadDomain getCiudad() {
        return ciudad;
    }

    private final void setCiudad(CiudadDomain ciudad) {
        this.ciudad = ciudad;
    }

    public final TipoUbicacionDomain getTipoUbicacion() {
        return tipoUbicacion;
    }

    private final void setTipoUbicacion(TipoUbicacionDomain tipoUbicacion) {
        this.tipoUbicacion = tipoUbicacion;
    }
} 