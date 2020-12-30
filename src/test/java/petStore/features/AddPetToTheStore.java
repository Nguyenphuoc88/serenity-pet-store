package petStore.features;

import petStore.pet.Pet;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Test;

public class AddPetToTheStore {

    @Test
    public void ableToAddPetToTheStore(){

        Pet pet;

        SerenityRest.restAssuredThat( response -> SerenityRest.given()
                .header("api-key","")
                .contentType("application/json")
                .and()
                .body("")
                .post()
                .then()
                .body(""));

    }

}
