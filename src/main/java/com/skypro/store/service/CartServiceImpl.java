package com.skypro.store.service;

import com.skypro.store.repository.Cart;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CartServiceImpl implements CartService {
    private final Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void add(List<Long> items) {
        items.forEach(cart::add);

    }

    @Override
    public List<Long> get() {
        return cart.get();
    }
}
