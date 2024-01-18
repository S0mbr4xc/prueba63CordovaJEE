package ec.edu.ups.ppw63.Prueba63Cordova.business;

import ec.edu.ups.ppw63.Prueba63Cordova.DAO.ClienteDAO;
import ec.edu.ups.ppw63.Prueba63Cordova.DAO.DeudaDAO;
import ec.edu.ups.ppw63.Prueba63Cordova.model.Cliente;
import ec.edu.ups.ppw63.Prueba63Cordova.model.Deuda;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Singleton
@Startup
public class GestionDatos {
	
	@Inject
	private ClienteDAO daoCliente;
	
	@Inject
	private DeudaDAO daoDeuda;
	
	@PostConstruct
	public void init() {
		System.out.println("Iniciando");
		
		Cliente cliente = new Cliente();
		cliente.setCodigo(1);
		cliente.setDni("0106785678");
		cliente.setNombre("Esteban");
		
		daoCliente.insert(cliente);
		
		cliente = new Cliente();
		cliente.setCodigo(2);
		cliente.setDni("02030405");
		cliente.setNombre("Eduardo");
		
		daoCliente.insert(cliente);
		
		Deuda deuda = new Deuda();
		deuda.setCliente(cliente);
		deuda.setCodigo(1);
		deuda.setNombre("LUZ");
		deuda.setMonto(53.25);
		
		daoDeuda.insert(deuda);
	}
}
