package petStore.pet;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import petStore.category.Category;

@RestController
@Api("")
public class PetController {

    private final Category category;


    public PetController(Category category){
        this.category = category;
    }
}
