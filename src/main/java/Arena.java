import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;

import java.io.IOException;

public class Arena {

    public static int height, width;
    private static Arena arena;

    private static Screen screen;

    public Arena(int height, int width){
        this.height = height;
        this.width = width;
        Hero hero = new Hero(10,10);
    }

    public static void processKey(KeyStroke key) {
        arena.processKey(key);
    }

    void draw(Screen screen) throws IOException {
        Arena.screen.clear();
        arena.draw(Arena.screen);
        Arena.screen.refresh();
    }

}