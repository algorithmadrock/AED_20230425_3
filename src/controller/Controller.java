/*
 RESUMO		 : Ações do enunciado
 PROGRAMADORA: Luiza Felix
 DATA		 : 06/05/2023
 */

package controller;

import br.edu.fateczl.listas.Lista;

public class Controller {

	private static Lista lista = new Lista();
	
	public Controller() {
		super();
	}
	
	public static void loadlista() {
//		segundo os dados que foram requisitados no enunciado
		
		int[] vetor = {16,4,13,2,6,7,9,12,18,5,3};
		
		for(int dado : vetor) {
			lista.addfirst(dado);
		}
		System.out.println("A lista foi carregada!\n" + lista.toString());
		
	}
	
	public static void reverse() {
		int size = lista.size()-1;
		while(size>=0){
			
			try {
				System.out.print(lista.get(size) +"	");
			} catch (Exception e) {
			}
			
			size--;
	}
		System.out.println("");
	
	}


}
