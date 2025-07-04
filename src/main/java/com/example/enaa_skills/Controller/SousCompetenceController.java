package com.example.enaa_skills.Controller;


import com.example.enaa_skills.Dto.SousCompetenceDTO;
import com.example.enaa_skills.Entity.SousCompetence;
import com.example.enaa_skills.Repository.SousCompetenceRepository;
import com.example.enaa_skills.Service.SousCompetenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/SousCompetences")

public class SousCompetenceController {
    private final SousCompetenceService sousCompetenceService;
    private final SousCompetenceRepository sousCompetenceRepository;



    @Autowired
    public SousCompetenceController(SousCompetenceService sousCompetenceService, SousCompetenceRepository sousCompetenceRepository) {
        this.sousCompetenceService = sousCompetenceService;

        this.sousCompetenceRepository = sousCompetenceRepository;
    }



//    @PostMapping
//    public SousCompetenceDTO add(@RequestBody SousCompetenceDTO sousCompetenceDTO) {
//        return sousCompetenceService.create(sousCompetenceDTO);
//    }

    @PostMapping
    public ResponseEntity<SousCompetenceDTO> create(@RequestBody SousCompetenceDTO dto) {
        SousCompetenceDTO savedDTO = sousCompetenceService.create(dto);
        return ResponseEntity.ok(savedDTO);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        sousCompetenceService.delete(id);
    }

    @GetMapping
    public List<SousCompetenceDTO> getAll() {
        return sousCompetenceService.getAll();
    }


    @GetMapping("/all")
    public List<SousCompetence> getAllSC() {
        return sousCompetenceRepository.findAll();
    }

    @PutMapping("/{id}")
    public SousCompetenceDTO update(@PathVariable Long id, @RequestBody SousCompetenceDTO dto) {
        return sousCompetenceService.update(id, dto);
    }







}