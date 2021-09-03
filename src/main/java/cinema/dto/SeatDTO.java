package cinema.dto;

/**
 * @author Alex Giazitzis
 */
public class SeatDTO {
    private int row;
    private int column;
    private int price;

    public SeatDTO() {

    }

    public SeatDTO(final int row, final int column, final int price) {
        this.row = row;
        this.column = column;
        this.price = price;
    }

    public int getRow() {
        return row;
    }

    public void setRow(final int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(final int column) {
        this.column = column;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(final int price) {
        this.price = price;
    }
}
