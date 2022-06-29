package nutritious.prog.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import nutritious.prog.demo.model.enums.Position;

@NoArgsConstructor
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
}
