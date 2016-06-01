package com.service.questionnaire;

import com.service.common.AbstractEntity;
import com.service.service.Service;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import java.util.List;
import java.util.Set;

/**
 * Created by bhujabaa on 3/15/2016.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Question extends AbstractEntity {

    private String name;

    // Cascade type of merge is added because we dont want to create new service when we create a question
    // http://stackoverflow.com/questions/13835980/is-there-a-way-to-pass-detached-object-to-jpa-persist-detached-entity-passed-t
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinTable(name = "service_question",
            joinColumns = { @JoinColumn(name = "question_id") },
            inverseJoinColumns = { @JoinColumn(name = "service_id") })
    private Service service;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "question_option",
            joinColumns = { @JoinColumn(name = "question_id") },
            inverseJoinColumns = { @JoinColumn(name = "option_id") })
    private List<Option> options;
    private String questionType;
}
