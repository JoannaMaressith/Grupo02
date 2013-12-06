package Controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import GUI.CadastroConsumidores2;

public class Clientes {

	CadastroConsumidores2 clientes = new CadastroConsumidores2();
	
 List<CadastroConsumidores2> cadastro = new ArrayList<CadastroConsumidores2>();	
	
	
	
public void cadastrar (CadastroConsumidores2 cliente){
	
	cadastro.add(cliente);
}

public void retornarclientes(CadastroConsumidores2 retorno){
	
	for(CadastroConsumidores2 retornar : cadastro){
		JOptionPane.showMessageDialog(null,retornar.toString());
	}
	
}
 
}
