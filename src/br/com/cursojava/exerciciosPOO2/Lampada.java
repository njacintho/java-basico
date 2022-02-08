package br.com.cursojava.exerciciosPOO2;

public class Lampada {
	
	private String marca;
	private String modelo;
	private int tensao;
	private int potencia;
	private String cor;
    private int meesGarantia;
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public int getPotencia() {
		return potencia;
	}


	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public int getMeesGarantia() {
		return meesGarantia;
	}


	public void setMeesGarantia(int meesGarantia) {
		this.meesGarantia = meesGarantia;
	}


	private boolean botao;
	
	
	
	public boolean getBotao() {
		 if(botao) {
			 System.out.print("A lampada está ligada: ");
		 }else {
			 System.out.print("A lampada está desligada: ");
		 }
		return botao;
	}


	public void setBotao(boolean botao) {
		this.botao = botao;
	}


	String getModelo() {
		return modelo;
	}


	void setModelo(String modelo) {
		this.modelo = modelo;
	}


	int getTensao() {
		return tensao;
	}


	void setTensao(int tensao) {
		this.tensao = tensao;
	}

		 
//	public String ligar() {
//		return "Lampada On";
//	}
//	
//
//	public String desligar() {
//		return "Lampada off";
//	}
	

}
