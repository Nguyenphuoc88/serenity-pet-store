package petStore.pet;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonCreator;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonProperty;
import petStore.OrderStatus;
import petStore.category.Category;

public class Pet {

    private int id;
    private Category category;
    private String name;
    private String photoURL;
    private OrderStatus orderStatus;

    @JsonCreator
    public Pet(@JsonProperty("nane")String name,@JsonProperty("photoURL") String photoURL) {
        this.name = name;
        this.photoURL = photoURL;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", orderStatus=" + orderStatus +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public interface AndPetName{AndPetName andPetName(String petName);}
    public interface AndPhotoURLs{AndPhotoURLs andPhotoURL(String photoURL);}

    public static class PetBuilder implements AndPetName, AndPhotoURLs{

        private String petName;
        private String photoURL;

        @Override
        public AndPetName andPetName(String petName) {
            this.petName = petName;
            return this;
        }

        @Override
        public AndPhotoURLs andPhotoURL(String photoURL) {
            this.photoURL = photoURL;
            return this;
        }



    }
}


