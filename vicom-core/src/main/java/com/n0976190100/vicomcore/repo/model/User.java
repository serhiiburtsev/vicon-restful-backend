package com.n0976190100.vicomcore.repo.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class User {

    @Id
    Long id;

}
