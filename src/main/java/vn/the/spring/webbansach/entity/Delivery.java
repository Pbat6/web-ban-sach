package vn.the.spring.webbansach.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
@Table(name = "delivery")
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "delivery_id")
    private int deliveryId;

    @Column(name = "delivery_name")
    private String deliveryName;

    @Column(name = "description")
    private String description;

    @Column(name = "delivery_cost")
    private double deliveryCost;

    @OneToMany(mappedBy = "delivery", fetch = FetchType.LAZY, cascade = {
            CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH
    })
    private List<Order> orderList;
}
