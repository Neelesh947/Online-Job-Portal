package com.naukri.in.userlogin.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.naukri.in.userlogin.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> 
{

	@Modifying
	@Transactional
	@Query("update User set password=:pass where userid=:uid")
	void updateUserPassword(@Param
			("pass")String pa,@Param("uid") String id);
}
