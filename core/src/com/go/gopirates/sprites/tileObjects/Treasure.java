package com.go.gopirates.sprites.tileObjects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.tiled.TiledMapTileSet;
import com.go.gopirates.PirateGame;
import com.go.gopirates.screen.PlayScreen;


/**
 * Created by Amy on 2/3/16.
 */
public class Treasure extends InteractiveTileObject {
    private static TiledMapTileSet tileSet;

    public Treasure(PlayScreen screen, MapObject object) {
        super(screen, object);
        tileSet = map.getTileSets().getTileSet("tileset_gutter");
        fixture.setUserData(this);
        setCategoryFilter(PirateGame.TREASURE_BIT);
    }



    @Override
    public void onHit() {
//        Hud.findTreasure();
        Gdx.app.log("Treasure","Find Treasure");
        getCell().setTile(null);
        setCategoryFilter(PirateGame.NOTHING_BIT);
    }
    public void onHitbyOthers(){
        getCell().setTile(null);
        setCategoryFilter(PirateGame.NOTHING_BIT);
    }

//    public void findTreasure(Pirate pirate){
//        Hud.findTreasure();
//        getCell().setTile(null);
//        setCategoryFilter(PirateGame.NOTHING_BIT);
//    }
}
