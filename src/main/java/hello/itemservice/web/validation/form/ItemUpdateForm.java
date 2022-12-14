package hello.itemservice.web.validation.form;

import org.hibernate.validator.constraints.Range;
import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

public class ItemUpdateForm {

    @NotNull
    private Long id;

    @NotBlank
    private String itemName;

    @NotNull
    @Range(min = 1000, max = 1000000)
    private Integer price;

    private Integer quantity;

}
