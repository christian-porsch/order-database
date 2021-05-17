package orderdatabase.repository;

import orderdatabase.model.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;



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

    @Test
    @DisplayName("Method should return the ID of a product which was passed before")

    public void getProductByIDTest(){

        // Given

        ProductDatabase testProductDatabase = new ProductDatabase(List.of(
                new Product("1", "MacBook Pro"),
                new Product("2", "Lenovo IdeaPad"),
                new Product("3", "Logitech G502 Hero")
        ));

        // When

        Optional<Product> actualProduct = testProductDatabase.getProductByID("2");

        // Then

        assertThat(actualProduct.isPresent(), is(true));
        assertThat(actualProduct.get(), is(new Product("2", "Lenovo IdeaPad")));

    }

    @Test
    @DisplayName("Method should return an empty optional for an non existing ID")

    public void getProductByIDEmptyOptionalTest(){

        // Given

        ProductDatabase testProductDatabase = new ProductDatabase(List.of(
                new Product("1", "MacBook Pro"),
                new Product("2", "Lenovo IdeaPad"),
                new Product("3", "Logitech G502 Hero")
        ));

        // When

        Optional<Product> actualProduct = testProductDatabase.getProductByID("10");

        // Then

        assertThat(actualProduct.isEmpty(), is(true));


    }

}