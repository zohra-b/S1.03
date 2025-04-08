package n1.n1ex1.Models;

import java.util.Objects;

public class Month {
    private final String NAME;

    public Month(String NAME) {
        if (NAME == null || NAME.trim().isEmpty()) {
            throw new IllegalArgumentException("Month name cannot be null or empty.");
        }
        this.NAME = NAME;
    }

    public String getName() {
        return this.NAME;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Month month = (Month) obj;
        return Objects.equals(this.NAME, month.NAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NAME);
    }

    @Override
    public String toString() {
        return this.NAME;
    }
}
