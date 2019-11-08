package coffee;

import dagger.Binds;
import dagger.Module;

import javax.inject.Inject;

@Module
abstract class PumpModule {
    @Binds
    abstract Pump providePump(Thermosiphon pump);
}
