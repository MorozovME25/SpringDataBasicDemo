Предметная область - Автошкола

Сущности:
1. Ученик (ID ученика, Экзамен, ФИО ученика, Категория обучения)
2. Преподаватель (ID преподавателя, ФИО преподавателя, Стаж работы)
3. Урок (ID урока, Количество заданий, Задания)
4. Экзамен (ID преподавателя, Время проведения, Результат, Дата проведения)
5. Темы правил ППД (ID темы, Название, Описание, Пункты из правил)
6. Результат (ID экзамена, ID темы, результат)

Сценарии:
1. Ученик проходит урок и получает список тем, в которых допустил ошибки, и список уроков, рекомендуемых для изучения, содержание в котором заданий по проблемным темам больше
2. Ученик проходит внутренний экзамен и получает оценку и рекомендацию от преподавателя на основе пройденных уроков
3. Формирование рекомендаций по обучению исходя из статистики прохождения внутреннего экзамена за последний месяц
