package com.itstep.mytravelapp.repository;

import com.itstep.mytravelapp.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelsRepository extends JpaRepository<Hotel, Integer> {


}
