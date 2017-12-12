package helga.survey.controller;

import helga.survey.dao.AnswerDao;
import helga.survey.model.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AnswerController {

    @Autowired
    private AnswerDao answerDao;

    @RequestMapping("/create")
    @ResponseBody
    public String create(String ika, String sukupuoli, String kampus, String jasenyys, String hyoty, String evkaytto, String evongelma, String laatu, String arviointi, String ristiriita, String tyoharjoittelu, String kuormittavuus, String lasnaolo, String opetusteknologia, String kerhotoiminta, String tapahtumat, String tutorointi, String vapaa) {
        Long answerid;
        try {
            Answer answer = new Answer( ika,  sukupuoli,  kampus,  jasenyys,  hyoty,  evkaytto,  evongelma,  laatu,  arviointi,  ristiriita,  tyoharjoittelu,  kuormittavuus,  lasnaolo,  opetusteknologia,  kerhotoiminta,  tapahtumat,  tutorointi,  vapaa);
            answerDao.save(answer);
            answerid = answer.getAnswerId();
        }
        catch (Exception ex) {
            return "Error creating the user: " + ex.toString();
        }
        return "User succesfully created with id = " + answerid;
    }


    @RequestMapping("answers/{answerId}")
    @ResponseBody
    public String displayAnswer(@PathVariable Long answerId){
        Answer answer = answerDao.queryAnswerByAnswerId(answerId);
        String displayAnswer = answer.toString();
        return displayAnswer;
    }
}