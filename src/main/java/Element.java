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


    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Position p = (Position) o;
        return position.getX() == p.getX() && position.getY() == p.getY();
    }



}
