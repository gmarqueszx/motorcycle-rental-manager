package space.gmarqueszx.motorcycle_rental.model;

public enum CnhType {
    A,
    B,
    A_B;

    public boolean canRent() {
        return this == A || this == A_B;
    }
}
