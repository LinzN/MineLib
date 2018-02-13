/*
 * Copyright (C) 2018. MineGaming - All Rights Reserved
 *  You may use, distribute and modify this code under the
 * terms of the LGPLv3 license, which unfortunately won't be
 * written for another century.
 *
 *  You should have received a copy of the LGPLv3 license with
 *  this file. If not, please write to: niklas.linz@enigmar.de
 */

package de.linzn.mineLib;

import org.bukkit.plugin.java.JavaPlugin;

public class MineLibPlugin extends JavaPlugin {

    @Override
    public void onDisable() {
        this.getLogger().info("Disable MineLib");
    }

    @Override
    public void onEnable() {
        this.getLogger().info("Enable MineLib");
    }
}
