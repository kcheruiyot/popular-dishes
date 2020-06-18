package com.kipngetich.populardishes.repository;

import com.kipngetich.populardishes.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Kipngetich
 */
@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
}
