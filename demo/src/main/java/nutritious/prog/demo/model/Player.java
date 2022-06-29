package nutritious.prog.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nutritious.prog.demo.model.enums.Position;

import javax.persistence.Id;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Player {
    private String name;
    @Id
    private int number;
    private Position position;
    private Boolean injured;

    public Player(String name, int number, Position position) {
        this.name = name;
        this.number = number;
        this.position = position;
        this.injured = false;
    }

    @Override
    public String toString() {
        return  name +
                ", number=" + number +
                ", position=" + position +
                ", injured=" + injured;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return number == player.number && name.equals(player.name) && position == player.position && injured.equals(player.injured);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number, position, injured);
    }
}
