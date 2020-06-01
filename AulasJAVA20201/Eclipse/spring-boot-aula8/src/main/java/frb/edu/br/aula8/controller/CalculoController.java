package frb.edu.br.aula8.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import frb.edu.br.aula8.caculadora.ConverteNumero;
import frb.edu.br.aula8.caculadora.Pessoa;
import frb.edu.br.aula8.caculadora.SimplesCalculadora;

@RestController
@RequestMapping("/calculo")
public class CalculoController {
	
	private SimplesCalculadora calcula = new SimplesCalculadora();
	
	@RequestMapping(value = "/sum/{numero1}/{numero2}", method=RequestMethod.GET)
	public Double sum(@PathVariable("numero1") String numero1, @PathVariable("numero2") String numero2) {
		
		return calcula.soma(ConverteNumero.converteParaDouble(numero1), ConverteNumero.converteParaDouble(numero1));
		
	}
	
	@RequestMapping(value = "/subtraction/{numero1}/{numero2}", method=RequestMethod.GET)
	public Double subtraction(@PathVariable("numero1") String numero1, @PathVariable("numero2") String numero2) {
		
		return calcula.subtracao(ConverteNumero.converteParaDouble(numero1), ConverteNumero.converteParaDouble(numero1));
		
	}
	
	@GetMapping("/raiz/{nr}")
	public Double raiz(@PathVariable("nr") Double nr) {
		return calcula.raiz(nr);
	}
	
	@GetMapping("/outrasoma/{nr1}/{nr2}")
	public Double outrasoma(@PathVariable("nr1") Double nr1, @PathVariable("nr2") Double nr2) {
		return calcula.soma(nr1, nr2);
	}
	
	@GetMapping("/teste")
	public String teste() {
		return "Teste";
	}
	
	@GetMapping("/pessoa")
	public Pessoa pessoa() {
		Pessoa pess = new Pessoa(432, "Maria", "F");
		
		return pess;
		
		
	}

}
