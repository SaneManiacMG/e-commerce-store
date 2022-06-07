package com.smworks.ecommerce.dao;

import com.smworks.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryPrepository extends JpaRepository<ProductCategory, Long> {
}
