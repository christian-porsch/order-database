package orderdatabase.repository;

import orderdatabase.model.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.*;

class ProductDatabaseTest {

    @Test
    @DisplayName("Method should return a list of all products")

    public void listAllProductsTest(){

        // Given

        ProductDatabase testProductDatabase = new ProductDatabase(List.of(
                new Product("1", "MacBook Pro"),
                new Product("2", "Lenovo IdeaPad"),
                new Product("3", "Logitech G502 Hero")
        ));

        // When

        List<Product> actualListOfProducts = testProductDatabase.listAllProducts();

        // Then

        assertThat(actualListOfProducts, hasSize(3));
        assertThat(actualListOfProducts, containsInAnyOrder(
                new Product("1", "MacBook Pro"),
                new Product("2", "Lenovo IdeaPad"),
                new Product("3", "Logitech G502 Hero")));

    }

}