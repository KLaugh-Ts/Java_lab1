public class TList <T> {
    /**
     * Класс, описывающий связный список
     * @author KlaughTs Кретова Ксения ПММ 3 курс 3 группа
     * @see Item
     */

    private Item head; /** Голова списка */
    private static int size; /** Размер списка */

    /** Конструктор */
    public TList() {
        head = null;
        size = 0;
    }

    /**
     * Проверка на пустоту
     * @return true если список пуст, false - если не пуст
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**--------------------------------------------------------------*/

    /**
     * Получение размера списка
     * @return размер списка
     */
    public int getSize() {
        return size;
    }
    /**
     * Получение элемента списка
     * @param n номер элемента
     * @return элемент
     */
    public Item getElem(int n) {
        if (n < 1 || n > size) {
            System.out.println("Error");
            return null;
        }
        else if (n == 1) {
            System.out.println("head.getValue()");
            return head;
        }
        else {
            Item p = new Item();
            p = findPosition(n); /***/
            System.out.println("p.getValue()");
            return p;
        }
    }

    /**--------------------------------------------------------------*/

    /** Поиск нужной позиции
     * @param index номер позиции
     * @return объект с этой позиции
     */
    private Item findPosition(int index) {
        Item p = new Item();
        p = head;
        for (int i=0; i<index-2; i++)
            p = p.getNext();
        return p;
    }

    /**--------------------------------------------------------------*/

    /**
     * Добавление элемента в голову списка
     * @param value значение, которое нужно добавить в список
     */
    public void addToHead(T value) {
        Item p = new Item();
        p.setData(value);
        p.setNext(head);
        head = p;
        size++;
    }
    /**
     * Добавление элемента в хвост списка
     * @param value значение, которое нужно добавить в список
     */
    public void addToTail(T value) {
        if (size == 0) addToHead(value);
        else
            addByIndex(value, size + 1);
    }
    /** Добавление элемента в указанное место
     * @param value значение, которое нужно добавить в список
     * @param index номер позиции, на которую нужно добавить элемент
     */
    public void addByIndex(T value, int index) {
        Item p = new Item();
        Item q = new Item();
        p.setData(value);
        q = findPosition(size + 1);
        p.setNext(q.getNext());
        q.setNext(p);
        size++;
    }

    /**--------------------------------------------------------------*/

    /** Удаление элемента из головы списка */
    public void deleteFromHead() {
        Item p = new Item();
        p = head;
        head = head.getNext();
        p = null;
        size--;
    }
    /** Удаление элемента последнего элемента списка */
    public void deleteFromTail() {
        if (size == 1) deleteFromHead();
        else
            deleteByIndex(size);
    }
    /** Удаление элемента по номеру
     * @param index номер позиции удаяемого элемента
     */
    public void deleteByIndex(int index) {
        Item p = new Item();
        Item q = new Item();
        q = findPosition(index);
        p = q.getNext().getNext();
        q.setNext(p);
        p = null;
        q = null;
        size--;
    }

}
