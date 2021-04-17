//classe principal
public class Main {

	public static void main(String[] args) {
		Empregado E1 = new Empregado("walter","Gerente", 4000.00);
		Empregado E2 = new Empregado("Carla","Diretora", 5000.00);
		
		EmpregadoExecutivo Ex1 = new EmpregadoExecutivo("Carlos","executivo", 15000.00);
		EmpregadoExecutivo Ex2 = new EmpregadoExecutivo("Beto","executivo", 10000.00);
		EmpregadoExecutivo Ex3 = new EmpregadoExecutivo("João","executivo", 25000.00);
		
		System.out.println("O "+E1.cargo+" se chama "+E1.nome);
		System.out.println("A "+E1.cargo+" se chama "+E2.nome);
		System.out.println();
		System.out.println("O "+Ex1.cargo+" "+Ex1.nome+" recebe R$"+Ex1.prolabore+" de prolabores");
		System.out.println("O "+Ex2.cargo+" "+Ex2.nome+" recebe R$"+Ex2.prolabore+" de prolabores");
		System.out.println("O "+Ex3.cargo+" "+Ex3.nome+" recebe R$"+Ex3.prolabore+" de prolabores");
	}

}