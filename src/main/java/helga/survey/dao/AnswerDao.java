package helga.survey.dao;

import helga.survey.model.Answer;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface AnswerDao extends CrudRepository<Answer, Integer> {


    /**
     * This method will find an User instance in the database by its email.
     * Note that this method is not implemented and its working code will be
     * automagically generated from its signature by Spring Data JPA.
     */
    public Answer findByAnswerId(Long answerId);

    public Answer findAnswerByAnswerId(Long answerId);

    Answer queryAnswerByAnswerId(Long answerId);
}
