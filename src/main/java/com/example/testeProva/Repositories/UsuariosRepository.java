package com.example.testeProva.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.testeProva.Entities.UsuariosEntity;

@Repository
public interface UsuariosRepository extends JpaRepository<UsuariosEntity, Long> {

}