
public class TV {
	private int canal;
	private String modelo;
	private boolean ligada;
	private int volume;

	public TV(int canal, String modelo, boolean ligada, int volume) {
		this.canal = canal;
		this.modelo = modelo;
		this.ligada = ligada;
		this.volume = volume;
	}

	public void aumentarCanal() {
		this.canal = this.canal + 1;
	}

	public void diminuirCanal() {
		this.canal = this.canal - 1;
	}

	public void aumentarVolume() {
		this.volume = this.volume + 1;
	}

	public void diminuirVolume() {
		this.volume = this.volume - 1;
	}

	public void ligar() {
		this.ligada = true;
	}

	public void desligar() {
		this.ligada = true;
	}

	public int getCanal() {
		return canal;
	}

	public String getModelo() {
		return modelo;
	}

	public boolean isLigada() {
		return ligada;
	}

	public int getVolume() {
		return volume;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
