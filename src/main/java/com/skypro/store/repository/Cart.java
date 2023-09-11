package com.skypro.store.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.RequestScope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
@RequestScope
@Repository

public class Cart {
    private List<Long> cartList = new ArrayList<>();

    public void add(Long id) {
        cartList.add(id);
    }
    public List<Long> get() {
        return Collections.unmodifiableList(cartList);
    }

}
