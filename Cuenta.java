package ejercicio1;
import java.util.Date;

public class Cuenta {

	private int id;
	private double saldo;
	private double interesAnual;
	private Date fechaDeCreacion;
	public double monto;
	
	
	public Cuenta (int id, double sal, double inte, Date fecha)
	{
		this.id=id;
		this.saldo=sal;
		this.interesAnual=inte;
		this.fechaDeCreacion=fecha;
	}
			
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getInteresAnual() {
		return interesAnual;
	}

	public void setInteresAnual(double interesAnual) {
		this.interesAnual = interesAnual;
	}

	public Date getFechaDeCreacion() {
		return fechaDeCreacion;
	}

	public void setFechaDeCreacion(Date fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}

	public double getInteresMensual()
	{
		return (saldo * this.getInteresAnual()/100/12);	
	}
	
	public double retira(double monto)
	{
		if (monto<=saldo)
			{saldo-= monto; return monto;}
		else return 0;
	}
	
	public void deposita (double monto)
	{
		saldo+= monto;
	}
	
	public void mostrar()
	{
		System.out.println("************************************************");
		System.out.println("Cuenta No. " + this.id);
		System.out.println("Balance = $ " + (saldo + getInteresMensual()));
		System.out.println("Valor Interes Mensual = $ " + getInteresMensual());
		System.out.println("Fecha de Creación = " + this.fechaDeCreacion);
		System.out.println("************************************************");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date fecha = new Date(117,4,6,9,30,0);
		Cuenta c1= new Cuenta(1122, 20000, 4.5, fecha);
		c1.deposita (3000);
		c1.retira(2500);
		c1.mostrar();
	}
}
