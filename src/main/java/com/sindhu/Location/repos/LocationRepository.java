package com.sindhu.Location.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sindhu.Location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

	@Query(value="Select type, count(type)  from location group by type", nativeQuery = true)
	public List<Object[]> findTypeAndTypeCount();
	//Object[0] contains type i.e., RURAL and URBAN
	//Object[1] contains count value of particular type
}
