package com.es.core.model.order;

import com.es.core.model.phone.Phone;

public class OrderItem {
    private Phone phone;
    private Long quantity;

    public OrderItem() {

    }

    public OrderItem(Phone phone, Long quantity) {
        this.phone = phone;
        this.quantity = quantity;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "phone=" + phone +
                ", quantity=" + quantity +
                '}';
    }
}
