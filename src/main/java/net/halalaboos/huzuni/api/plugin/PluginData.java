package net.halalaboos.huzuni.api.plugin;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import net.halalaboos.huzuni.Huzuni;
import net.halalaboos.huzuni.api.node.Node;
import net.halalaboos.huzuni.api.node.impl.StringNode;
import net.halalaboos.mcwrapper.api.MCWrapper;
import org.apache.logging.log4j.Level;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * The plugin information that is loaded from within the plugin jar file. <br/>
 * This information is kept separate from the actual Plugin class for the ability to read plugin information without actually loading the plugin jar.
 * */
public class PluginData extends Node {
				
	private final StringNode name = new StringNode("Name", "", "");
	
	private final StringNode description = new StringNode("Description", "None", "");
	
	private final StringNode author = new StringNode("Author", "N/A", "");
	
	private final StringNode version = new StringNode("Version", "1.0", "");

	private final StringNode mcVersion = new StringNode("Minecraft-Version", "", "");

	private final StringNode classPath = new StringNode("Class-Path", "", "");
		
	private final File saveFolder;
	
	private final File saveFile;

	public PluginData(Reader reader, File pluginFolder) throws IOException {
		super("", "");
		try {
			Gson gson = new GsonBuilder().create();
			Type type = new TypeToken<ArrayList<JsonObject>>() {}.getType();
			List<JsonObject> list = gson.fromJson(reader, type);
			for (JsonObject object : list) {
				if (name.hasNode(object))
					name.load(object);
				if (description.hasNode(object))
					description.load(object);
				if (author.hasNode(object))
					author.load(object);
				if (classPath.hasNode(object))
					classPath.load(object);
				if (version.hasNode(object))
					version.load(object);
				if (mcVersion.hasNode(object))
					mcVersion.load(object);
			}
		} catch (Exception e) {
			Huzuni.LOGGER.log(Level.FATAL, "Unable to parse plugin data: " + e.getMessage());
		} finally {
			if (reader != null)
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		if (hasLoaded()) {
			this.saveFolder = new File(pluginFolder, name.getText());
			if (!saveFolder.exists())
				saveFolder.mkdirs();
			this.saveFile = new File(saveFolder, "default.json");
			if (!saveFile.exists())
				saveFile.createNewFile();
		} else {
			saveFolder = null;
			saveFile = null;
		}
	}

	/**
	 * @return True if the necessary components required to run this plugin are available.
	 * */
	public boolean hasLoaded() {
		return name.hasText() && description.hasText() && author.hasText() && classPath.hasText() && version.hasText() && mcVersion.hasText();
	}

	/**
	 * @return True if the Minecraft version of this plugin is for this client's version of Minecraft.
	 * */
	public boolean isCurrentVersion() {
		return mcVersion.getText().equals(MCWrapper.getMinecraftVersion());
	}
	
	@Override
	public String getName() {
		return name.getText();
	}
	
	@Override
	public String getDescription() {
		return description.getText();
	}

	public String getAuthor() {
		return author.getText();
	}

	public String getClassPath() {
		return classPath.getText();
	}

	public String getVersion() {
		return version.getText();
	}

	public String getMinecraftVersion() {
		return mcVersion.getText();
	}

	public File getSaveFolder() {
		return saveFolder;
	}

	public File getSaveFile() {
		return saveFile;
	}
	
	@Override
	public boolean hasNode(JsonObject json) {
		return json.get("Type") != null && json.get("Type").equals("PluginData");
	}
	
	@Override
	public void save(JsonObject json) throws IOException {
		json.addProperty("Type", "PluginData");
		super.save(json);
	}

	@Override
	public void load(JsonObject json) throws IOException {
		if (hasNode(json)) {
			super.load(json);
		}
	}
	
}
