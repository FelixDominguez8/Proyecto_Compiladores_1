package SymbolTable;

import java.util.Arrays;

public class ArraySymbol extends Symbol {
    private int[] lowerBounds;
    private int[] upperBounds;
    private int dimensions;

    public ArraySymbol(String identifier, Type elementType, int[] lowerBounds, int[] upperBounds) {
        super(identifier, elementType);
        if (lowerBounds.length > 2 || upperBounds.length > 2) {
            throw new IllegalArgumentException("Solo se permiten arreglos de hasta dos dimensiones.");
        }
        if (lowerBounds.length != upperBounds.length) {
            throw new IllegalArgumentException("Los límites inferiores y superiores deben coincidir en número.");
        }
        this.dimensions = lowerBounds.length;
        this.lowerBounds = lowerBounds;
        this.upperBounds = upperBounds;
    }

    public int getDimensions() {
        return dimensions;
    }

    public int[] getLowerBounds() {
        return lowerBounds;
    }

    public int[] getUpperBounds() {
        return upperBounds;
    }

    @Override
    public String toString() {
        return String.format(
                "ArraySymbol(identifier: %s, elementType: %s, dimensions: %d, ranges: %s)",
                getIdentifier(),
                getType(),
                dimensions,
                getRangesAsString()
        );
    }

    private String getRangesAsString() {
        StringBuilder ranges = new StringBuilder();
        for (int i = 0; i < dimensions; i++) {
            ranges.append(String.format("[%d..%d]", lowerBounds[i], upperBounds[i]));
        }
        return ranges.toString();
    }
}

