//Classe executivo que herda de empregado
public class EmpregadoExecutivo extends Empregado{
	double prolabore = this.salario;
	
	public EmpregadoExecutivo(String nome, String cargo, double salario) {
		super(nome, cargo, salario);
		this.prolabore = prolabore;
		
	}
	
	
}