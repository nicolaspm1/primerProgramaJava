package consolaimc;

import imc.Imc;

public class MyImc {
	public static void main(String[] args){
		Imc nuevoImc = new Imc(92.2, 1.72);
		
		nuevoImc.obtenerImc();
		
		System.out.println("Segun el peso y altura que declaraste, tu imc es de : " + 
		nuevoImc.getImc() + "\n");
		
		//I use this method to update my weight
		nuevoImc.setPeso(90.4);
		nuevoImc.obtenerImc();
		
		//Calculating again with the updated weight
		
		System.out.println("\nActualizaste tu peso,  por lo tanto tu imc ahora es de : " + 
				nuevoImc.getImc());

	}
}
