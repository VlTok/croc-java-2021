import java.util.Arrays;

public class Dictionary {

    private Record[] records;

    public Dictionary(Record[] records) {
        this.records = records;
    }

    public Dictionary() {
        records = new Record[]{};
    }

    /**
     * Добавить новую запись.
     *
     * @param record запись
     */
    public void add(Record record)  {
        records = Arrays.copyOf(records, records.length + 1);
        records[records.length - 1] = record;
    }

    /**
     * Удаляет запись из справочника.
     *
     * @param record удаляемая запись
     */
    public void remove(Record record) {
        final Record[] newRecords = new Record[records.length - 1];
        int index = 0;
        for (Record currentRecord : records) {
            if (currentRecord != record) {
                newRecords[index++] = currentRecord;
            }
        }
        records = newRecords;
    }

    /**
     * Возвращает все записи.
     *
     * @return список записей
     */
    public Record[] records() {
        return Arrays.copyOf(records, records.length);
    }

    public Record[] getRecords() {
        return records;
    }

    public void setRecords(Record[] records) {
        this.records = records;
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "records=" + Arrays.toString(records) +
                '}';
    }
}
