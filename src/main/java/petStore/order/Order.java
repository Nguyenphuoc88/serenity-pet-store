package petStore.order;

import petStore.OrderStatus;

public class Order {

    private int id;
    private int petID;
    private int quantity;
    private OrderStatus status;
    private boolean isCompleted;

    public Order(int petID, int quantity) {
        this.petID = petID;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", petID=" + petID +
                ", quantity=" + quantity +
                ", status=" + status +
                ", isCompleted=" + isCompleted +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPetID() {
        return petID;
    }

    public void setPetID(int petID) {
        this.petID = petID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
