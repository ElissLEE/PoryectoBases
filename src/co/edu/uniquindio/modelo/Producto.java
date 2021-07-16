package co.edu.uniquindio.modelo;

public class Producto {

	private int codigoProducto; 
	private String nombre;
	private String tipoProducto;
	private String descripcion;
	private int stock;
	private int precio;
	
	public Producto(int codigoProducto, String nombre, String tipoProducto, String descripcion, int stock, int precio) {
		this.codigoProducto = codigoProducto;
		this.nombre = nombre;
		this.tipoProducto = tipoProducto;
		this.descripcion = descripcion;
		this.stock = stock;
		this.precio = precio;
	}
	
	public Producto() {
		super();
	}

	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [codigoProducto=" + codigoProducto + ", nombre=" + nombre + ", tipoProducto=" + tipoProducto
				+ ", descripcion=" + descripcion + ", stock=" + stock + ", precio=" + precio + "]";
	}
	
	
}
