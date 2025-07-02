package com.example.enaa_skills.Mapper;

import com.example.enaa_skills.Dto.SousCompetenceDto;
import com.example.enaa_skills.Entity.SousCompetence;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SousCompetenceMapper {
    @Mapping(target = "competence", ignore = true) // Explicitly ignore competence field
    SousCompetence toEntity(SousCompetenceDto dto);

    SousCompetenceDto toDto(SousCompetence sousCompetence);
}