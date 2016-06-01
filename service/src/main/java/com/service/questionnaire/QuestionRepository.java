package com.service.questionnaire;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Created by bhujabaa on 3/15/2016.
 */
@RepositoryRestResource
public interface QuestionRepository extends CrudRepository<Question, Long> {

    @RestResource(path = "by-service")
    Collection<Question> findByServiceId(@Param("serviceId") Long serviceId);
}
