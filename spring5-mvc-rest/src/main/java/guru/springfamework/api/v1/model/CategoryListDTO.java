package guru.springfamework.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

public class CategoryListDTO {

    @Data
    @AllArgsConstructor
    public static class CatorgoryListDTO {

        List<CategoryDTO> categories;

    }
}
