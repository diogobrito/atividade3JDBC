package com.atividade3.main;

import java.util.Date;
import java.util.List;

import com.atividade3.dao.GenericDao;
import com.atividadejdbc3.entity.Cliente;
import com.atividadejdbc3.entity.Pedido;

public class Main {

	public static void main(String[] args) {
		adicionarCleinte();
		listarClientes();
		buscarCliente(1);
	}
	
	public static void adicionarCleinte(){
		
			Cliente cliente = new Cliente();
			cliente.setNome("Steve Jobs");
			cliente.setEmail("jobs.steve@heaven.com");
		
			Pedido pedido = new Pedido();
			pedido.setData(new Date());
			pedido.setDescricao("Iphone 7s");
			pedido.setValor(749);
			
			cliente.getPedidos().add(pedido);
			
			GenericDao<Cliente> dao = new GenericDao<>(Cliente.class);
			dao.adicionar(cliente);
			System.out.println("Cliente " + cliente.getNome() + " adicionado.");
		
	}
	
	public static void buscarCliente(int idCliente){
		GenericDao<Cliente> dao = new GenericDao<>(Cliente.class);
		Cliente cli = dao.buscar(idCliente);
		
		System.out.println(cli);
	}
	
	public static void listarClientes(){
		GenericDao<Cliente> dao = new GenericDao<>(Cliente.class);
		List<Cliente> clientes = dao.listar();
		
		for(Cliente cli : clientes){
			System.out.println(cli);
		}
		
	}
	

}
