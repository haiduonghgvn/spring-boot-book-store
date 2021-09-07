package com.nch.bookstore.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "purchase_history")
public class PurchaseHistoty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "use_id",nullable = false)
    private long userId;

    @Column(name = "book_id",nullable = false)
    private long bookId;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "purchase_time" , nullable = false)
    private LocalDateTime purchaseTime;
}
