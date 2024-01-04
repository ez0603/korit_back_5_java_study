package com.study.ch07.register;

public class ProductService {

    boolean isEmptyString(String str) {
        if(str == null) {
            return true;
        }
        return str.isBlank(); // null != 값이 빈것이 아닌 주소값이 빈것 isBlank = 스페이스가 있다면 다 없앤다
    }

    void registerProductService(Product product) {
        ProductRepository productRepository = new ProductRepository();

        System.out.println("서비스 까지 데이터 전달함.");

        productRepository.saveProduct(product);
    }

}
