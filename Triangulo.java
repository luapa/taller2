package ejercicio3;

public class Triangulo extends ObjetoGeometrico {

	double lado1;
	double lado2;
	double lado3;

	public Triangulo(){
	lado1=1.0;
	lado2=1.0;
	lado3=1.0;              
	}

	public Triangulo(double lado1, double lado2, double lado3){
		this.lado1=lado1;
		this.lado2=lado2;
		this.lado3=lado3;
	}
	
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	public void calcularPerimetro() {

		double Pperimetro=this.lado1+this.lado2+this.lado3;
        super.setPerimetro(Pperimetro);
}


	public void calcularArea() {

	 	double PSemiperimetro= super.getPerimetro()/2;
	 	double Parea= Math.sqrt(PSemiperimetro*(PSemiperimetro-this.lado1)*(PSemiperimetro-this.lado2)*(PSemiperimetro-this.lado3));
        super.setArea(Parea);
}

public void mostrar()
{
	System.out.println("**************************************");
	System.out.println("El Triangulo con lados: "+ this.lado1+", "+ this.lado2+", "+ this.lado3);
	System.out.println("Tiene un ");
	System.out.println("Área= "+ super.getArea()+" y un");
	System.out.println("Perímetro= "+ super.getPerimetro());
	System.out.println("**************************************");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Triangulo T1= new Triangulo();
		Triangulo T2= new Triangulo(1,1.5,1);
		T2.calcularPerimetro();
		T2.calcularArea();
		T2.mostrar();
		
	}

}
