package com.example.SpringDataBasicDemo.Repo.Impls;

import com.example.SpringDataBasicDemo.Domains.StudentLesson;
import com.example.SpringDataBasicDemo.Repo.StudentLessonRepository;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StudentLessonRepositoryImpl extends BaseRepo<StudentLesson> implements StudentLessonRepository {
    @Override
    public List<Object[]> getThemeTitlesOrderedByStudentId (Integer studentId) {
        String jpql = "SELECT t.title, count(t.title) FROM StudentLesson sl JOIN sl.lesson l" +
                " JOIN l.lessonTheme lt JOIN lt.theme t WHERE sl.student.id = :studentId AND NOT sl.result " +
                "GROUP BY t.title ORDER BY count(t.title) DESC LIMIT 5";
        TypedQuery<Object[]> query = entityManager.createQuery(jpql, Object[].class);
        query.setParameter("studentId", studentId);
        return query.getResultList();
    }
}