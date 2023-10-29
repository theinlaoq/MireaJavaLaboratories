package ru.mirea.lab6.ex10;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Computer> computers = new ArrayList<>();

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    public Computer findComputer(Brand brand, Processor processor, Memory memory, Monitor monitor) {
        for (Computer computer : computers) {
            if (computer.getBrand() == brand &&
                    computer.getProcessor().getModel().equals(processor.getModel()) &&
                    computer.getMemory().getSize() == memory.getSize() &&
                    computer.getMonitor().getType().equals(monitor.getType())) {
                return computer;
            }
        }
        return null;
    }
}
