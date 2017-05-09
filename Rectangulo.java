package ejercicio2;

public class Rectangulo {
	 public double altura;
	 public double ancho;
	 
public Rectangulo()
{
	altura = 1;
	ancho = 1;
}

public Rectangulo(double ancho, double altura)
{
this.ancho= ancho;
this.altura = altura;
}

public double getAncho() {
	return ancho;
}

public void setAncho(double ancho) {
	this.ancho = ancho;
}

public double getAltura() {
	return altura;
}

public void setAltura(double altura) {
	this.altura = altura;
}

public double getArea ()
{
	return (this.altura * this.ancho);
}

public double getPerimetro ()
{
	return (this.altura*2 + this.ancho*2);
}
public void mostrar()
{
	System.out.println("***********************************");
	System.out.println("El Rectangulo de:");
	System.out.println("Altura = " + this.altura);
	System.out.println("Ancho = " + this.ancho);
	System.out.println("Tiene un");
	System.out.println("Área = " + this.getArea()+" y un " );
	System.out.println("Perímetro = " + this.getPerimetro());
	System.out.println("");
	}

public static void main(String[] args) 
{
	Rectangulo R1= new Rectangulo();
	Rectangulo R2= new Rectangulo(4,40);
	Rectangulo R3= new Rectangulo(3.5,35.9);
	R2.mostrar();
	R3.mostrar();
}

}

