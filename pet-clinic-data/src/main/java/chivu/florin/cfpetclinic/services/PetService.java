package chivu.florin.cfpetclinic.services;

import chivu.florin.cfpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

  Pet findbyId(Long id);

  Pet save(Pet pet);

  Set<Pet> findAll();
}
