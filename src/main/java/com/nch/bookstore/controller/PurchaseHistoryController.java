package com.nch.bookstore.controller;


import com.nch.bookstore.entity.PurchaseHistoty;
import com.nch.bookstore.security.UserPrincipal;
import com.nch.bookstore.service.implementation.IPurchaseHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/purchase-history")  //pre-path
public class PurchaseHistoryController
{
    @Autowired
    public IPurchaseHistoryService purchaseHistoryService;

    @PostMapping
    public ResponseEntity<?> savePurchaseHistory(@RequestBody PurchaseHistoty purchaseHistoty)
    {
        return new ResponseEntity<>(purchaseHistoryService.savePurchaseHistory(purchaseHistoty), HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<?> getAllPurchaseHistory(@AuthenticationPrincipal UserPrincipal userPrincipal)
    {
        return ResponseEntity.ok(purchaseHistoryService.findAllPurchaseItems(userPrincipal.getId()));
    }

}



