package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Color {
	private String yourFavColor="blue";
	@GetMapping ("/color")
	public String gocolor() {
		return "My Favourite color is "+yourFavColor;
	}

}