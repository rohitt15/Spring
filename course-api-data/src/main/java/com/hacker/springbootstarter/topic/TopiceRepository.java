package com.hacker.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

/*if we have to do CRUD operation then we have to extend the interface CrudRepositort and no need to implement data layer 
and it is generic type thats why we are passing Topic and String
*/
public interface TopiceRepository extends CrudRepository<Topic,String>{

}
