package com.kipngetich.populardishes.repository;

import com.kipngetich.populardishes.model.Dish;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Kipngetich
 */
@Repository
public interface DishRepository extends CrudRepository<Dish,Integer>{
}
