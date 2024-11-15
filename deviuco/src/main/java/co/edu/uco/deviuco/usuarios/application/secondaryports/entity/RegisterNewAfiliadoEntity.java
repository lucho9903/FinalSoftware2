package co.edu.uco.deviuco.usuarios.application.secondaryports.entity;

import java.util.UUID;

import co.edu.uco.deviuco.usuarios.crosscutting.helpers.ObjectHelper;
import co.edu.uco.deviuco.usuarios.crosscutting.helpers.TextHelper;
import co.edu.uco.deviuco.usuarios.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "Afiliado")
public final class RegisterNewAfiliadoEntity {
	
	@Id
	@Column(name = "id")
	private UUID id;
	
	@Column (name = "numeroIdAfiliado")
	private String numeroIdAfiliado;
	
	@Column (name = "nombre")
	private String nombre;
	
	@Column (name = "correo")
	private String correo;
	
	@Column (name = "telefono")
	private String telefono;
	
	@Column (name = "pin")
	private String pin;
	
	@ManyToOne
	@JoinColumn(name= "tipoIdentificacion")
	private TipoIdentificacionEntity tipoIdentificacion;
	
	RegisterNewAfiliadoEntity() {
		setId(UUIDHelper.getDefault());
		setNumeroIdAfiliado(TextHelper.EMPTY);
		setNombre(TextHelper.EMPTY);
		setCorreo(TextHelper.EMPTY);
		setTelefono(TextHelper.EMPTY);
		setPin(TextHelper.EMPTY);
		setTipoIdentificacion(TipoIdentificacionEntity.create());
	}


	public RegisterNewAfiliadoEntity(UUID id, String numeroIdAfiliado, String nombre, String correo, String telefono,String pin,TipoIdentificacionEntity tipoIdentificacion) {
		setId(id);
		setNumeroIdAfiliado(numeroIdAfiliado);
		setNombre(nombre);
		setCorreo(correo);
		setTelefono(telefono);
		setPin(pin);
		setTipoIdentificacion(tipoIdentificacion);
	}
	
	public static final AfiliadoEntity create() {
		return new AfiliadoEntity();
	}
	
	
	public static final AfiliadoEntity create(final UUID id,final String numeroIdAfiliado, final String nombre, final String correo, final String telefono
			, final String pin, final TipoIdentificacionEntity tipoIdentificacion) {
		return new AfiliadoEntity(id, numeroIdAfiliado, nombre, correo, telefono, pin, tipoIdentificacion);
	}
	
	public static final AfiliadoEntity create(final UUID id) {
		return new AfiliadoEntity(id, TextHelper.EMPTY, TextHelper.EMPTY, TextHelper.EMPTY, TextHelper.EMPTY, TextHelper.EMPTY, TipoIdentificacionEntity.create());
	}


	public UUID getId() {
		return id;
	}


	public void setId(final UUID id) {
		this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
	}


	public String getNumeroIdAfiliadoe() {
		return numeroIdAfiliado;
	}


	public void setNumeroIdAfiliado(final String numeroIdAfiliado) {
		this.numeroIdAfiliado = TextHelper.applyTrim(numeroIdAfiliado);
	}
		
	public String getNumeroIdAfiliado() {
		return numeroIdAfiliado;
	}


	public void setNombre(final String nombre) {
		this.nombre = TextHelper.applyTrim(nombre);
	}

	public String getNombre() {
		return nombre;
	}


	public void setCorreo(final String correo) {
		this.correo = TextHelper.applyTrim(correo);
	}

	public String getCorreo() {
		return correo;
	}


	public void setTelefono(final String telefono) {
		this.telefono = TextHelper.applyTrim(telefono);
	}

	public String getTelefono() {
		return telefono;
	}


	public void setPin(final String pin) {
		this.pin = TextHelper.applyTrim(pin);
	}

	public String getPin() {
		return pin;
	}


	public TipoIdentificacionEntity getTipoIdentificacion() {
		return tipoIdentificacion;
	}


	public void setTipoIdentificacion(final TipoIdentificacionEntity tipoIdentificacion) {
		this.tipoIdentificacion = ObjectHelper.getDefault(tipoIdentificacion, TipoIdentificacionEntity.create());
	}
	

}