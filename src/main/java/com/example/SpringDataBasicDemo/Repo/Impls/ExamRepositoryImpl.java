package com.example.SpringDataBasicDemo.Repo.Impls;

import com.example.SpringDataBasicDemo.Domains.Exam;
import com.example.SpringDataBasicDemo.Repo.ExamRepository;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;
@Repository
public class ExamRepositoryImpl extends BaseRepo<Exam> implements ExamRepository {
    @Override
    public String getCommentByExamId (Integer examId) {
        String jpql = "SELECT e.comment FROM Exam e WHERE e.id = :examId";
        TypedQuery<String> query = entityManager.createQuery(jpql, String.class);
        query.setParameter("examId", examId);
        return query.getSingleResult();
    }
    public List<Object[]> getThemeResultsByExamId (Integer examId) {
        String jpql = "SELECT t.title, rt.result FROM Exam e JOIN e.resultForThemes rt JOIN rt.theme t" +
                " WHERE e.id = :examId";
        TypedQuery<Object[]> query = entityManager.createQuery(jpql, Object[].class);
        query.setParameter("examId", examId);
        return query.getResultList();
    }
    public List<String> getThemesOrderedByExamResults (Timestamp date1, Timestamp date2) {
        String jpql = "SELECT t.title FROM Exam e JOIN e.resultForThemes rt JOIN rt.theme t " +
                "WHERE e.date < :date2 AND e.date > :date1 AND NOT rt.result GROUP BY t.title " +
                "ORDER BY count(t.title) DESC LIMIT 5";
        TypedQuery<String> query = entityManager.createQuery(jpql, String.class);
        query.setParameter("date1", date1);
        query.setParameter("date2", date2);
        return query.getResultList();
    }
}