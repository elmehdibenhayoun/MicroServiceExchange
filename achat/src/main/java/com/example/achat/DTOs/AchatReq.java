package com.example.achat.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AchatReq {
   
    private String currency;
    private List<Long> productsIds;
}
