package dev.pogodemon.world.entity_data.forgotten_crossroads;

import dev.pogodemon.GameFlags;
import dev.pogodemon.entities.RoomTransition;
import dev.pogodemon.entities.creatures.Shade;
import dev.pogodemon.utils.Handler;
import dev.pogodemon.utils.MapHelper;
import dev.pogodemon.world.EntityData;
import dev.pogodemon.world.World;

public class Cr32 extends EntityData
{
    public static final int RIGHT = 0;
    public static final int LEFT = 1;

    public Cr32(Handler handler)
    {
        super(handler);
    }

    @Override
    public void spawnEntities()
    {
        if (GameFlags.hasShade && GameFlags.shadeRoomID == handler.getWorld().getID())
            handler.getWorld().spawnEntity(new Shade(handler, GameFlags.shadeSpawnX, GameFlags.shadeSpawnY));
        handler.getWorld().spawnEntity(new RoomTransition(handler, 5320, 800, 80, 320, new World(handler, MapHelper.CR31, Cr31.LEFT_2), new Cr31(handler), 1));
        handler.getWorld().spawnEntity(new RoomTransition(handler, 40, 600, 80, 280, new World(handler, MapHelper.CR33, Cr33.RIGHT), new Cr33(handler), 3));
    }
}