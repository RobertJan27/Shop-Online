package com.hellokoding.tutorials.service;

import com.hellokoding.tutorials.model.CartItem;
import com.hellokoding.tutorials.model.User;
import com.hellokoding.tutorials.repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CosService {

    @Autowired
    private CartItemRepository cartRepo;

    public List<CartItem> listCartItems(User user){
        return cartRepo.findAll();
    }

}
