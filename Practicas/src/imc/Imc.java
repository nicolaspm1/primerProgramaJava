package imc;

import java.lang.Math;

public class Imc {
	private double altura;
	private double peso;
	private double imc;
	
	public Imc(double peso, double altura){
		this.peso = peso;
		this.altura = altura;
	}
	
	public void setPeso(double peso){
		this.peso = peso;
	}
	
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	public void obtenerImc(){
		this.imc = this.peso / Math.pow(this.altura, 2);
	}
	
	public double getImc(){
		return imc;
	}
}
