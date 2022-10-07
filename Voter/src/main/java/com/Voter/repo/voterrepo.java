package com.Voter.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Voter.entity.voter;

@Repository
public interface voterrepo extends JpaRepository<voter, Integer> {

}
