public interface ListADT<ElementType> {
	
	/**
	 * Adds the specified element to the end of the list.
	 * @param element to be appended to the list
	 * @throws NullPointerException - if element is null
	 */
	public void add(ElementType element);
	
	/**
	 * Returns the element at the specified position in the list.
	 * @param index index of the element to retrieve
	 * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index > size())
	 * @return the element at the specified position in the list
	 */
	public ElementType get(int index);
	
	/**
	 * Returns the number of elements in the list.
	 * @return the length of the list (number of its elements)
	 */
	public int size();
	
	/**
	 * Removes the element at the specified position in the list. Shifts all subsequent element to the left.
	 * @param index index of the element to remove
	 * @return the removed element
	 */
	public ElementType remove(int index);
	
	/**
	 * Removes all the elements from the list.
	 */
	public void clear();
	
}
