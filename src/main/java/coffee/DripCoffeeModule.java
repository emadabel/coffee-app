package coffee;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module(includes = PumpModule.class)
class DripCoffeeModule {

    @Singleton
    @Provides
    Heater provideHeater() {
        return new ElectricHeater();
    }
}
