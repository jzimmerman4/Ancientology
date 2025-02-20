package io.github.darealturtywurty.ancientology.core.util.registry;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

public abstract class DeferredRegisterWrapper<T extends IForgeRegistryEntry<T>> {

    protected final DeferredRegister<T> register;
    private final String modId;

    protected DeferredRegisterWrapper(final IForgeRegistry<T> registry, String modId) {
        this.register = DeferredRegister.create(registry, modId);
        this.modId = modId;
    }

    public String getModID() {
        return modId;
    }

    public DeferredRegister<T> getRegister() {
        return register;
    }

    public void register(final IEventBus modBus) {
        register.register(modBus);
    }

    public void addDatagen(final GatherDataEvent event) {

    }

}
