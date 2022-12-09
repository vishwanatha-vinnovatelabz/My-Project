package com.online.shopping.responseDto;

import com.online.shopping.entity.ProductCategory;
import com.online.shopping.enums.ProductStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class SubcategoryResponseDto {

    public int id;

    public String subcategoryName;

    private LocalDateTime updatedAt;

    private ProductCategory productCategory;

    ProductStatus status;

}
