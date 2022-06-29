package nutritious.prog.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import nutritious.prog.demo.model.enums.Position;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Player {
    private String name;
    private int number;
    private Position position;
    private Boolean injured;

    public Player(String name, int number, Position position) {
        this.name = name;
        this.number = number;
        this.position = position;
        this.injured = false;
    }

    public void setInjured(Boolean injured) {
        this.injured = injured;
    }

    @Override
    public String toString() {
        return  name +
                ", number=" + number +
                ", position=" + position +
                ", injured=" + injured;
    }
}
