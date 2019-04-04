public class Cubo extends Cuadrado{
	public Cubo (double lado){
		super(lado);
	}
	public double calcularvolumen(){
		double volumen=this.getLado()*this.getLado()*this.getLado();
		return volumen;
	}
}
