package com.example.Mygallery;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Mygallery.Model.Mygallery;
import com.example.Mygallery.Repository.MygalleryRepository;




@SpringBootApplication
public class MygalleryApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MygalleryApplication.class, args);
	}

	@Autowired
	private MygalleryRepository mygalleryRepository;

	@Override
	public void run(String... args) throws Exception {
	
			this.mygalleryRepository.save(new Mygallery("hdia", "omr", "hdiaomr@gamil.com"));
			this.mygalleryRepository.save(new Mygallery("hai", "bakar", "haibakar@gamil.com"));
			this.mygalleryRepository.save(new Mygallery("bibi", "khami", "bibikhami@gamil.com"));
			this.mygalleryRepository.save(new Mygallery("muni", "maulid", "munimaulid@gamil.com"));
			this.mygalleryRepository.save(new Mygallery("fomu", "yangu", "fomuyangu@gamil.com"));
		
	}
	






}
