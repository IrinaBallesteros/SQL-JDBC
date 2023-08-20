package com.alura.jdbc.controller;

import java.util.List;

import com.alura.jdbc.dao.ProductoDAO;
import com.alura.jdbc.factory.ConnectionFactory;
import com.alura.jdbc.modelo.Categoria;
import com.alura.jdbc.modelo.Producto;

public class ProductoController {
	
	private ProductoDAO productoDAO;

	public ProductoController() {
		var factory = new ConnectionFactory();
		this.productoDAO = new ProductoDAO(factory.recuperaConexion());
	}

	public int modificar(String nombre, String descripcion, Integer cantidad, Integer id) {
		return productoDAO.modificar(nombre, descripcion, cantidad, id);
			
	}

	public int eliminar(Integer id) {
		return productoDAO.eliminar(id);
			
	}

	public List<Producto> listar() {
		return productoDAO.listar();
	}
	
	 public void guardar (Producto producto, Integer categoriaId) {  
	    producto.setCategoriaId(categoriaId);
	    productoDAO.guardar(producto);
	}
	
	public List<Producto> listar(Categoria categoria){
		return productoDAO.listar(categoria);
	}
}

   
//    	var nombre = producto.getNombre();
//		var descripcion = producto.getDescripcion();
//		var cantidad =  producto.getCantidad();
//    	final var maximoCantidad = 50;
//    		
//				do {
//					int cantidadParaGuardar = Math.min(cantidad, maximoCantidad);
					
//					cantidad -= maximoCantidad;
//				} while(cantidad > 0);
//				System.out.println("COMMIT");
    
//	private void ejecutaRegistro(Producto producto, PreparedStatement statement)
//			throws SQLException {
//		if (cantidad < 50) {
//			throw new RuntimeException("Ocurrio un error");
		
//		
//		statement.setString(1, producto.getNombre());		
//		statement.setString(2, producto.getDescripcion());		
//		statement.setInt(3, producto.getCantidad());
//		
//		statement.execute();
//									
//		final ResultSet resultSet = statement.getGeneratedKeys();
//		
//		try(resultSet) {
//			while (resultSet.next()) {
//				producto.setId(resultSet.getInt(1));
//				System.out.println(String.format(
//						"Fue insertado el producto de ID %s", producto ));
				
			
		
	
