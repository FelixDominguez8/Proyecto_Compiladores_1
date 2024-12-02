package SymbolTable;

import java.util.Objects;

public class Type {

    public enum BasicType {
        INTEGER, CHAR, BOOLEAN, FUNCTION, PROCEDURE, STRING, ARRAY, CONSTANT
    }

    private BasicType baseType;
    private boolean isArray;
    private int dimensions;

    public Type(BasicType baseType) {
        this.baseType = baseType;
        this.isArray = false;
        this.dimensions = 0;
    }

    public Type(BasicType baseType, int dimensions) {
        if (dimensions < 1 || dimensions > 2) {
            throw new IllegalArgumentException("Solo se permiten arreglos de una o dos dimensiones.");
        }
        this.baseType = baseType;
        this.isArray = true;
        this.dimensions = dimensions;
    }

    public BasicType getBaseType() {
        return baseType;
    }

    public boolean isArray() {
        return isArray;
    }

    public int getDimensions() {
        return dimensions;
    }

    @Override
    public String toString() {
        if (isArray) {
            return String.format("array of %s [%dD]", baseType, dimensions);
        }
        return baseType.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Type type = (Type) o;
        return isArray == type.isArray &&
                dimensions == type.dimensions &&
                baseType == type.baseType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseType, isArray, dimensions);
    }
}