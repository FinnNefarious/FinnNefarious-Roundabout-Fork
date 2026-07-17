/*
Artists that contributed:
Jester of Roundabout, Blugnib (cheeseballjack)
 */
package net.hydra.jojomod.stand.powers;

import net.hydra.jojomod.client.StandIcons;
import net.hydra.jojomod.event.index.PowerIndex;
import net.hydra.jojomod.event.powers.StandPowers;
import net.hydra.jojomod.stand.powers.presets.NewDashPreset;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;

public class PowersGloryDays extends NewDashPreset {
    public PowersGloryDays(LivingEntity self){super(self);}

    @Override
    public StandPowers generateStandPowers(LivingEntity entity) {return new PowersGloryDays(entity);}

    //defining the stand's most basic attributes, you can find these in StandPowers.java
    @Override
    public boolean isSecondaryStand() {return true;}

    @Override
    public boolean canSummonStandAsEntity() {return false;}

    @Override
    public boolean rendersPlayer() {return true;}

    //makes stand appear as wip, with my name and stuff, also found in StandPowers.Java
    public boolean isWip(){return true;}
    public Component ifWipListDevStatus(){
        return Component.translatable ( "roundabout.dev_status.active").withStyle(ChatFormatting.GOLD);
    }
    public Component ifWipListDev() {return Component.literal("Finn_Nefarious").withStyle(ChatFormatting.WHITE);}

    @Override
    public void renderIcons(GuiGraphics context, int x, int y) {

        //set more icons here later when the art is done

        setSkillIcon(context,x,y,3, StandIcons.DODGE, PowerIndex.GLOBAL_DASH);
        super.renderIcons(context, x, y);
    }

}

