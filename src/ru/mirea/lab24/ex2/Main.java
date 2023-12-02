package ru.mirea.lab24.ex2;

// Интерфейс для стула
interface Chair {
    void sit();
}

// Викторианский стул
class VictorianChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Сидите на викторианском стуле.");
    }
}

// Многофункциональный стул
class MultifunctionalChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Сидите на многофункциональном стуле.");
    }
}

// Магический стул
class MagicChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Сидите на магическом стуле.");
    }
}

// Интерфейс для абстрактной фабрики
interface ChairFactory {
    Chair createChair();
}

// Конкретная фабрика для Викторианского стула
class VictorianChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}

// Конкретная фабрика для Многофункционального стула
class MultifunctionalChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new MultifunctionalChair();
    }
}

// Конкретная фабрика для Магического стула
class MagicChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new MagicChair();
    }
}

// Клиент, использующий интерфейс стула в своем методе Sit
class Client {
    public void sit(Chair chair) {
        chair.sit();
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        ChairFactory victorianChairFactory = new VictorianChairFactory();
        Chair victorianChair = victorianChairFactory.createChair();

        ChairFactory multifunctionalChairFactory = new MultifunctionalChairFactory();
        Chair multifunctionalChair = multifunctionalChairFactory.createChair();

        ChairFactory magicChairFactory = new MagicChairFactory();
        Chair magicChair = magicChairFactory.createChair();

        Client client = new Client();
        client.sit(victorianChair);
        client.sit(multifunctionalChair);
        client.sit(magicChair);
    }
}

