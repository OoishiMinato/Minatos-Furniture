package net.mcreator.minatosfurniture.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.minatosfurniture.world.inventory.Refrigerator1GUIMenu;
import net.mcreator.minatosfurniture.network.Refrigerator1GUIButtonMessage;
import net.mcreator.minatosfurniture.MinatoFurnitureMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class Refrigerator1GUIScreen extends AbstractContainerScreen<Refrigerator1GUIMenu> {
	private final static HashMap<String, Object> guistate = Refrigerator1GUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_freeze;

	public Refrigerator1GUIScreen(Refrigerator1GUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("minato_furniture:textures/screens/refrigerator_1_gui.png");

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

		guiGraphics.blit(new ResourceLocation("minato_furniture:textures/screens/vhnjfvnjn.png"), this.leftPos + 35, this.topPos + 16, 0, 0, 31, 31, 31, 31);

		guiGraphics.blit(new ResourceLocation("minato_furniture:textures/screens/aaa.png"), this.leftPos + 87, this.topPos + 34, 0, 0, 16, 16, 16, 16);

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
	}

	@Override
	public void init() {
		super.init();
		button_freeze = Button.builder(Component.translatable("gui.minato_furniture.refrigerator_1_gui.button_freeze"), e -> {
			if (true) {
				MinatoFurnitureMod.PACKET_HANDLER.sendToServer(new Refrigerator1GUIButtonMessage(0, x, y, z));
				Refrigerator1GUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 69, this.topPos + 52, 56, 20).build();
		guistate.put("button:button_freeze", button_freeze);
		this.addRenderableWidget(button_freeze);
	}
}
