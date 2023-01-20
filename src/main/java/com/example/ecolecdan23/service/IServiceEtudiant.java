package com.example.ecolecdan23.service;

import com.example.ecolecdan23.dto.EtudiantDto;
import com.example.ecolecdan23.dto.ImputEtudiantDto;
import com.example.ecolecdan23.entity.EtudiantEntity;

import java.time.LocalDate;

public interface IServiceEtudiant {

    Integer calculerAge(LocalDate date_naisse);
    EtudiantDto toDto(EtudiantEntity entity);

    Integer ajouterEtudiant (ImputEtudiantDto dto);

    Boolean exist(Integer id);

    Boolean delete(Integer id);


}
