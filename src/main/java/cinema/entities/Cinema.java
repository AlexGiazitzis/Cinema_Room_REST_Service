package cinema.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alex Giazitzis
 */
public class Cinema {
    public static final Cinema cinema = new Cinema(9, 9);

    private final int          total_rows;
    private final int          total_columns;
    private final List<Seat>   available_seats;
    private final List<Ticket> tickets_sold;

    public Cinema(final int total_rows, final int total_columns) {
        this.total_rows = total_rows;
        this.total_columns = total_columns;
        this.available_seats = new ArrayList<>();
        for (int i = 0; i < this.total_rows; i++) {
            for (int j = 0; j < this.total_columns; j++) {
                int price = i + 1 <= 4
                            ? 10
                            : 8;
                this.available_seats.add(new Seat(i + 1, j + 1, price));
            }
        }
        this.tickets_sold = new ArrayList<>();
    }

    public int getTotal_rows() {
        return total_rows;
    }

    public int getTotal_columns() {
        return total_columns;
    }

    public List<Seat> getAvailable_seats() {
        return available_seats;
    }

    public List<Ticket> getTickets_sold() {
        return tickets_sold;
    }
}
