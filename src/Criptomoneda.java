public class Criptomoneda {
	private String nombre;
	private double valorDeToken;

	public Criptomoneda(String nombre, double valorDeToken) {
		this.nombre = nombre;
		this.valorDeToken = valorDeToken;
	}

	public String getNombre(){
		return this.nombre;
	}

	public double getValorDeToken(){
		return this.valorDeToken;
	}

	@Override
	public String toString(){
		return String.format("%5s", nombre) + ":" + String.format("%10.1f", valorDeToken);
	}
}
