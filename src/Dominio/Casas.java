package Dominio;

public class Casas {

	private int numeroCasa;
	private float precio;
	private String tipoCasa;
	private String dimensiones;

	public Casas() {
	}

	public Casas(int numeroCasa, float precio, String tipoCasa, String dimensiones) {
		this.numeroCasa = numeroCasa;
		this.precio = precio;
		this.tipoCasa = tipoCasa;
		this.dimensiones = dimensiones;
	}

	@Override
	public String toString() {
		return "Casas [numeroCasa=" + numeroCasa + ", precio=" + precio + ", tipoCasa=" + tipoCasa + ", dimensiones="
				+ dimensiones + "]\n";
	}

	public int getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getTipoCasa() {
		return tipoCasa;
	}

	public void setTipoCasa(String tipoCasa) {
		this.tipoCasa = tipoCasa;
	}

	public String getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}

}
