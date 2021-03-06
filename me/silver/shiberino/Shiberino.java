package me.silver.shiberino;

import org.lwjgl.opengl.Display;

import me.silver.shiberino.command.CommandManager;
import me.silver.shiberino.config.Config;
import me.silver.shiberino.event.EventManager;
import me.silver.shiberino.friend.FriendManager;
import me.silver.shiberino.gui.ClickGui;
import me.silver.shiberino.gui.theme.ThemeManager;
import me.silver.shiberino.module.ModuleManager;
import me.silver.shiberino.wrapper.Invoker;
import me.silver.shiberino.wrapper.Wrapper;
import me.silver.shiberino.xray.XrayManager;

public class Shiberino
{
	private static Shiberino instance;
	private static Config config;
	private static ModuleManager moduleManager;
	private static CommandManager commandManager;
	private static EventManager eventManager;
	private static FriendManager friendManager;
	private static ClickGui clickGui;
	private static ThemeManager themeManager;
	private static Wrapper wrapper;
	private static Invoker invoker;
	private static XrayManager xrayManager;

	private final String name = "Shiberino";
	private final String version = "v0.1";
	private final String author = "Silver#4636";

	public static Shiberino getInstance()
	{
		if (instance == null)
		{
			instance = new Shiberino();
		}

		return instance;
	}

	public static Config getConfig()
	{
		if (config == null)
		{
			config = new Config();
		}

		return config;
	}

	public static ModuleManager getModuleManager()
	{
		if (moduleManager == null)
		{
			moduleManager = new ModuleManager();
		}

		return moduleManager;
	}

	public static CommandManager getCommandManager()
	{
		if (commandManager == null)
		{
			commandManager = new CommandManager();
		}

		return commandManager;
	}

	public static EventManager getEventManager()
	{
		if (eventManager == null)
		{
			eventManager = new EventManager();
		}

		return eventManager;
	}

	public static FriendManager getFriendManager()
	{
		if (friendManager == null)
		{
			friendManager = new FriendManager();
		}

		return friendManager;
	}

	public static ClickGui getClickGui()
	{
		if (clickGui == null)
		{
			clickGui = new ClickGui();
		}

		return clickGui;
	}

	public static ThemeManager getThemeManager()
	{
		if (themeManager == null)
		{
			themeManager = new ThemeManager();
		}

		return themeManager;
	}

	public static Wrapper getWrapper()
	{
		if (wrapper == null)
		{
			wrapper = new Wrapper();
		}

		return wrapper;
	}

	public static Invoker getInvoker()
	{
		if (invoker == null)
		{
			invoker = new Invoker();
		}

		return invoker;
	}

	public static XrayManager getXrayManager()
	{
		if (xrayManager == null)
		{
			xrayManager = new XrayManager();
		}

		return xrayManager;
	}

	public String getName()
	{
		return name;
	}

	public String getVersion()
	{
		return version;
	}

	public String getAuthor()
	{
		return author;
	}

	public void start()
	{
		Display.setTitle(name + " Version " + version);

		getModuleManager().instantiateModules();
		getCommandManager().instantiateCommands();
		getThemeManager().initializeThemes();
	}
}
