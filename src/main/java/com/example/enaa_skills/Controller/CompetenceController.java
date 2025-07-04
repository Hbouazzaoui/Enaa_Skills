package com.example.enaa_skills.Controller;

import com.example.enaa_skills.Dto.CompetenceDto;
import com.example.enaa_skills.Service.CompetenceService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/competences")

public class CompetenceController {

    @Autowired
    private CompetenceService competenceService;


    @PostMapping
    public CompetenceDto add(@RequestBody CompetenceDto dto) {
        return competenceService.addCompetence(dto);
    }



    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        competenceService.deleteCompetence(id);
    }

    @GetMapping("/{id}")
    public CompetenceDto getOne(@PathVariable Long id) {
        return competenceService.getCompetenceById(id);
    }

    @GetMapping
    public List<CompetenceDto> getAll() {
        return competenceService.getAllCompetences();
    }

    @PutMapping("/{id}")
    public CompetenceDto update(@PathVariable Long id, @RequestBody CompetenceDto dto) {
        return competenceService.updateCompetence(id, dto);
    }


}
