import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Penguin player = new Penguin();
        addObject(player, 100, 100);
        
        Bomb one = new Bomb();
        addObject(one, 500, 100);
    }
}
