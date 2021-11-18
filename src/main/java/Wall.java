import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

public class Wall {

    private Position position;

    //construtor
    public Wall(int x, int y){
        position = new Position(x,y);
    }
/*
    // getters
    public Position getPosition(){
        return position;
    }
    //setters
    public void setPosition(Position position) {
        this.position = position;
    }
*/
    public void draw(TextGraphics graphics) {
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFF66"));
        graphics.enableModifiers(SGR.BOLD);
        graphics.putString(new TerminalPosition(position.getX(), position.getY()), "O");

    }

}


