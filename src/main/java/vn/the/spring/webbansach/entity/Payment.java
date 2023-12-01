package vn.the.spring.webbansach.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private int paymentId;

    @Column(name = "payment_name")
    private String paymentName;

    @Column(name = "description")
    private String description;

    @Column(name = "payment_cost")
    private double paymentCost;

    @OneToMany(mappedBy = "payment", fetch = FetchType.LAZY, cascade = {
            CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH
    })
    private List<Order> orderList;

}
