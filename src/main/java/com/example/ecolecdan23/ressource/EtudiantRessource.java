package com.example.ecolecdan23.ressource;

import com.example.ecolecdan23.dto.EtudiantDto;
import com.example.ecolecdan23.entity.EtudiantEntity;
import com.example.ecolecdan23.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Etudiant")
public class EtudiantRessource {

    @Autowired
    private EtudiantRepository repository;

    @GetMapping("get/{id}")
    public ResponseEntity get(@PathVariable String id)
    {
        Integer ID = Integer.parseInt(id);

        EtudiantEntity entity =repository.findById(ID).get();

        return new ResponseEntity(entity, HttpStatus.OK);

    }
}
