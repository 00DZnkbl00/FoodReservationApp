package pl.dawidzjava.foodReservationApp.entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity(name = "meal_order")
public class MealOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "order_date")
    private Date orderDate;

    @Column
    private boolean received;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "student_id",nullable = false)
    private Student student;

    public MealOrder() {
    }

    public MealOrder(Date orderDate, boolean received, Student student) {
        this.orderDate = orderDate;
        this.received = received;
        this.student = student;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public boolean isReceived() {
        return received;
    }

    public void setReceived(boolean received) {
        this.received = received;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                ", received=" + received +
                ", student=" + student +
                '}';
    }
}
