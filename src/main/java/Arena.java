import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;

import java.io.IOException;

public class Arena {
    Hero hero;
    public static int height, width;


    public Arena(int height, int width) {
        hero = new Hero(10, 10);
        this.height = height;
        this.width = width;

    }

    public void processKey(KeyStroke key) {

        if (key.getKeyType() == KeyType.ArrowUp) {
            moveHero(hero.moveUp());
        } else if (key.getKeyType() == KeyType.ArrowDown) {
            moveHero(hero.moveDown());
        } else if (key.getKeyType() == KeyType.ArrowLeft) {
            moveHero(hero.moveLeft());
        } else {
            moveHero(hero.moveRight());
        }

    }

    public void draw(Screen screen) throws IOException {
        screen.clear();
        hero.draw(screen);
        screen.refresh();

    }

    private void moveHero(Position position) {

        if (canHeroMove(position)) {
            hero.setPosition(position);
        }
    }


    public static boolean canHeroMove(Position position) {
        if (position.getX() >= 0 && position.getX() <= width && position.getY() >= 0 && position.getY() <= height) {
            return true;
        } else {
            return false;
        }
    }

}
