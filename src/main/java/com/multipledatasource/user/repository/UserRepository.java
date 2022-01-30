package com.multipledatasource.user.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.multipledatasource.model.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(value = "select a from User a")
	List<User> findAllUsers();

	@Transactional
	@Modifying
	@Query(value = "UPDATE User\n" + "SET name = 'john10'\n" + "WHERE id=1")
	void saveQ(int id, String name);

}
