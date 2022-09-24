package org.mineacademy.template;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.mineacademy.fo.plugin.SimplePlugin;

/**
 * PluginTemplate is a simple template you can use every time you make
 * a new plugin. This will save you time because you no longer have to
 * recreate the same skeleton and features each time.
 * <p>
 * It uses Foundation for fast and efficient development process.
 */
public final class PluginTemplate extends SimplePlugin {

	/**
	 * Automatically perform login ONCE when the plugin starts.
	 */
	@Override
	protected void onPluginStart() {
		/*
		  This is the just comment
		  This will print out the message in the console after the plugin is enabled on the server
		  Maybe add version and some other things, you want to owner of the server to
		  know when he loads your plugin everytime he starts the server
		 */
		System.out.println("Knock, Knock");
		System.out.println(1);
		System.out.println("Hello " + (1 + 1) + " Knock, Knock");

	}

	/* ------------------------------------------------------------------------------- */
	/* Events */
	/* ------------------------------------------------------------------------------- */

	/**
	 * An example event that checks if the right clicked entity is a cow, and makes an explosion.
	 * You can write your events to your main class without having to register a listener.
	 *
	 * @param event
	 */
	@EventHandler
	public void onRightClick(PlayerInteractEntityEvent event) {
		if (event.getRightClicked().getType() == EntityType.PIG)
			event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 5);
	}
}
