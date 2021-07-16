package co.edu.uniquindio.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.uniquindio.modelo.Sede;

public class ConexionBase {

	private static String url = "jdbc:mysql://localhost:3306/buenPrecio";
	private static String usuario = "root";
	private static String password = "root";
	private static Connection conexion = null;

	public ConexionBase() {

	}

	public static void conectar() {

		try {

			conexion = DriverManager.getConnection(url, usuario, password);

		} catch (SQLException e) {
			System.out.println("Error con la base de datos " + e.getMessage());
		}
	}

	public int retornarCodigoPostal(String ciudad) {

		switch (ciudad) {

		case "armenia":
			return 1;

		case "medellin":
			return 2;

		case "bogota":
			return 3;

		}

		return -1;

	}

	public String retornarNombreCiudad(int codigo) {

		switch (codigo) {

		case 1:
			return "armenia";

		case 2:
			return "medellin";

		case 3:
			return "bogota";

		}

		return "No se encontro la ciudad";

	}

	public boolean crearSede(int codigoSede, String direccion, String codigoPostal) {

		boolean centinela = false;

		int codigoCiudad = retornarCodigoPostal(codigoPostal);
		PreparedStatement preparedStatement = null;

		if (codigoCiudad != -1) {

			conectar();

			try {
				preparedStatement = conexion
						.prepareStatement("insert into sede(codigoSede, direccion, ciudad_codigoPostal) values(?,?,?)");
				preparedStatement.setInt(1, codigoSede);
				preparedStatement.setString(2, direccion);
				preparedStatement.setInt(3, codigoCiudad);

				int aux = preparedStatement.executeUpdate();

				if (aux > 0) {
					conexion.close();

					return centinela = true;

				} else {
					return centinela;
				}

			} catch (SQLException e) {

				e.printStackTrace();
			}

		}
		return centinela;
	}

	public boolean eliminarSede(int codigoSede) {

		boolean centinela = false;

		PreparedStatement preparedStatement = null;
		conectar();

		try {

			preparedStatement = conexion.prepareStatement("delete from sede where codigoSede=?");
			preparedStatement.setInt(1, codigoSede);

			int aux = preparedStatement.executeUpdate();

			if (aux > 0) {
				conexion.close();

				return centinela = true;
			} else {

				return centinela;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return centinela;
	}

	public Sede buscarSede(int codigoSede) {

		Sede sede = null;

		PreparedStatement preparedStatement = null;
		ResultSet resultado = null;
		conectar();

		try {

			preparedStatement = conexion
					.prepareStatement("select codigoSede, direccion, ciudad_codigoPostal from sede where codigoSede=?");
			preparedStatement.setInt(1, codigoSede);

			resultado = preparedStatement.executeQuery();

			while (resultado.next()) {

				sede = new Sede();
				sede.setCodigoSede(resultado.getInt("codigoSede"));
				sede.setDireccion(resultado.getString("direccion"));
				sede.setCiudad_codigoPostal(resultado.getInt("ciudad_codigoPostal"));

			}

			conexion.close();

			if (sede == null) {
				JOptionPane.showMessageDialog(null, "No se ha encontrado la sede");
			} else {
				return sede;

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return sede;
	}

	public boolean modificarSede(int codigoSedeBusqueda, String direccion, String nombreCiudad, int codigoSedeNuevo) {

		boolean centinela = false;
		int codigoCiudad = retornarCodigoPostal(nombreCiudad);

		PreparedStatement preparedStatement = null;

		if (codigoCiudad != -1) {

			conectar();

			try {
				preparedStatement = conexion.prepareStatement(
						"update sede set codigoSede=?, direccion=?, ciudad_codigoPostal=? where codigoSede=?");
				preparedStatement.setInt(1, codigoSedeNuevo);
				preparedStatement.setString(2, direccion);
				preparedStatement.setInt(3, codigoCiudad);
				preparedStatement.setInt(4, codigoSedeBusqueda);

				int aux = preparedStatement.executeUpdate();

				if (aux > 0) {

					conexion.close();

					return centinela = true;
				} else {
					return centinela;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return centinela;
	}

	public ArrayList<Sede> cargarSedes() {

		ArrayList<Sede> listaSedes = new ArrayList<>();
		PreparedStatement preparedStatement = null;
		ResultSet resultado = null;
		Sede sede = null;

		conectar();

		try {

			preparedStatement = conexion.prepareStatement("select * from sede");
			resultado = preparedStatement.executeQuery();

			while (resultado.next()) {

				sede = new Sede();
				sede.setCodigoSede(resultado.getInt("codigoSede"));
				sede.setDireccion(resultado.getString("direccion"));
				sede.setCiudad_codigoPostal(resultado.getInt("ciudad_codigoPostal"));

				listaSedes.add(sede);

			}

			preparedStatement.close();
			resultado.close();
			conexion.close();

			return listaSedes;

		} catch (Exception e) {
			e.getMessage();
		}

		return null;
	}

}
