package com.go.gopirates.sprites.items.powerUps;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.go.gopirates.PirateGame;
import com.go.gopirates.screen.PlayScreen;
import com.go.gopirates.sprites.Pirate;

/**
 * Created by zhanghao on 3/4/16.
 */
public class Shield extends PowerUp {
    public Shield(PlayScreen screen, float x, float y) {
        super(screen, x, y);


        switch (PirateGame.PLAYER_ID) {
            case 0:
                setRegion(new TextureRegion(new Texture("powerup/shield_sophia.png"), 0, 0, 256, 256));
                break;
            case 1:
                setRegion(new TextureRegion(new Texture("powerup/shield_taka.png"), 0, 0, 256, 256));
                break;
            case 2:
                setRegion(new TextureRegion(new Texture("powerup/shield_thomas.png"), 0, 0, 256, 256));
                break;
            case 3:
                setRegion(new TextureRegion(new Texture("powerup/shield_zack.png"), 0, 0, 256, 256));
                break;

        }
        setSize(150 / PirateGame.PPM, 150 / PirateGame.PPM);
        setPosition(x - 75 / PirateGame.PPM, y - 75 / PirateGame.PPM);
    }

    @Override
    public void use() {
        destroy();
        System.out.println("Take shield");
        if (screen.getPirate().powerUpHolding == Pirate.PowerUpHolding.NONE) {
            screen.getPirate().powerUpHolding = Pirate.PowerUpHolding.SHIELD;
            screen.updatePowerUp();
        }
    }
}
