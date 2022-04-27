package FIFA22;
/*Añadiendo comentarios cristhian*/
public class Liga {
private int cod_liga;
private String nombre;
private String pais;
/**
 * 
 */
public Liga() {
	super();
	// TODO Auto-generated constructor stub
}
/**
 * @param cod_liga
 * @param nombre
 * @param pais
 */
public Liga(int cod_liga, String nombre, String pais) {
	super();
	this.cod_liga = cod_liga;
	this.nombre = nombre;
	this.pais = pais;
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
 * @return the pais
 */
public String getPais() {
	return pais;
}
/**
 * @param pais the pais to set
 */
public void setPais(String pais) {
	this.pais = pais;
}
@Override
public String toString() {
	return "Liga [cod_liga=" + cod_liga + ", nombre=" + nombre + ", pais=" + pais + "]";
}

}
