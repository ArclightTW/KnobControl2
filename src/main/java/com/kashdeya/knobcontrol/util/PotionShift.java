package com.kashdeya.knobcontrol.util;

import com.kashdeya.knobcontrol.handlers.ClientHandler;

import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class PotionShift {
	
	@SubscribeEvent
	public void onPotionShiftEvent(GuiScreenEvent.PotionShiftEvent event) {
		if (ClientHandler.potionShift){
			event.setCanceled(true);
		}
	}

}
