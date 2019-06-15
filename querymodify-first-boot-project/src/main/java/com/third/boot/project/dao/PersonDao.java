package com.third.boot.project.dao;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.transaction.annotation.Transactional;

import com.third.boot.project.entity.Person;

public interface PersonDao extends CrudRepository<Person, Integer> {

   

	@Transactional
    @Modifying
    @Query(value="update Person set email=:newEmail where id=:personId")
    void updatePersonEmailById(@Param("personId")int id,@Param("newEmail") String newEmail);
	

}
