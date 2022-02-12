ArrayList:

- Variable length (dynamic - added and removed after compilation time) data structure.
- Derived from the collections framework.
- Collections :
    - List : ArrayList, LinkedList, etc.
    - Queue : Deque, PriorityQueue, etc.
    - Set : HashSet, LinkedHashSet, etc.

Heirarchy:
- ArrayList (extends) Abstract List (implements) List (extends) Collection (extends) Iterable

Everytime the capacity of the ArrayList gets exceeded, it copies data over to a new array, approx 50% larger than the original one.