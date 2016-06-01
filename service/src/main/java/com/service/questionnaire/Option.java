package com.service.questionnaire;

import com.service.common.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by bhujabaa on 3/15/2016.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Option extends AbstractEntity {

    private String name;
    private boolean isDefault;
}
