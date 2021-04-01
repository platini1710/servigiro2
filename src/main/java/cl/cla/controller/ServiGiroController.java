package cl.cla.controller;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.cla.dto.InputPago;



@RestController
@RequestMapping("/servigiro/internalPayments")

public class ServiGiroController {

	@RequestMapping(value = "v1/payment", method = RequestMethod.POST, consumes = "application/json; charset=utf-8", produces = "application/json; charset=utf-8")
    public ResponseEntity<String>  crearPagos(		@RequestBody InputPago inputPago ) throws ServletException, IOException  {
		if (inputPago.getPago()<5000) {
			 return new ResponseEntity<>(
				      "no posee credenciales validas " , 
				      HttpStatus.CONFLICT);
		}
		 return new ResponseEntity<>(
			      "Pago generado correctamente " , 
			      HttpStatus.NO_CONTENT);
		
	}
	
	@PutMapping("/v1/payment/payment")
    public ResponseEntity<String>  updatePagos(		@RequestBody InputPago inputPago ) throws ServletException, IOException  {

	return new ResponseEntity<>(
				      "Pagos actualizados." , 
				      HttpStatus.NO_CONTENT);
			
	}
	
	@GetMapping("/v1/payment/{rut}/{serviceCode}")
    public ResponseEntity<String>  consultaPagos(		@RequestBody InputPago inputPago ) throws ServletException, IOException  {

	return new ResponseEntity<>(
				      "Actualizacion generada correctamente " , 
				      HttpStatus.NO_CONTENT);
			
	}
	
	@GetMapping("/v1/payment/{rut}")
    public ResponseEntity<String>  consultaPagos(	@RequestParam String paypass) throws ServletException, IOException  {

	return new ResponseEntity<>(
				      "Actualizacion generada correctamente " , 
				      HttpStatus.NO_CONTENT);
			
	}
	
	
	@GetMapping("/v1/payment/{rut}")
    public ResponseEntity<String>  notificacionPagos(	@RequestParam String paypass) throws ServletException, IOException  {

	return new ResponseEntity<>(
				      "Actualizacion generada correctamente " , 
				      HttpStatus.NO_CONTENT);
			
	}
	
}
