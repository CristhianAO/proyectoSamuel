package FIFA22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BDController {
	private Connection conexion;

	/**
	 * 
	 */
	public BDController() {
		super();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			this.conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/nba", "root", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error en la conexión del Constructor vacío del BDController");
		}
	}

	/**
	 * @return the conexion
	 */
	public Connection getConexion() {
		return conexion;
	}

	/**
	 * @param conexion the conexion to set
	 */
	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}
	public int dameCodEquipoPorNombre(String nombre) {
		int codigo = 0;
		try {
			Statement miStatement = this.conexion.createStatement();
			ResultSet rs = miStatement.executeQuery("Select cod_equipo from equipos where nombre like '" + nombre + "'");
			if (rs.next() == true) {
				codigo = rs.getInt("cod_equipo");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return codigo;
	}
	public int dameCodJugadorPorNombre(String nombre) {
		int codigo = 0;
		try {
			Statement miStatement = this.conexion.createStatement();
			ResultSet rs = miStatement.executeQuery("Select cod_jugador from jugadores where nombre like '" + nombre + "'");
			if (rs.next() == true) {
				codigo = rs.getInt("cod_jugador");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return codigo;
	}
	public int dameCodLigaPorNombre(String nombre) {
		int codigo = 0;
		try {
			Statement miStatement = this.conexion.createStatement();
			ResultSet rs = miStatement.executeQuery("Select cod_liga from ligas where nombre like '" + nombre + "'");
			if (rs.next() == true) {
				codigo = rs.getInt("cod_liga");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return codigo;
	}
	public int dameCodCartaPorNombre(String nombre) {
		int codigo = 0;
		try {
			Statement miStatement = this.conexion.createStatement();
			ResultSet rs = miStatement.executeQuery("Select cod_jugador from cartas where nombre like '" + nombre + "'");
			if (rs.next() == true) {
				codigo = rs.getInt("cod_jugador");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return codigo;
	}
	public String dameNombrePorCodCarta(int cod) {
		String nombre = "";
		try {
			Statement miStatement = this.conexion.createStatement();
			ResultSet rs = miStatement.executeQuery("Select nombre from cartas where cod_jugador like '" + cod + "'");
			if (rs.next() == true) {
				nombre = rs.getString("nombre");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nombre;
	}
	public ArrayList<Liga> todasLigas(){
			ArrayList<Liga> ligas = new ArrayList<Liga>();
			try {
				Statement miStatement = this.conexion.createStatement();
				ResultSet rs = miStatement.executeQuery("Select * from ligas");
				while (rs.next()==true) {
					ligas.add(new Liga(rs.getInt("cod_liga"), rs.getString("nombre"), rs.getString("pais")));
				}
				miStatement.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Error en BDcontroler metodo todosLigas");
			}
			return ligas;
	}
	public ArrayList<Carta> todasCartas(){
		ArrayList<Carta> cartas = new ArrayList<Carta>();
		try {
			Statement miStatement = this.conexion.createStatement();
			ResultSet rs = miStatement.executeQuery("Select * from cartas");
			while (rs.next()==true) {
				cartas.add(new Carta(rs.getString("nombre"), rs.getInt("cod_jugador"), rs.getInt("rat"), rs.getString("pos"), rs.getInt("precio"), rs.getInt("pac"), rs.getInt("sho"), rs.getInt("pas"), rs.getInt("dri"), rs.getInt("def"), rs.getInt("phy"), rs.getInt("pierna_mala"), rs.getInt("filigranas")));
			}
			miStatement.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error en BDcontroler metodo todosCartas");
		}
		return cartas;		
}
	public ArrayList<Jugador> todosJugadores(){
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		try {
			Statement miStatement = this.conexion.createStatement();
			ResultSet rs = miStatement.executeQuery("Select * from jugadores");
			while (rs.next()==true) {
				jugadores.add(new Jugador(rs.getInt("cod_jugador"), rs.getString("nombre"), rs.getInt("cod_equipo"), rs.getString("pierna"), rs.getInt("altura"),rs.getString("pais")));
			}
			miStatement.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error en BDcontroler metodo todosJugadores");
		}
		return jugadores;
}
			
}
