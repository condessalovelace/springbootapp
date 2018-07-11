package br.com.condessalovelace.springbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Serviço que dá um oi para o usuário.
 * 
 * @author condessalovelace
 *
 */
@RestController
@RequestMapping("/oi")
public class OiService {
	@GetMapping("/{nome}")
	public String getOi(@PathVariable(value = "nome") String nome) {
		return "Oi, " + nome + "!\n";
	}
}
