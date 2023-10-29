package ru.mirea.lab6.ex10;

import java.util.Scanner;

interface Input {
    Scanner scanner = new Scanner(System.in);
}

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить компьютер");
            System.out.println("2. Удалить компьютер");
            System.out.println("3. Найти компьютер");
            System.out.println("4. Выход");
            int choice = Input.scanner.nextInt();

            switch (choice) {
                case 1:
                    // Ввод данных для создания компьютера
                    System.out.println("Введите марку компьютера (DELL, HP, ASUS, LENOVO):");
                    Brand brand = Brand.valueOf(Input.scanner.next());
                    System.out.println("Введите модель процессора:");
                    String processorModel = Input.scanner.next();
                    System.out.println("Введите объем памяти (в ГБ):");
                    int memorySize = Input.scanner.nextInt();
                    System.out.println("Введите тип монитора:");
                    String monitorType = Input.scanner.next();

                    // Создание компьютера и добавление его в магазин
                    Processor processor = new Processor(processorModel);
                    Memory memory = new Memory(memorySize);
                    Monitor monitor = new Monitor(monitorType);
                    Computer computer = new Computer(brand, processor, memory, monitor);
                    shop.addComputer(computer);
                    System.out.println("Компьютер добавлен в магазин.");
                    break;
                case 2:
                    // Удаление компьютера
                    System.out.println("Введите марку компьютера для удаления:");
                    Brand brandToDelete = Brand.valueOf(Input.scanner.next());
                    System.out.println("Введите модель процессора для удаления:");
                    String processorModelToDelete = Input.scanner.next();
                    System.out.println("Введите объем памяти (в ГБ) для удаления:");
                    int memorySizeToDelete = Input.scanner.nextInt();
                    System.out.println("Введите тип монитора для удаления:");
                    String monitorTypeToDelete = Input.scanner.next();

                    // Поиск компьютера и удаление его из магазина
                    Processor processorToDelete = new Processor(processorModelToDelete);
                    Memory memoryToDelete = new Memory(memorySizeToDelete);
                    Monitor monitorToDelete = new Monitor(monitorTypeToDelete);
                    Computer computerToDelete = shop.findComputer(brandToDelete, processorToDelete, memoryToDelete, monitorToDelete);
                    if (computerToDelete != null) {
                        shop.removeComputer(computerToDelete);
                        System.out.println("Компьютер удален из магазина.");
                    } else {
                        System.out.println("Компьютер не найден в магазине.");
                    }
                    break;
                case 3:
                    // Поиск компьютера
                    System.out.println("Введите марку компьютера для поиска:");
                    Brand brandToFind = Brand.valueOf(Input.scanner.next());
                    System.out.println("Введите модель процессора для поиска:");
                    String processorModelToFind = Input.scanner.next();
                    System.out.println("Введите объем памяти (в ГБ) для поиска:");
                    int memorySizeToFind = Input.scanner.nextInt();
                    System.out.println("Введите тип монитора для поиска:");
                    String monitorTypeToFind = Input.scanner.next();

                    // Поиск компьютера и вывод информации
                    Processor processorToFind = new Processor(processorModelToFind);
                    Memory memoryToFind = new Memory(memorySizeToFind);
                    Monitor monitorToFind = new Monitor(monitorTypeToFind);
                    Computer foundComputer = shop.findComputer(brandToFind, processorToFind, memoryToFind, monitorToFind);
                    if (foundComputer != null) {
                        System.out.println("Найден компьютер:");
                        System.out.println("Марка: " + foundComputer.getBrand());
                        System.out.println("Процессор: " + foundComputer.getProcessor().getModel());
                        System.out.println("Память: " + foundComputer.getMemory().getSize() + " ГБ");
                        System.out.println("Монитор: " + foundComputer.getMonitor().getType());
                    } else {
                        System.out.println("Компьютер не найден в магазине.");
                    }
                    break;
                case 4:
                    System.out.println("Выход из программы.");
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите действие из списка.");
            }
        }
    }
}