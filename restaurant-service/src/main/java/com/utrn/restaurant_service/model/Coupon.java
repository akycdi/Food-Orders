package com.utrn.restaurant_service.model;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;


@Data
@Document(collection = "coupons")
public class Coupon {

    @Id
    private String id;
    private String code;
    private Double discountPercentage;
    private LocalDate expiryDate;

}