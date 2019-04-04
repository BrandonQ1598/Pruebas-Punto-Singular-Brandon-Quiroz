import java.util.Scanner;

public class Objetos {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int opcion;
		int x;
		System.out.println("Ingresa el tamaño del lado");
		double lado=scan.nextDouble();
		Cuadrado cuadrado= new Cuadrado(lado);
		Cubo cubo= new Cubo(lado);
		do {
			System.out.println("El tamaño del lado actual es: "+lado);
			System.out.println("Opciones de Calculo \n"
			         + "1.- Calcular Perimetro \n"
			         + "2.- Calcular Area \n"
			         + "3.- Calcular Volumen \n"
			         + "4.- Cancelar \n"
			         + "5.- Salir");
			switch (opcion=scan.nextInt()) {
			case 1:
				System.out.println("El perimetro del cuadrado creado es: "+cuadrado.calcularperimetro());
				System.out.println("El tamaño de lado actual es: "+lado);
				System.out.println("1.- Menu calculo \n"
						         + "2.- Nuevo dato");
				x=scan.nextInt();
				if (x==1) {
					break;
				}else if(x==2){
					System.out.println("Ingresa el tamaño del lado");
					lado=scan.nextDouble();
					cuadrado.setLado(lado);
					cubo.setLado(lado);
				}
				break;
			case 2:
				System.out.println("El area del cuadrado creado es: "+cuadrado.calculararea());
				System.out.println("El tamaño de lado actual es: "+lado);
				System.out.println("1.- Menu calculo \n"
						         + "2.- Nuevo dato");
				x=scan.nextInt();
				if (x==1) {
					break;
				}else if(x==2){
					System.out.println("Ingresa el tamaño del lado");
					lado=scan.nextDouble();
					cuadrado.setLado(lado);
					cubo.setLado(lado);
				}
				break;
			case 3:
				System.out.println("El volumen del cubo creado es: "+cubo.calcularvolumen());
				System.out.println("El tamaño de lado actual es: "+lado);
				System.out.println("1.- Menu calculo \n"
						         + "2.- Nuevo dato");
				x=scan.nextInt();
				if (x==1) {
					break;
				}else if(x==2){
					System.out.println("Ingresa el tamaño del lado");
					lado=scan.nextDouble();
					cuadrado.setLado(lado);
					cubo.setLado(lado);
				}
				break;
			case 4:
				System.out.println("Ingresa el tamaño del lado");
				lado=scan.nextDouble();
				cuadrado.setLado(lado);
				cubo.setLado(lado);
				break;
			case 5:
				System.out.println("Gracias por utilizar este programa :)");
				System.exit(0);
				break;
			default:
				System.out.println("Seleciiones una opcion correcta");
				break;
			}
		} while (opcion!=5);
	}
}
