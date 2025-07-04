package com.example.enaa_skills.Dto;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class SousCompetenceDTO {
    private Long id;
    private String titre;
    private Long competenceId;
    private Boolean validation;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
    public Long getCompetenceId() {
        return competenceId;
    }
    public void setCompetenceId(Long competenceId) {
        this.competenceId = competenceId;
    }

    public Boolean getValidation() {
        return validation;
    }

    public void setValidation(Boolean validation) {
        this.validation = validation;
    }
}