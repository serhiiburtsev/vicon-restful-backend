package com.n0976190100.vicomcore.repo.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.AbstractQueue;
import java.util.concurrent.LinkedBlockingQueue;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@Entity
public class Conference {

    public Conference(Long roomId, Integer capacity, Integer scheduleUnits){
        this.participants = new LinkedBlockingQueue<>(capacity);
        this.roomId = roomId;
        this.scheduleUnits = scheduleUnits;
    }

    @Id
    Long id;
    Long roomId;
    Integer scheduleUnits;
    @OneToMany
    AbstractQueue<Participant> participants;

    Boolean isCancelled;

}
