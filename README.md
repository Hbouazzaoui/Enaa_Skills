# Microservice de Gestion des Compétences

## Description

Ce microservice permet de gérer les compétences et leurs sous-compétences pour le suivi de l’acquisition des compétences des collaborateurs. Il propose des API REST pour créer, modifier, supprimer et suivre l’état des compétences, ainsi qu’un tableau de bord pour visualiser la progression des apprenants.

## Fonctionnalités

- Création, modification et suppression de compétences et sous-compétences  
- Validation du statut des sous-compétences  
- Calcul automatique du statut global d’une compétence en fonction des sous-compétences validées  
- Consultation d’un tableau de bord synthétique par apprenant  
- Export des rapports de progression  
- Documentation API avec Swagger  
- Tests unitaires avec JUnit et Mockito  
- Conteneurisation avec Docker et Docker Compose  

## Technologies utilisées

- Backend : Spring Boot, Spring Data JPA  
- Base de données : PostgreSQL / MySQL  
- Tests : JUnit, Mockito  
- Conteneurisation : Docker, Docker Compose  
- Documentation : Swagger  

## Prérequis

- Java 17 ou supérieur  
- Maven ou Gradle  
- Docker (optionnel pour conteneurisation)  
- PostgreSQL ou MySQL (local ou via Docker)  

## Installation et lancement

### Cloner le dépôt

```bash
git clone https://github.com/ton-utilisateur/gestion-competences.git
cd gestion-competences
