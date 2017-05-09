package ejercicio4;
import java.util.Date;

public class Empleado extends Persona {

		private double salario;
		private Date fecha;
	
		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}

		public Date getFecha() {
			return fecha;
		}
		
		public void setFecha(Date fecha) {
			this.fecha = fecha;
		}
	
}
	