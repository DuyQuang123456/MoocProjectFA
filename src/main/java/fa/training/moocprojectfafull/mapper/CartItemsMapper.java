package fa.training.moocprojectfafull.mapper;


import fa.training.moocprojectfafull.dto.CartItemsDTO;
import fa.training.moocprojectfafull.entity.CartItems;
import org.springframework.stereotype.Service;

@Service
public class CartItemsMapper extends AbstractMapper<CartItems, CartItemsDTO> {
    public CartItemsMapper() {
        super(CartItems.class, CartItemsDTO.class);
    }
}
