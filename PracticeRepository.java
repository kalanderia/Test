package com.ldt.practice1.repository;

import com.ldt.practice1.entity.Practice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PracticeRepository extends JpaRepository<Practice, Integer> {

    Practice findById(int practiceId);

}
