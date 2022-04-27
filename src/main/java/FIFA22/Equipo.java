package FIFA22;

public class Equipo {
private int cod_equipo;
private String nombre;
private int cod_liga;
/**
 * 
 */
public Equipo() {
	super();
	// TODO Auto-generated constructor stub
}
/**
 * @param cod_equipo
 * @param nombre
 * @param cod_liga
 */
public Equipo(int cod_equipo, String nombre, int cod_liga) {
	super();
	this.cod_equipo = cod_equipo;
	this.nombre = nombre;
	this.cod_liga = cod_liga;
}
/**
 * @return the cod_equipo
 */
public int getCod_equipo() {
	return cod_equipo;
}
/**
 * @param cod_equipo the cod_equipo to set
 */
public void setCod_equipo(int cod_equipo) {
	this.cod_equipo = cod_equipo;
}
/**
 * @return the nombre
 */
public String getNombre() {
	return nombre;
}
/**
 * @param nombre the nombre to set
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}
/**
 * @return the cod_liga
 */
public int getCod_liga() {
	return cod_liga;
}
/**
 * @param cod_liga the cod_liga to set
 */
public void setCod_liga(int cod_liga) {
	this.cod_liga = cod_liga;
}
@Override
public String toString() {
	return "Equipo [cod_equipo=" + cod_equipo + ", nombre=" + nombre + ", cod_liga=" + cod_liga + "]";
}

}
