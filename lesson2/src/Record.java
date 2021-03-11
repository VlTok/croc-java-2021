
public class Record {
    /** Данные. */
    private final String data;

    /**
     * Создаем запись справочника.
     * @param data данные
     */
    public Record(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    /**
     * Возвращает текстовое представление класса.
     * @return текст
     */
    public String toString() {
        return data;
    }
}