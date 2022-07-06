package com.example.Mygallery.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import javax.validation.constraints.Email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Mygallery.Exception.ResourceNotFoundException;
import com.example.Mygallery.Model.Mygallery;
import com.example.Mygallery.Repository.MygalleryRepository;

@RestController
@RequestMapping("/api")
public class MygalleryController {
    
    
    @Autowired
    private MygalleryRepository mygalleryRepository;

    @GetMapping("/api/Email")
    public List<Mygallery> getAllMygalleries()
    {
        return mygalleryRepository.findAll();
    }
    
    @PostMapping("/")
    public Mygallery addMygallery (@RequestBody Mygallery mygallery)
    {
        return mygalleryRepository.save(mygallery);
    }

    @PutMapping("/{Email}")
    public ResponseEntity<Mygallery> updateMygalleryEmailEntity(@PathVariable String Email, @RequestBody Mygallery mygallery)
    {
       Mygallery myg = mygalleryRepository.findAll(Email)
       .orElseThrow(() -> new ResourceNotFoundException("Invalid email"));
       myg.setFirstname(mygallery.getFirstname());
        myg.setLastname(mygallery.getLastname());
        myg.setEmail(mygallery.getEmail());
        Mygallery mygaller = mygalleryRepository.save(myg);
        return ResponseEntity.ok(mygaller);
    }

    @GetMapping("/{Email}")
    public ResponseEntity<Mygallery> getMygalleryEmail(@PathVariable String Email)
    {
        Mygallery myg = mygalleryRepository.findAll(Email)
        .orElseThrow(() -> new ResourceNotFoundException("Invalid email"));
        return ResponseEntity.ok(myg);
    }

    @DeleteMapping("/{Email}")
    public ResponseEntity<Map<String,Boolean>> deleteMygallery
    (@PathVariable String Email)
    {
        Mygallery myg = mygalleryRepository.findAll(Email)
        .orElseThrow(() -> new ResourceNotFoundException("Invalid Email"));
        mygalleryRepository.delete(myg);

        Map<String,Boolean> response = new HashMap<>();
        response.put("Deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }


    

}
