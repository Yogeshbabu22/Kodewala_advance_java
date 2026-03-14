package com.user.scheduling.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.user.scheduling.entity.UserBirthday;

@Repository
public interface UserBirthdayRepository  extends JpaRepository<UserBirthday, Long>{
	
	  @Query("SELECT u FROM UserBirthday u WHERE MONTH(u.birthday) = MONTH(CURRENT_DATE) " +
	           "AND DAY(u.birthday) = DAY(CURRENT_DATE)")
	    List<UserBirthday> findTodaysBirthdays();

}
