import static java.lang.Math.pow;

public abstract class Forma {

	protected double 	area = 0,
			 			perimeter = 0,
			 			lado = 0, 
						altura = 0,
						raio = 0;
	
	public double CalculArea(){
		
		if (lado ==0 && altura ==0){
			area = 3.1415*pow(raio,2);
		}
		if (raio==0){
			area = lado*altura;
		}
		return area;	
	}

	public double CalculPerimetro(){
		
		if (lado ==0 && altura ==0){
			perimeter = 2*3.1415*raio;
		}
		if ( raio ==0 ){
			perimeter = 2*lado + 2*altura;
		}
		return perimeter;
	
	}
}