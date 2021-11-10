
// parte 8 ficha

import com.googlecode.lanterna.screen.Screen;

public class Hero {

    private Position position;

    //construtor
    public Hero(int x, int y){
        position.x = x;
        position.y = y;
    }
    // getters
    public int getX(){
        return position.getX();
    }
    public int getY(){
        return position.getY();
    }

    //setters
    public void setX(int x){
        this.getX() = x;
    }

    public void setY(int y){
        this.y = y;
    }


    // funcoes move
    void moveUp(){
        y--;
    }
    void moveDown(){
        y++;
    }
    public void moveLeft(){
        x--;
    }
    public void moveRight(){
        x++;
    }

    public void draw(Screen screen) {

    }
}
