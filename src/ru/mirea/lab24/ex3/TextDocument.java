package ru.mirea.lab24.ex3;

// Интерфейс документа
interface IDocument {
    void open();
    void save();
}

// Интерфейс фабрики документов
interface ICreateDocument {
    IDocument createNew();
    IDocument createOpen();
}

// Конкретный класс текстового документа
public class TextDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Opening text document");
        // Логика открытия текстового документа
    }

    @Override
    public void save() {
        System.out.println("Saving text document");
        // Логика сохранения текстового документа
    }
}

// Фабрика для создания текстового документа
class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        return new TextDocument();
    }

    @Override
    public IDocument createOpen() {
        return new TextDocument();
    }
}

// Основной класс приложения
class EditorApp {
    private IDocument document;
    private ICreateDocument documentFactory;

    public EditorApp(ICreateDocument documentFactory) {
        this.documentFactory = documentFactory;
    }

    public void createNewDocument() {
        document = documentFactory.createNew();
        document.open();
    }

    public void openDocument() {
        document = documentFactory.createOpen();
        document.open();
    }

    public void saveDocument() {
        if (document != null) {
            document.save();
        } else {
            System.out.println("No document to save.");
        }
    }
}

