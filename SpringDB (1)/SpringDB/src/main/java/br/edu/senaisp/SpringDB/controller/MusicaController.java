package br.edu.senaisp.SpringDB.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.senaisp.SpringDB.model.EGenero;
import br.edu.senaisp.SpringDB.model.Musica;
import br.edu.senaisp.SpringDB.model.dto.MusicaDTOForm;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/musica")
public class MusicaController {

	@GetMapping
	public List<Musica> listarMusica() {
		List<Musica> lista = new ArrayList<>();
		
		lista.add(new Musica(1, "Morena tropicana", 4, "descDireitos", EGenero.KPOP));
		lista.add(new Musica(2, "Caneta Azul", 3, "descDireitos", EGenero.KPOP));
		lista.add(new Musica(3, "Negro Drama", 5, "descDireitos", EGenero.KPOP));

		return lista;
	}
	
	@GetMapping("/{id}")
	public MusicaDTOForm musicaById(@PathVariable int id) {
		List<Musica> lista = new ArrayList<>();
		
		lista.add(new Musica(1, "Morena tropicana", 4, "descDireitos", EGenero.KPOP));
		lista.add(new Musica(2, "Caneta Azul", 3, "descDireitos", EGenero.KPOP));
		lista.add(new Musica(3, "Negro Drama", 5, "descDireitos", EGenero.KPOP));

		List<String> generos = new ArrayList<String>();
		generos.add(EGenero.POP.toString());
		generos.add(EGenero.KPOP.toString());
		generos.add(EGenero.JPOP.toString());
		
		MusicaDTOForm dto = new MusicaDTOForm(879, "Zona norte", 7, "descDireitos", EGenero.POP.toString(), generos);
		
		return dto;
	}
	
	@PostMapping
	public ResponseEntity<Musica> gravar(@RequestBody @Valid Musica musica) {
		return ResponseEntity.ok(musica);
	}
	
}






