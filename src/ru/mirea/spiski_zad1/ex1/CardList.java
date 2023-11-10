package ru.mirea.spiski_zad1.ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class CardList {
    private List<CardNode> nodeList;

    public CardList() {
        this.nodeList = new ArrayList<>();
    }

    public void createEmptyList() {
        this.nodeList.clear();
    }

    public void addNode(CardNode node) {
        this.nodeList.add(node);
    }

    public void removeNode(CardNode node) {
        this.nodeList.remove(node);
    }

    public void displayNode(CardNode node) {
        node.displayAttributes();
    }

    public void clearList() {
        this.nodeList.clear();
    }

    public boolean isEmpty() {
        return this.nodeList.isEmpty();
    }

    public CardNode getNode(int index) {
        return this.nodeList.get(index);
    }

    public int size() {
        return this.nodeList.size();
    }
}
