package com.infinite.visa_portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infinite.visa_portal.entity.StatusDesc;

@Repository
public interface StatusDescRepository extends JpaRepository<StatusDesc, Long> {

}
