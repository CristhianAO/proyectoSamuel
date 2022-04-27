package FIFA22;

public class Carta {
	private String nombre;
	private int cod_jugador;
	private int rat;
	private String pos;
	private int precio;
	private int pac;
	private int sho;
	private int pas;
	private int dri;
	private int def;
	private int phy;
	private int pierna_mala;
	private int filigranas;
	/**
	 * 
	 */
	public Carta() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param nombre
	 * @param cod_jugador
	 * @param rat
	 * @param pos
	 * @param precio
	 * @param pac
	 * @param sho
	 * @param pas
	 * @param dri
	 * @param def
	 * @param phy
	 * @param pierna_mala
	 * @param filigranas
	 */
	public Carta(String nombre, int cod_jugador, int rat, String pos, int precio, int pac, int sho, int pas, int dri,
			int def, int phy, int pierna_mala, int filigranas) {
		super();
		this.nombre = nombre;
		this.cod_jugador = cod_jugador;
		if (rat>= 0 && rat<=99) {
			this.rat = rat;
		}else {
			System.out.println("El rat es incorrecto");
		}
		this.pos = pos;
		this.precio = precio;
		if (pac>= 0 && pac<=99) {
			this.pac = pac;
		}else {
			System.out.println("El pac es incorrecto");
		}
		if (sho>= 0 && sho<=99) {
			this.sho = sho;
		}else {
			System.out.println("El sho es incorrecto");
		}
		if (pas>= 0 && pas<=99) {
			this.pas = pas;
		}else {
			System.out.println("El pas es incorrecto");
		}
		if (dri>= 0 && dri<=99) {
			this.dri = dri;
		}else {
			System.out.println("El dri es incorrecto");
		}
		if (def>= 0 && def<=99) {
			this.def = def;
		}else {
			System.out.println("El def es incorrecto");
		}
		if (phy>= 0 && phy<=99) {
			this.phy = phy;
		}else {
			System.out.println("El phy es incorrecto");
		}
		if (pierna_mala>= 0 && pierna_mala<=5) {
			this.pierna_mala = pierna_mala;
		}else {
			System.out.println("La pierna_mala es incorrecta");
		}
		if (filigranas>= 0 && filigranas<=5) {
			this.filigranas = filigranas;
		}else {
			System.out.println("Las filigranas son incorrectas");
		}
		
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
	 * @return the rat
	 */
	public int getRat() {
		return rat;
	}
	/**
	 * @param rat the rat to set
	 */
	public void setRat(int rat) {
		if (rat>= 0 && rat<=99) {
			this.rat = rat;
		}else {
			System.out.println("El rat es incorrecto");
			this.rat = 0;
		}
	}
	
	/**
	 * @return the pos
	 */
	public String getPos() {
		return pos;
	}
	/**
	 * @param pos the pos to set
	 */
	public void setPos(String pos) {
		this.pos = pos;
	}
	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	/**
	 * @return the pac
	 */
	public int getPac() {
		return pac;
	}
	/**
	 * @param pac the pac to set
	 */
	public void setPac(int pac) {
		if (pac>= 0 && pac<=99) {
			this.pac = pac;
		}else {
			System.out.println("El pac es incorrecto");
			this.pac = 0;
		}
	}
	/**
	 * @return the sho
	 */
	public int getSho() {
		return sho;
	}
	/**
	 * @param sho the sho to set
	 */
	public void setSho(int sho) {
		if (sho>= 0 && sho<=99) {
			this.sho = sho;
		}else {
			System.out.println("El sho es incorrecto");
			this.sho = 0;
		}
	}
	/**
	 * @return the pas
	 */
	public int getPas() {
		return pas;
	}
	/**
	 * @param pas the pas to set
	 */
	public void setPas(int pas) {
		if (pas>= 0 && pas<=99) {
			this.pas = pas;
		}else {
			System.out.println("El pas es incorrecto");
			this.pas = 0;
		}
	}
	/**
	 * @return the dri
	 */
	public int getDri() {
		return dri;
	}
	/**
	 * @param dri the dri to set
	 */
	public void setDri(int dri) {
		if (dri>= 0 && dri<=99) {
			this.dri = dri;
		}else {
			System.out.println("El dri es incorrecto");
			this.dri = 0;
		}
	}
	/**
	 * @return the def
	 */
	public int getDef() {
		return def;
	}
	/**
	 * @param def the def to set
	 */
	public void setDef(int def) {
		if (def>= 0 && def<=99) {
			this.def = def;
		}else {
			System.out.println("El def es incorrecto");
			this.def = 0;
		}
	}
	/**
	 * @return the phy
	 */
	public int getPhy() {
		return phy;
	}
	/**
	 * @param phy the phy to set
	 */
	public void setPhy(int phy) {
		if (phy>= 0 && phy<=99) {
			this.phy = phy;
		}else {
			System.out.println("El phy es incorrecto");
			this.phy = 0;
		}
	}
	/**
	 * @return the pierna_mala
	 */
	public int getPierna_mala() {
		return pierna_mala;
	}
	/**
	 * @param pierna_mala the pierna_mala to set
	 */
	public void setPierna_mala(int pierna_mala) {
		if (pierna_mala>= 0 && pierna_mala<=5) {
			this.pierna_mala = pierna_mala;
		}else {
			System.out.println("La pierna_mala es incorrecta");
			this.pierna_mala = 0;
		}
	}
	/**
	 * @return the filigranas
	 */
	public int getFiligranas() {
		return filigranas;
	}
	/**
	 * @param filigranas the filigranas to set
	 */
	public void setFiligranas(int filigranas) {
		if (filigranas>= 0 && filigranas<=5) {
			this.filigranas = filigranas;
		}else {
			System.out.println("Las filigranas son incorrectas");
			this.filigranas = 0;
		}
	}
	@Override
	public String toString() {
		return "Carta [nombre=" + nombre + ", cod_jugador=" + cod_jugador + ", rat=" + rat + ", pos=" + pos
				+ ", precio=" + precio + ", pac=" + pac + ", sho=" + sho + ", pas=" + pas + ", dri=" + dri + ", def="
				+ def + ", phy=" + phy + ", pierna_mala=" + pierna_mala + ", filigranas=" + filigranas + "]";
	}
	
}
