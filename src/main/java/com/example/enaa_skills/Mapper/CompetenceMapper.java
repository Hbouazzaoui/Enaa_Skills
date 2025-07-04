package com.example.enaa_skills.Mapper;

import com.example.enaa_skills.Dto.CompetenceDto;
import com.example.enaa_skills.Entity.Competence;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring", uses = {SousCompetenceMapper.class})
public interface CompetenceMapper {
    @Mapping(source = "sousCompetences", target = "sousCompetences")
    CompetenceDto toDto(Competence competence);

    @Mapping(source = "sousCompetences", target = "sousCompetences")
    Competence toEntity(CompetenceDto dto);
}