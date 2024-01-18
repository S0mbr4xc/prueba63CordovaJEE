package ec.edu.ups.ppw63.Prueba63Cordova.business;

import ec.edu.ups.ppw63.Prueba63Cordova.DAO.ClienteDAO;
import ec.edu.ups.ppw63.Prueba63Cordova.model.Cliente;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class GestionClientes {
	
	@Inject
	private ClienteDAO daoCliente;
	
	public void guardarClientes(Cliente cliente) {
		Cliente cli = daoCliente.read(cliente.getCodigo());
		if (cli != null){
			daoCliente.update(cliente);
		}else {
			daoCliente.insert(cliente);
		}
	}
	
	public Cliente getClientePorCedula(String cedula){
			
		return daoCliente.getClientePorCedula(cedula);
	}
}
