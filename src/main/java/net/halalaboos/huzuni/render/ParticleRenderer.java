package net.halalaboos.huzuni.render;

import net.halalaboos.huzuni.api.util.Timer;
import net.halalaboos.huzuni.api.util.gl.GLManager;
import net.halalaboos.huzuni.api.util.gl.RenderUtils;
import net.minecraft.client.gui.Gui;

/**
 * Renders particles
 *
 * @author brudin
 * @version 1.0
 * @since 1/5/14
 */
public class ParticleRenderer extends Gui {

    private int width, height;
    
    private final ParticleEngine particleEngine = new ParticleEngine(false);
    
    private final Timer timer = new Timer();
    
    public ParticleRenderer(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void updateParticles() {
        particleEngine.updateParticles();
    }

	/**
	 * Renders the skybox in the main menu
	 */
	public void renderParticles() {
		GLManager.glColor(0x6F000000);
		RenderUtils.drawRect(0, 0, width, height);
		particleEngine.render();
		if (timer.hasReach(15)) {
			particleEngine.spawnParticles(0, 0, width, height, 55F, 15F);
			timer.reset();
		}
	}
	
	public void updateSize(int width, int height) {
		this.width = width;
		this.height = height;
	}
}
