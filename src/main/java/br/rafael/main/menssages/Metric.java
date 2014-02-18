package br.rafael.main.menssages;

public class Metric {

	private double latitude;
	private double longitude;
	private boolean sinalDeIgnicao;
	
	public Metric(double latitude, double longitude, boolean sinalDeIgnicao) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.sinalDeIgnicao = sinalDeIgnicao;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public boolean isSinalDeIgnicao() {
		return sinalDeIgnicao;
	}

	public void setSinalDeIgnicao(boolean sinalDeIgnicao) {
		this.sinalDeIgnicao = sinalDeIgnicao;
	}
	
	
	
}
