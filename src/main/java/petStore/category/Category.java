package petStore.category;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonCreator;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonProperty;

public class Category {

    private int id;
    private String categoryName;

    @JsonCreator
    public Category(@JsonProperty("name")String categoryName) {
        this.categoryName = categoryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }

    public interface AndCategoryName{ AndCategoryName andCategoryName(String categoryName);}

    public static class CategoryBuilder implements AndCategoryName{
        private String name;
        public CategoryBuilder(String name){this.name = name;}

        @Override
        public AndCategoryName andCategoryName(String name) {
            this.name = name;
            return this;
        }
    }
}
