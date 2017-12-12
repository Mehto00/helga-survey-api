package helga.survey.repo;

import helga.survey.model.Answer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends CrudRepository<Answer, Integer> {

    <S extends Answer> S save(S s);

    <S extends Answer> Iterable<S> save(Iterable<S> iterable);

    void delete(Integer integer);

    void delete(Answer answer);

    void delete(Iterable<? extends Answer> iterable);

    void deleteAll();
}
