package co.edu.unbosque.ciclo3demo;

public class usuarios {
String cedula;
String usuario;
String nombre;
String contraseña;
String email;

	public String getCedula() {
	return cedula;
}

public void setCedula(String cedula) {
	this.cedula = cedula;
}

public String getUsuario() {
	return usuario;
}

public void setUsuario(String usuario) {
	this.usuario = usuario;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getContraseña() {
	return contraseña;
}

public void setContraseña(String contraseña) {
	this.contraseña = contraseña;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

	public usuarios() {
	this.cedula = "";
	this.usuario = "";
	this.nombre = "";
	this.contraseña = "";
	this.email = "";
	}
}
