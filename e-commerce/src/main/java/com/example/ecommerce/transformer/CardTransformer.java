package com.example.ecommerce.transformer;

import com.example.ecommerce.dto.RequestDto.CardRequestDto;
import com.example.ecommerce.model.Card;

import java.sql.Date;

public class CardTransformer {

    public static Card CardRequestDtoToCard(CardRequestDto cardRequestDto){

        return Card.builder()
                .cardNo(cardRequestDto.getCardNo())
                .cardType(cardRequestDto.getCardType())
                .cvv(cardRequestDto.getCvv())
                .expiryDate((Date) cardRequestDto.getExpiryDate())
                .build();
    }
}