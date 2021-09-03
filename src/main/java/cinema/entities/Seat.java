package cinema.entities;

import java.util.Objects;

/**
 * @author Alex Giazitzis
 */
public class Seat {

    private final int row;
    private final int column;
    private       int price;

    public Seat(final int row, final int column) {
        this.row = row;
        this.column = column;
    }

    public Seat(final int row, final int column, final int price) {
        this.row = row;
        this.column = column;
        this.price = price;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(final int price) {
        this.price = price;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seat seat = (Seat) o;
        return row == seat.row && column == seat.column;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, column);
    }

}
