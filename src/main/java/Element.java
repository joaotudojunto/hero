import com.googlecode.lanterna.graphics.TextGraphics;

public abstract class Element {


    private Position position;

    //construtor
    public Element(int x, int y){
        position = new Position(x,y);
    }
    //getters
    public Position getPosition() {
        return position;
    }
    // setters
    public void setPosition(Position position) {
        this.position = position;
    }

    public abstract void draw(TextGraphics screen);

}
