package com.service.service;

import com.service.common.AbstractEntity;
import com.service.questionnaire.Option;
import com.service.questionnaire.Question;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Created by bhujabaa on 3/15/2016.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Service extends AbstractEntity {

    private String name;
}
