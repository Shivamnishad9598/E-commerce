package com.example.ecommerce.dto.RequestDto;


import com.example.ecommerce.Enum.CardType;
import com.example.ecommerce.model.Card;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder


public class CardRequestDto {
    String mobNo;

    String cardNo;

    int cvv;

    Date expiryDate;

    CardType cardType;
}
