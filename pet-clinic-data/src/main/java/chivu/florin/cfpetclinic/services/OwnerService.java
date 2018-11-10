package chivu.florin.cfpetclinic.services;

import chivu.florin.cfpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner,Long> {

  Owner findByLastName(String lastName);

}
