package com.saravana.simpleapp.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.saravana.simpleapp.Entity.EmplInfo;

@Repository
public interface DBRepository extends JpaRepository<EmplInfo, Integer> {

	@Query(value = "select empl_id from test_db.emplinfo where driver_id = :driverId",nativeQuery =true)
	public Integer getEmplId(@Param("driverId") int driverId);
	
}
