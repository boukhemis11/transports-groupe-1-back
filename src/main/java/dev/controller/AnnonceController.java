package dev.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.entites.Annonce;
import dev.entites.Reservation;
import dev.entites.dto.AnnonceDto;
import dev.entites.dto.ReservationDto;
import dev.service.AnnonceService;

@RestController
@RequestMapping("annonce")
public class AnnonceController {

	private AnnonceService annonceService;

	public AnnonceController(AnnonceService annonceService) {
		this.annonceService = annonceService;
	}

	@GetMapping
	public List<Annonce> getAllAnnonces() {

		return this.annonceService.getAllAnnonces();
	}

	@PostMapping
	public Annonce postAnnonce(@RequestBody @Valid AnnonceDto annonceDto) {

		return this.annonceService.postAnnonce(annonceDto);
	}
}
