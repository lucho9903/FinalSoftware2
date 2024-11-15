package co.edu.uco.deviuco.usuarios.domain.afiliado;

import java.util.UUID;
import co.edu.uco.deviuco.usuarios.domain.Domain;
import co.edu.uco.deviuco.usuarios.domain.tipoidentificacion.TipoIdentificacionDomain;

public class AfiliadoDomain extends Domain {
    
	
    private String numeroIdAfiliado;
    private String nombre;
    private String correo;
    private String telefono;
    private String pin;
    private TipoIdentificacionDomain tipoIdentificacion; 

    private AfiliadoDomain(final UUID id, final String nombre, final String numeroIdAfiliado, 
                          final String correo, final String telefono, final String pin, final TipoIdentificacionDomain tipoIdentificacion) {
        super(id);
        setNumeroIdAfiliado(numeroIdAfiliado);
        setNombre(nombre);
        setCorreo(correo);
        setTelefono(telefono);
        setPin(pin);
        setTipoIdentificacion(tipoIdentificacion);
    }

    
    
    public final String getNombre() {
        return nombre;
    }

    private final void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public final String getCorreo() {
        return correo;
    }

    private final void setCorreo(String correo) {
        this.correo = correo;
    }


    public final String getNumeroIdAfiliado() {
        return numeroIdAfiliado;
    }

    private final void setNumeroIdAfiliado(String numeroIdAfiliado) {
        this.numeroIdAfiliado = numeroIdAfiliado;
    }

    public final String getTelefono() {
        return telefono;
    }

    private final void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public final String getPin() {
        return pin;
    }

    private final void setPin(String pin) {
        this.pin = pin;
    }
    public final TipoIdentificacionDomain getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    private final void setTipoIdentificacion(TipoIdentificacionDomain tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }
} 