package com.nch.bookstore.repository.projection;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface IPurchaseItem
{
    String getTitle();
    Double getPrice();
    LocalDateTime getPurchaseTime();
}
