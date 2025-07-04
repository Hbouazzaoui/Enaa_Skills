package com.example.enaa_skills.Mapper;

import com.example.enaa_skills.Dto.SousCompetenceDTO;
import com.example.enaa_skills.Entity.SousCompetence;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SousCompetenceMapper {


    @Mapping(source = "competence.id", target = "competenceId")
    SousCompetenceDTO toDto(SousCompetence sousCompetence);

    @Mapping(target = "competence", ignore = true)
    SousCompetence toEntity(SousCompetenceDTO dto);


}