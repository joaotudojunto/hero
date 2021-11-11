
// parte 8 ficha
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;



public class Hero {

    private Position position;

    //construtor
    public Hero(int x, int y){
        position = new Position(x,y);
    }

    // getters
    public Position getPosition(){
        return position;
    }
    //setters
    public void setPosition(Position position) {
        this.position = position;
    }

    // funcoes move
    public Position moveUp(){
        return new Position(position.getX(), position.getY() - 1);
    }
    public Position moveDown(){
        return new Position(position.getX(), position.getY() + 1);
    }
    public Position moveLeft(){
        return new Position(position.getX() -1, position.getY());
    }
    public Position moveRight(){
        return new Position(position.getX() +1, position.getY());
    }

    public void draw(Screen screen) {
        screen.setCharacter(this.position.getX(),this.position.getY(), TextCharacter.fromCharacter('X')[0]);
    }



}
