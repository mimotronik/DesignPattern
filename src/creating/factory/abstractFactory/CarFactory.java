package creating.factory.abstractFactory;

public interface CarFactory {
    Engine createEngine();

    Seat createSeat();

    Tyre createTyre();
}
