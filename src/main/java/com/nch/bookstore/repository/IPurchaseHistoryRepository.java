package com.nch.bookstore.repository;

import com.nch.bookstore.entity.PurchaseHistoty;
import com.nch.bookstore.repository.projection.IPurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IPurchaseHistoryRepository extends JpaRepository<PurchaseHistoty,Long>
{
    @Query("select" +
            " b.title as title , ph.price as price , ph.purchaseTime as purchaseTime" +
            " from PurchaseHistoty ph left join Book b on b.id = ph.bookId " +
            "where ph.userId = :userId")
    List<IPurchaseItem> findAllPurchaseOfUser(@Param("userId") Long userId);
}
