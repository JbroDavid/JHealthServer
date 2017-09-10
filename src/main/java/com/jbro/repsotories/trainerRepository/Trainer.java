package com.jbro.repsotories.trainerRepository;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kwangjeong on 2017. 9. 10..
 */
@Entity
@Data
@Table(name = "TRAINER", schema = "RECORDS")
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)@Column(length = 10)
    private Long id;

    @Column(length = 20, nullable=false)
    private String trainer_name;

    @Column(columnDefinition = "DATETIME")
    private Date trainer_birth_dttm;

    @Column(columnDefinition = "DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date trainer_create_dttm;

    @Column(length = 500, nullable=true)
    private String trainer_phone_number;

    @Column(length = 4000, nullable=true)
    private String trainer_position;

    @Column(length = 4000, nullable=true)
    private String trainer_email;

    @Column(length = 4000, nullable=true)
    private String trainer_address;

    @JoinColumn
    @Column(length = 4000, nullable=true)
    private String center_key;

    @Lob
    @Column(nullable = true)
    private byte[] trainer_photo;
}