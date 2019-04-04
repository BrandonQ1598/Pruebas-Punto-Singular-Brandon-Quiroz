import java.util.ArrayList;
import java.util.Scanner;

public class Morse {
	public	static String[] letrasmorse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",
			".-.","...","-","..-","...-",".--","-..-","-.--","--..",".----","..---","...--","....-",".....","-....","--...","---..","----.","-----"};
	public static char[] letrastexto={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','1','2',
			'3','4','5','6','7','8','9','0'};
	public static void main(String[] args) {
		String cadena="";
		Scanner scan= new Scanner(System.in);
		System.out.println("Ingrese una cadena en codigo morse o texto");
		cadena=scan.nextLine();
		String traduccion="";
		if (cadena.charAt(0)=='-' || cadena.charAt(0)=='.') {
			traduccion=morsetotext(cadena);
			System.out.println("El texto traducido de morse es: "+traduccion);
		} else {
			traduccion=texttomorse(cadena);
			System.out.println("El texto traducido a morse es: "+traduccion);
		}
	}
	public static String morsetotext(String cadena){
		String[] palabras= cadena.split("   ");
		String[] letras= {};
		String letra="";
		String texto="";
		for (int i = 0; i < palabras.length; i++) {
			letras=palabras[i].split(" ");
			for (int j = 0; j < letras.length; j++) {
				letra=letras[j];
				for (int j2 = 0; j2 < letrasmorse.length; j2++) {
					if (letra.equals(letrasmorse[j2])) {
						texto+=letrastexto[j2];
					}	
				}
			}
			texto+=" ";
		}
		return texto;
	}
	public static String texttomorse(String cadena){
		String[] palabras= cadena.split(" ");
		char[] letras= {};
		char letra;
		int contador=0;
		String texto="";
		for (int i = 0; i < palabras.length; i++) {
			letras=palabras[i].toCharArray();
			for (int j = 0; j < letras.length; j++) {
				letra=letras[j];
				for (int j2 = 0; j2 < letrastexto.length; j2++) {
					if (letra==letrastexto[j2]) {
						texto+=letrasmorse[j2]+" ";
					}	
				}
			}
			texto+="   ";
		}
		return texto;
	}
}
