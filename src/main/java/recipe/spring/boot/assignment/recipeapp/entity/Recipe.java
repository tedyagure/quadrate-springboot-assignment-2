package recipe.spring.boot.assignment.recipeapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "recipe_table")
public class Recipe {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String ingridients;
    private double time;
}
