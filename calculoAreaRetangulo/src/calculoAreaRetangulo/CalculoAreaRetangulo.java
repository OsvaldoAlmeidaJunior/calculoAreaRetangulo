package calculoAreaRetangulo;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class CalculoAreaRetangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		
		System.out.println("Entre com a Altura e Largura do Retangulo:");
		ret.largura = sc.nextInt();
		ret.altura = sc.nextInt();
		
		
		System.out.printf("AREA = %.2f%n", ret.area());
		System.out.printf("PERIMETRO = %.2f%n", ret.perimetro());
		System.out.printf("DIAGONAL = %.2f%n", ret.diagonal());
		
		
sc.close();
	}

}
