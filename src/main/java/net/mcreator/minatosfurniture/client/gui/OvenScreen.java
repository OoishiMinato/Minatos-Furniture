package net.mcreator.minatosfurniture.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.minatosfurniture.world.inventory.OvenMenu;
import net.mcreator.minatosfurniture.procedures.OvenGUIProProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class OvenScreen extends AbstractContainerScreen<OvenMenu> {
	private final static HashMap<String, Object> guistate = OvenMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public OvenScreen(OvenMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("minato_furniture:textures/screens/oven.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("minato_furniture:textures/screens/aaa.png"), this.leftPos + 78, this.topPos + 25, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("minato_furniture:textures/screens/fuel.png"), this.leftPos + 78, this.topPos + 61, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("minato_furniture:textures/screens/cooked_beef.png"), this.leftPos + 114, this.topPos + 52, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("minato_furniture:textures/screens/beef.png"), this.leftPos + 42, this.topPos + 52, 0, 0, 16, 16, 16, 16);

		if (OvenGUIProProcedure.execute(world, entity)) {
			guiGraphics.blit(new ResourceLocation("minato_furniture:textures/screens/gui_fire.png"), this.leftPos + 78, this.topPos + 61, 0, 0, 16, 16, 16, 16);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.minato_furniture.oven.label_high_heat_oven"), 51, 7, -16777216, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
