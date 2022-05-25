package com.agrogram.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agrogram.dto.ProductosDTO;
import com.agrogram.services.ProductoService;

@RestController
@RequestMapping("api/productos")
@CrossOrigin("*")
public class ProductoRestController {

	@Autowired
	private ProductoService productoService;
	
	@PostMapping("/addProducto")
	public ResponseEntity<?> addProducto(@RequestBody ProductosDTO productosDTO){
		try {
			return ResponseEntity.ok().body(productoService.addProducto(productosDTO));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
	}
	
	@PutMapping("/updateProducto")
	public ResponseEntity<?> updateProducto(@RequestBody ProductosDTO productosDTO){
		try {
			return ResponseEntity.ok().body(productoService.updateProducto(productosDTO));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
	}
	
	@DeleteMapping("/deleteProducto/{id}")
	public ResponseEntity<?> deleteProducto(@PathVariable("id") Integer idProducto) {
		try {
			productoService.eliminarProducto(idProducto);
			return ResponseEntity.ok().body("El producto se ha eliminado");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
	}
}