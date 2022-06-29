package nutritious.prog.demo.model;

import lombok.Getter;
import nutritious.prog.demo.model.enums.Position;

@Getter
public class Goalkeeper extends Player{
    public Goalkeeper(String name, int number) {
        super(name, number, Position.GK, false);
    }
}
