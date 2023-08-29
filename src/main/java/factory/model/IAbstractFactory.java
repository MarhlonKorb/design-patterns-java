package factory.model;

public interface IAbstractFactory<T> {
    T create(Enum enumTipo);
}
