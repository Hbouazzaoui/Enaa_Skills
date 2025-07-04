package com.example.enaa_skills.Service;

import com.example.enaa_skills.Dto.CompetenceDto;
import com.example.enaa_skills.Entity.Competence;
import com.example.enaa_skills.Mapper.CompetenceMapper;
import com.example.enaa_skills.Repository.CompetenceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class CompetenceService {

    private final CompetenceRepository competenceRepository;
    private final CompetenceMapper competenceMapper;


    public CompetenceService(CompetenceRepository competenceRepository, CompetenceMapper competenceMapper) {
        this.competenceRepository = competenceRepository;
        this.competenceMapper = competenceMapper;
    }

    public CompetenceDto addCompetence(CompetenceDto competenceDTO) {
        Competence competence = competenceMapper.toEntity(competenceDTO);
        Competence saved = competenceRepository.save(competence);
        return competenceMapper.toDto(saved);
    }



    public CompetenceDto getCompetenceById(Long id) {
        Competence competence = competenceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Compétence non trouvée"));
        return competenceMapper.toDto(competence);
    }

    public List<CompetenceDto> getAllCompetences() {
        List<Competence> competences = competenceRepository.findAll();
        return competences.stream()
                .map(competenceMapper::toDto)
                .collect(Collectors.toList());
    }

    public void deleteCompetence(Long id) {
        competenceRepository.deleteById(id);
    }


    public CompetenceDto updateCompetence(Long id, CompetenceDto dto) {
        Competence existing = competenceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Compétence non trouvée"));
        existing.setCode(dto.getCode());
        existing.setTitre(dto.getTitre());
        existing.setDescription(dto.getDescription());

        return competenceMapper.toDto(competenceRepository.save(existing));
    }



}