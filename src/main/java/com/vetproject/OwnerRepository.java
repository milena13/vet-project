package com.vetproject;

import com.vetproject.entity.Owner;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface OwnerRepository extends JpaRepository <Owner, Long> {


    // getAllOwners


}
