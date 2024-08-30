
# StringBuffer & Enhanced LinkedList Iterator 

## Project Overview

This project is a deep dive into custom string manipulation and iterator enhancements in Java, focusing on optimizing performance and functionality in data structures.

### 🧵 Part 1: ITIStringBuffer

The `ITIStringBuffer` class is a custom implementation aimed at efficiently concatenating strings without the performance drawbacks of Java’s immutable `String` class.

- **Methods**:
  - `append(String s)`: Adds a string to the buffer.
  - `toString()`: Returns the concatenated string of all appended strings.

### 🔄 Part 2: Enhanced LinkedList Iterator

This part enhances the `LinkedList` class by implementing advanced iterator features:

- **`nextIndex()`**: Returns the index of the element that would be returned by the next call to `next()`.
- **`iterator(int nextIndex)`**: Returns an iterator starting at a specified index in the list.
- **`iterator(Iterator<E> other)`**: Returns an iterator starting at the same position as another iterator.

### 🔁 Part 3: Recursive List Processing

In this part, we implement a recursive method `count(E fromElement, E toElement)` in the `SinglyLinkedList` class to count elements between two specific points in the list.

## ⚙️ How It Works

1. **ITIStringBuffer**: Provides an efficient method to handle string concatenation using a singly linked list, significantly outperforming traditional string concatenation in Java.

2. **Iterator Enhancements**: 
   - Enables flexible and efficient traversal of the linked list.
   - Supports iteration starting from a specific index or mirroring another iterator’s position.

3. **Recursive Count Method**: 
   - Uses recursion to count elements between two specified points in the linked list.
   - Optimized to avoid unnecessary traversals.

## 📂 Files Included

- **ITIStringBuffer.java**: Custom string buffer implementation.
- **LinkedList.java**: Enhanced linked list with advanced iterator methods.
- **Iterator.java**: Interface updates for the new iterator methods.
- **SinglyLinkedList.java**: Implementation of the recursive count method.
- **Q1.java**: Test cases for ITIStringBuffer.
- **Q2.java**: Test cases for iterator enhancements.
- **Q3.java**: Test cases for recursive list processing.

## 🚀 Usage

To compile and run the test cases for `ITIStringBuffer` and iterator enhancements:

```bash
javac Q1.java Q2.java Q3.java
java Q1
java Q2
java Q3
```

These commands will compile and run the respective test cases, showcasing the functionality of the custom string buffer and enhanced iterator methods.
