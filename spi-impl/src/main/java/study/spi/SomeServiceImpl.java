package study.spi;

public class SomeServiceImpl implements SomeService {

    @Override
    public void someMethod() {
        System.out.println("Hello, SPI");
    }
}
