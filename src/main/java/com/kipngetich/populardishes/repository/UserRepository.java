package com.kipngetich.populardishes.repository;

import com.kipngetich.populardishes.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kipngetich
 */
public interface UserRepository extends CrudRepository<User,Integer> {
}
