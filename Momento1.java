/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author 509
 */
public class Momento1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.print( "Escribir un algoritmo donde el usuario ingrese, para una venta, el nombre de un artículo, el valor unitario y la cantidad vendida. ");

			Scanner a = new Scanner(System.in);
			System.out.println("\n Ingresa el nombre del articulo");
			String nom = a.next();

			Scanner b = new Scanner(System.in);
			System.out.println("\n valor unitario del articulo");
			double valor = b.nextDouble();

			Scanner c = new Scanner(System.in);
			System.out.println("\n cantidad vendida del articulo");
			int cantven = c.nextInt();
                        
                        
                        double bruto=valor*cantven;
                        
                        
                        if ((bruto < 100000 )) {
                            
                          double  desc=bruto*0.10;
                          double iva=bruto*0.19;
                          double total= bruto+iva-desc;
				System.out.print("\n El nombre del producto es: " + nom
                                                +"\n valor unitario: "+valor
                                                +"\n cantidad vendida: "+cantven
                                                +"\n valor bruto "+bruto
                                                +"\n valor desc "+desc
                                                +"\n valor iva "+iva
                                                +"\n valor total "+total);
				
			}
                        if ((bruto > 100000 )) {
                            
                          
                          double iva=bruto*0.19;
                          double  desc=(bruto-iva)*0.15;
                          double total= bruto-desc;
                          
				System.out.print("\n El nombre del producto es: " + nom
                                                +"\n valor unitario: "+valor
                                                +"\n cantidad vendida: "+cantven
                                                +"\n valor bruto "+bruto
                                                +"\n valor desc "+desc
                                                +"\n valor iva "+iva
                                                +"\n valor total "+total);
				
			}
	}
    
}