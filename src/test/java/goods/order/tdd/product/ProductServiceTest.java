package goods.order.tdd.product;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductServiceTest {

    @Autowired
    private ProductService productService;

//    private ProductPort productPort;
//    private ProductRepository repository;

//    @BeforeEach
//    void setUp() {
//        repository = new ProductRepository();
//        productPort = new ProductAdapter(repository);
//        productService = new ProductService(productPort);
//    }
    @Test
    void 상품등록() {
        final AddProductRequest request = 상품등록요청_생성();
        // productService.addProduct(request);

        // API 요청

    }

    private static AddProductRequest 상품등록요청_생성() {
        final String name = "상품명";
        final int price = 1000;
        DiscountPolicy discountPolicy = DiscountPolicy.NONE;
        return new AddProductRequest(name, price, discountPolicy);
    }
}
