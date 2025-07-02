package com.example.enaa_skills.Mapper;

import com.example.enaa_skills.Dto.CompetenceDto;
import com.example.enaa_skills.Entity.Competence;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {SousCompetenceMapper.class})
public interface CompetenceMapper {
    CompetenceDto toDto(Competence competence);

    Competence toEntity(CompetenceDto dto);
}