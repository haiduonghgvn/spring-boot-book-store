package com.nch.bookstore.service;

import com.nch.bookstore.entity.PurchaseHistoty;
import com.nch.bookstore.repository.IPurchaseHistoryRepository;
import com.nch.bookstore.repository.projection.IPurchaseItem;
import com.nch.bookstore.service.implementation.IPurchaseHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseHistoryService implements IPurchaseHistoryService
{
    @Autowired
    IPurchaseHistoryRepository purchaseHistoryRepository;

    @Override
    public PurchaseHistoty savePurchaseHistory(PurchaseHistoty purchaseHistoty){
        purchaseHistoty.setPurchaseTime(LocalDateTime.now());
        return purchaseHistoryRepository.save(purchaseHistoty);
    }

    @Override
    public List<IPurchaseItem> findAllPurchaseItems(long userId)
    {
        return purchaseHistoryRepository.findAllPurchaseOfUser(userId);
    }

}
