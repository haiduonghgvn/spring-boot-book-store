package com.nch.bookstore.service.implementation;

import com.nch.bookstore.entity.PurchaseHistoty;
import com.nch.bookstore.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService {
    PurchaseHistoty savePurchaseHistory(PurchaseHistoty purchaseHistoty);

    List<IPurchaseItem> findAllPurchaseItems(long userId);
}
