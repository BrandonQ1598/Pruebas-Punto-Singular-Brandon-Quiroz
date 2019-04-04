import java.util.Scanner;

public class Romanos {
	public static String unidads,decenas,centenas;
	public static int unidad = 0,decena=0,centena=0;
	public static void main(String[] args) {
		int numero=0;
		Scanner scan= new Scanner(System.in);
		System.out.println("Ingrese un numero del 1 al 1000");
		numero=scan.nextInt();
		String romano=converttoromanos(numero);
		System.out.println("El numero en romano es: "+romano);
	}
	public static String converttoromanos(int numero){
		String cadena=numero+"";
		String cadena2="";
		String numrom="";
		for (int i = 0; i < cadena.length(); i++) {
			cadena2+=cadena.charAt((cadena.length()-1)-i);
		}
		if (cadena.length()==4) {
			numrom+="M";
		}else if (cadena.length()==3) {
			centenas=""+cadena2.charAt(2);
			decenas=""+cadena2.charAt(1);
			unidads=""+cadena2.charAt(0);
			centena=Integer.parseInt(centenas);
			decena=Integer.parseInt(decenas);
			unidad=Integer.parseInt(unidads);
			if (centena>=1 && centena<=3) {
				for (int i = 1; i <= centena; i++) {
					numrom+="C";
				}
			}else if (centena==4) {
				numrom+="CD";
			}else if (centena==5) {
				numrom+="D";
			}else if (centena>=6 && centena<=8) {
				numrom+="D";
				for (int i = 1; i <= (centena-5); i++) {
					numrom+="C";
				}
			}else if (centena==9) {
				numrom+="CM";
			}
			if (decena>=1 && decena<=3) {
				for (int i = 1; i <= decena; i++) {
					numrom+="X";
				}
			}else if (decena==4) {
				numrom+="XL";
			}else if (decena==5) {
				numrom+="L";
			}else if (decena>=6 && decena<=8) {
				numrom+="L";
				for (int i = 1; i <= (decena-5); i++) {
					numrom+="X";
				}
			}else if (decena==9) {
				numrom+="XC";
			}
			if (unidad>=1 && unidad<=3) {
				for (int i = 1; i <= unidad; i++) {
					numrom+="I";
				}
			}else if(unidad==4){
				numrom+="IV";
			}else if (unidad==5) {
				numrom+="V";
			}else if (unidad>=6 && unidad<=8) {
				numrom+="V";
				for (int i = 1; i <= (unidad-5); i++) {
					numrom+="I";
				}
			}else if (unidad==9) {
				numrom+="IX";
			}
		}else if (cadena.length()==2) {
			decenas=""+cadena2.charAt(1);
			unidads=""+cadena2.charAt(0);
			decena=Integer.parseInt(decenas);
			unidad=Integer.parseInt(unidads);
			if (decena>=1 && decena<=3) {
				for (int i = 1; i <= decena; i++) {
					numrom+="X";
				}
			}else if (decena==4) {
				numrom+="XL";
			}else if (decena==5) {
				numrom+="L";
			}else if (decena>=6 && decena<=8) {
				numrom+="L";
				for (int i = 1; i <= (unidad-5); i++) {
					numrom+="X";
				}
			}else if (decena==9) {
				numrom+="XC";
			}
			System.out.println(unidad);
			if (unidad>=1 && unidad<=3) {
				for (int i = 1; i <= unidad; i++) {
					numrom+="I";
				}
			}else if(unidad==4){
				numrom+="IV";
			}else if (unidad==5) {
				numrom+="V";
			}else if (unidad>=6 && unidad<=8) {
				numrom+="V";
				for (int i = 1; i <= (unidad-5); i++) {
					numrom+="I";
				}
			}else if (unidad==9) {
				numrom+="IX";
			}
		}else if (cadena.length()==1) {
			unidads=""+cadena2.charAt(0);
			unidad=Integer.parseInt(unidads);
			if (unidad>=1 && unidad<=3) {
				for (int i = 1; i <= unidad; i++) {
					numrom+="I";
				}
			}else if(unidad==4){
				numrom+="IV";
			}else if (unidad==5) {
				numrom+="V";
			}else if (unidad>=6 && unidad<=8) {
				numrom+="V";
				for (int i = 1; i <= (unidad-5); i++) {
					numrom+="I";
				}
			}else if (unidad==9) {
				numrom+="IX";
			}
		}
		return numrom;
	}
}
