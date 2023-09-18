interface MultiSets {
    public boolean add(T item);
    public void remove(T item); // interface method (does not have a body)
    public boolean is_empty(T item);
    public boolean contains(T item);
    public int count(T item);
    public int size();

}