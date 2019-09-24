
package com.journaldev.huffmancoding;

import java.io.*; 
import javax.swing.JOptionPane;

public class FileToString1{
	public static void main (String[]args){
		try{
			
			String nome;
			nome = JOptionPane.showInputDialog(null,"Entre com o nome do arquivo");
			
			BufferedReader br = new BufferedReader(new FileReader(nome));
			while(br.ready()){
                            
                            for (int i=0; i<br.readLine().length(); i++) {
                             String linha  = "" + (char)(br.readLine().charAt(i) + 3);
                            }
				String linha = br.readLine();
				System.out.println(linha);
			}
			br.close();
		}catch(IOException ioe){
			ioe.printStackTrace();
		} 
   } 
}