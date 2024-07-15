package com.example.SpringDataBasicDemo.Repo;

import com.example.SpringDataBasicDemo.Domains.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Integer> {
//    //pilots who don't have contracts
//    @Query(value = "select p from Pilot p " +
//            "join p.contract co where size(p.contract) = 0")
//    List<Pilot> findByPilotIsNull(@Param(value = "contract") Set<Contract> contract);
//
//    //pilots who have a certain type of license
//    @Query(value = "select p from Pilot p " +
//            "join p.licenseDistribution ld " + "join ld.license l where l.type = :type")
//    List<Pilot> findPilotByLicense(@Param(value = "type") String type);
//
//    //pilots who have penalty points less than the set value
//    @Query(value = "select p from Pilot p " + "join p.licenseDistribution ld where ld.penaltyPoints <= :penaltyPoints")
//    List<Pilot> findAllByTypeAndPenaltyPoints(@Param(value = "penaltyPoints") Integer penaltyPoints);
}
