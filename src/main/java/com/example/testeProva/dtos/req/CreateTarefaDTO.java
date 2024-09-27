package com.example.testeProva.dtos.req;

import java.util.List;

public class CreateTarefaDTO {

  private String nome;
  private CreateResponsavelDTO responsavel;
  private List<CreateUsuarioDTO> usuarios;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public CreateResponsavelDTO getResponsavel() {
    return responsavel;
  }

  public void setResponsavel(CreateResponsavelDTO responsavel) {
    this.responsavel = responsavel;
  }

  public List<CreateUsuarioDTO> getUsuarios() {
    return usuarios;
  }

  public void setUsuarios(List<CreateUsuarioDTO> usuarios) {
    this.usuarios = usuarios;
  }

}
