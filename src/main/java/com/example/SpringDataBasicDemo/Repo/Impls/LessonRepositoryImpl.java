package com.example.SpringDataBasicDemo.Repo.Impls;

import com.example.SpringDataBasicDemo.Domains.Lesson;
import com.example.SpringDataBasicDemo.Repo.LessonRepository;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public class LessonRepositoryImpl extends BaseRepo<Lesson> implements LessonRepository {
    @Override
    public Set<Integer> getThemesIdsByLessonId (Integer lessonId) {
        String jpql = "SELECT distinct lt.theme.id FROM Lesson l JOIN l.lessonTheme lt WHERE l.id = :lessonId";
        TypedQuery<Integer> query = entityManager.createQuery(jpql, Integer.class);
        query.setParameter("lessonId", lessonId);
        return Set.copyOf(query.getResultList());
    }
    @Override
    public List<Object[]> getLessonThemeOrderedByLessonId (Integer lessonId, Set<Integer> titlesId) {
        String jpql = "SELECT distinct l.id, t.title FROM Lesson l JOIN l.lessonTheme lt JOIN lt.theme t " +
                "WHERE l.id != :lessonId AND t.id IN :titlesId ORDER BY l.id";
        TypedQuery<Object[]> query = entityManager.createQuery(jpql, Object[].class);
        query.setParameter("lessonId", lessonId);
        query.setParameter("titlesId", titlesId);
        return query.getResultList();
    }
}
