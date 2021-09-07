package com.nch.bookstore.entity;


import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @Column(name = "description", nullable = false, length = 1000)
    private String description;

    @Column(name = "author", nullable = false, length = 100)
    private String author;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "create_time", nullable = false)
    private LocalDateTime createTime;

    @Column(name = "modified_time", nullable = true)
    private LocalDateTime modifiedTime;

    @Column(name = "create_by", nullable = true)
    private String createBy;

    @Column(name = "modify_by", nullable = true)
    private String modifyBy;
}
