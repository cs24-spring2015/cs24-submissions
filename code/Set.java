public class Set {
	public int head; 
    public Set tail;

    public Set(int h, Set t) {
        this.head = h;
        this.tail = t;
    }

    public Set(int h) {
        this.head = h;
        this.tail = null;
    }

    public Set() {
        this.tail = null;
    }

    public int get(int i) {
        if (i == 0) {
            return this.head;
        }
        return this.tail.get(i - 1);
    }

    public int size() {
        if (this.tail == null)
            return 1;
        int personInFrontOfMeSize = this.tail.size();
        return personInFrontOfMeSize + 1;
    }

	public Set intersect(Set s1, Set s2) {
		Set sIntersect = new Set();
		Set s1Temp = s1;
		Set s2Temp = s2;
		while (s1Temp != null) {
			while (s2Temp != null) {
				if (s1Temp.head == s2Temp.head) {
					sIntersect.head = s1Temp.head;
				}
			}
			s2Temp = s2;
		}
		return sIntersect;
	}
}