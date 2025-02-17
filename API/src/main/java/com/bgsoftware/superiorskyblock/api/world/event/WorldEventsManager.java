package com.bgsoftware.superiorskyblock.api.world.event;

import org.bukkit.Chunk;

public interface WorldEventsManager {

    /**
     * Handles a new chunk being loaded.
     *
     * @param chunk The chunk that was loaded.
     */
    void loadChunk(Chunk chunk);

    /**
     * Handles a chunk being unloaded.
     *
     * @param chunk The chunk that was unloaded.
     */
    void unloadChunk(Chunk chunk);

}
