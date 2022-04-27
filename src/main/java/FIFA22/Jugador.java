package FIFA22;

public class Jugador {
	private int cod_jugador;
	private String nombre;
	private int cod_equipo;
	private String pierna;
	private int altura;
	private String pais;
	/**
	 * 
	 */
	public Jugador() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param cod_jugador
	 * @param nombre
	 * @param cod_equipo
	 * @param pierna
	 * @param altura
	 * @param pais
	 */
	public Jugador(int cod_jugador, String nombre, int cod_equipo, String pierna, int altura, String pais) {
		super();
		this.cod_jugador = cod_jugador;
		this.nombre = nombre;
		this.cod_equipo = cod_equipo;
		this.pierna = pierna;
		this.altura = altura;
		this.pais = pais;
	}
	/**
	 * @return the cod_jugador
	 */
	public int getCod_jugador() {
		return cod_jugador;
	}
	/**
	 * @param cod_jugador the cod_jugador to set
	 */
	public void setCod_jugador(int cod_jugador) {
		this.cod_jugador = cod_jugador;
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
	 * @return the pierna
	 */
	public String getPierna() {
		return pierna;
	}
	/**
	 * @param pierna the pierna to set
	 */
	public void setPierna(String pierna) {
		this.pierna = pierna;
	}
	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}
	/**
	 * @param altura the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
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
		return "Jugador [cod_jugador=" + cod_jugador + ", nombre=" + nombre + ", cod_equipo=" + cod_equipo + ", pierna="
				+ pierna + ", altura=" + altura + ", pais=" + pais + "]";
	}
	
}
