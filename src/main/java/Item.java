public class Item <T> {
    /**
     * Класс, описывающий элемент списка
     * @author KlaughTs Кретова Ксения ПММ 3 курс 3 группа
     * @see TList
     */

    private T data; /** Значение */
    private Item <T> next; /** Ссылка на следующий элемент списка */

    /** Конструктор */
    public Item() {
        this.next = null;
    }

    /** Получение значения
     * @return значение
     */
    public T getData() {
        return data;
    }
    /** Получение ссылки на следующий элемент
     * @return ссылку на следующий элемент
     */
    public Item<T> getNext() {
        return next;
    }

    /** Установка значения
     * @param value значение
     */
    public void setData(T value) {
        this.data = value;
    }
    /** Установка ссылки на следующий элемент
     * @param obj ссылка на следующий элемент
     */
    public void setNext(Item<T> obj) {
        this.next = obj;
    }

}
