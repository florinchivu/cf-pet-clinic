package chivu.florin.cfpetclinic.services;

import chivu.florin.cfpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

  Vet findbyId(Long id);

  Vet save(Vet vet);

  Set<Vet> findAll();
}
