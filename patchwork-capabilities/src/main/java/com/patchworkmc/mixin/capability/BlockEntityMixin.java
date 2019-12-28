/*
 * Minecraft Forge, Patchwork Project
 * Copyright (c) 2016-2019, 2019
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation version 2.1
 * of the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package com.patchworkmc.mixin.capability;

import javax.annotation.Nonnull;

import com.patchworkmc.impl.capability.BaseCapabilityProvider;
import com.patchworkmc.impl.capability.CapabilityProviderInterface;
import net.minecraft.block.entity.BlockEntity;
import net.minecraftforge.common.capabilities.CapabilityProvider;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(BlockEntity.class)
public class BlockEntityMixin implements CapabilityProviderInterface {

	private final CapabilityProvider<BlockEntity> provider = new BaseCapabilityProvider<>(BlockEntity.class, (BlockEntity) (Object) this);

	@Nonnull
	@Override
	public CapabilityProvider<BlockEntity> getCapabilityProvider() {
		return provider;
	}
}
