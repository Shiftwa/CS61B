class SListNode {
	Run mElement;
	SListNode mNext;
	
	public SListNode(Run element, SListNode next) {
		mElement = element;
		mNext = next;
	}
	
	public SListNode(Run element) {
		mElement = element;
		mNext = null;
	}
	
	public void insertAfter(Run item) {
		mNext = new SListNode(item, mNext);
	}
}