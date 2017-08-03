package com.jbro.repsotories.testRepository;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kwangjeong on 2017. 8. 3..
 */
@Entity
@Data
@Table(name = "TestDB", schema = "RECORDS")
public class TestDB {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)@Column(length = 10)
        private Long id;

        @Column(length = 20, nullable=false)
        private String name;

        @Column(length = 20, nullable=true)
        private String password;

        @Column(length = 500, nullable=true)
        private String title;

        @Column(length = 4000, nullable=true)
        private String content;

        @Column(name = "createDate", columnDefinition = "DATETIME")
        @Temporal(TemporalType.TIMESTAMP)
        private Date createDate;

        @Column(length = 20, nullable=true)
        private int count;

        // Business Logic
        public byte[] binaryToImageByteArray() {

           return null;
        }
}
