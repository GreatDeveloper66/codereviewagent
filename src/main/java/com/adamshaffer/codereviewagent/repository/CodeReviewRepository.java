package com.adamshaffer.codereviewagent.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.adamshaffer.codereviewagent.model.CodeReviewModel;
@Repository
public interface CodeReviewRepository extends JpaRepository<CodeReviewModel, Long> {
    
    // Spring generates: SELECT * FROM code_reviews WHERE file_name = ?
    List<CodeReviewModel> findByFileName(String fileName);
    
    // Spring generates: SELECT * FROM code_reviews WHERE language = ?
    List<CodeReviewModel> findByLanguage(String language);

    
}