package com.n0976190100.vicomcore.repo.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Participant {

    @Id
    Long id;

    Long userId;

}
