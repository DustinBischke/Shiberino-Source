package me.silver.shiberino.module.modules;

import org.lwjgl.input.Keyboard;

import me.silver.shiberino.Shiberino;
import me.silver.shiberino.event.events.EventOnUpdate;
import me.silver.shiberino.module.Module;

public class Flight extends Module
{
	private float flightSpeed = 0.5F;

	public Flight()
	{
		super("Flight", "Makes You Fly", Keyboard.KEY_F);
	}

	@Override
	public void onEnable()
	{
		Shiberino.getInstance().getEventManager().register(this);
	}

	@Override
	public void onDisable()
	{
		Shiberino.getInstance().getEventManager().unregister(this);
	}

	@Override
	public void onUpdate(EventOnUpdate event)
	{
		invoker.setMotionY(0.0F);

		if (Keyboard.isKeyDown(invoker.getJumpKeyCode()))
		{
			invoker.setMotionY(flightSpeed);
		}
		else if (Keyboard.isKeyDown(invoker.getSneakKeyCode()))
		{
			invoker.setMotionY(-flightSpeed);
		}
	}
}
