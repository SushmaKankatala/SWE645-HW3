package sushmak.SWE645hw3;

import java.util.List;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class SurveyService {
    @Autowired
    SurveyRepository surveyRepository;
    
    public List<SurveyModel> getAllSurveys() {
        List<SurveyModel> surveys = surveyRepository.findAll();
        return surveys;
    }

    public SurveyModel getSurveyById(int id) {
        return surveyRepository.findById(id);
    }

    public void saveSurvey(SurveyModel survey) {
        try {
            surveyRepository.save(survey);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int deleteSurvey(int id) {
        try {
            return surveyRepository.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}