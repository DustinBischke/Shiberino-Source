package me.silver.shiberino.module.modules;

import org.lwjgl.input.Keyboard;

import me.silver.shiberino.Shiberino;
import me.silver.shiberino.module.Module;

public class Sneak extends Module
{
	public Sneak()
	{
		super("Sneak", "Makes You Sneak", Keyboard.KEY_Z);
	}

	@Override
	public void onEnable()
	{
		invoker.setSneakKeyPressed(true);
	}

	@Override
	public void onDisable()
	{
		invoker.setSneakKeyPressed(false);
	}
}