package com.example.Mygallery.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Mygallery.Model.Mygallery;

public interface MygalleryRepository extends JpaRepository <Mygallery, String>{

    Optional<Mygallery> findAll(String email);

    
}
