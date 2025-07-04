package com.example.enaa_skills.Service;
import com.example.enaa_skills.Dto.SousCompetenceDTO;
import com.example.enaa_skills.Entity.Competence;
import com.example.enaa_skills.Entity.SousCompetence;
import com.example.enaa_skills.Mapper.SousCompetenceMapper;
import com.example.enaa_skills.Repository.CompetenceRepository;
import com.example.enaa_skills.Repository.SousCompetenceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class SousCompetenceService {

    private final SousCompetenceRepository sousCompetenceRepository;
    private final SousCompetenceMapper sousCompetenceMapper;
    private final CompetenceRepository competenceRepository;



    public SousCompetenceService(SousCompetenceRepository sousCompetenceRepository, SousCompetenceMapper sousCompetenceMapper, CompetenceRepository competenceRepository) {
        this.sousCompetenceRepository = sousCompetenceRepository;
        this.sousCompetenceMapper = sousCompetenceMapper;
        this.competenceRepository = competenceRepository;
    }

    public SousCompetenceDTO create(SousCompetenceDTO dto) {
        SousCompetence entity = sousCompetenceMapper.toEntity(dto);

        if (dto.getCompetenceId() != null) {
            Competence comp = competenceRepository.findById(dto.getCompetenceId())
                    .orElseThrow(() -> new RuntimeException("Competence not found"));
            entity.setCompetence(comp);
        }

        SousCompetence saved = sousCompetenceRepository.save(entity);
        return sousCompetenceMapper.toDto(saved);
    }


    public List<SousCompetenceDTO> getAll() {
        List<SousCompetence> competences = sousCompetenceRepository.findAll();
        return competences.stream()
                .map(sousCompetenceMapper::toDto)
                .collect(Collectors.toList());
    }

    public void delete(Long id) {
        sousCompetenceRepository.deleteById(id);
    }

    public SousCompetenceDTO update(Long id, SousCompetenceDTO sousCompetenceDTO) {
        SousCompetence existing = sousCompetenceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Compétence non trouvée"));
        existing.setTitre(sousCompetenceDTO.getTitre());
        return sousCompetenceMapper.toDto(sousCompetenceRepository.save(existing));
    }
}
