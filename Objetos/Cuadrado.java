public class Cuadrado {
private double lado;

public Cuadrado(double lado) {
	this.lado=lado;
}

public double getLado() {
	return lado;
}

public void setLado(double lado) {
	this.lado = lado;
}
public double calcularperimetro(){
	double perimetro= lado*4;
	return perimetro;
}
public double calculararea(){
	double area= lado*lado;
	return area;
}
}
