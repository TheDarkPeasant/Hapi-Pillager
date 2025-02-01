package net.thedarkpeasant.hapipillager.mixin;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.AbstractIllager;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Pillager.class)
public abstract class PillagerMixin extends AbstractIllager {
    protected PillagerMixin(EntityType<? extends AbstractIllager> p_32105_, Level p_32106_) {
        super(p_32105_, p_32106_);
    }

    @Inject(method = "getArmPose", at = @At("HEAD"), cancellable = true)
    public void getArmPose(CallbackInfoReturnable<IllagerArmPose> cir) {
        if (this.isCelebrating()) {
            cir.setReturnValue(IllagerArmPose.CELEBRATING);
        }
    }
}