package tacos.data;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
    Iterable<Ingredient> findAll();
    Iterable<Ingredient> findAllByName(String name);
    Ingredient save(Ingredient ingredient);
}
