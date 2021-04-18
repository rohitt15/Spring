package com.hacker.moviecatalogservice.Resource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hacker.moviecatalogservice.model.CatalogItem;
import com.hacker.moviecatalogservice.model.Rating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable ("userId") String userId){
		List<Rating>ratings=Arrays.asList(
				new Rating("1234", 5),
				new Rating("4567",3)
				);
		return ratings.stream().map(rating -> new CatalogItem("pyar ka puchnama", userId, 5)).collect(Collectors.toList());}}