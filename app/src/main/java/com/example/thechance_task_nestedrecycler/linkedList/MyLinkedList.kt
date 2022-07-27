package com.example.thechance_task_nestedrecycler.linkedList

import linkedList.LinkedInProperties

class MyLinkedList<T> : MutableCollection<T>,
    Collection<T>,
    LinkedInProperties<T> {

    private var head: Node<T>? = null
    private var tail: Node<T>? = null

    override var size = 0
        private set

    override fun clear() {
        head = null
        tail = null
        size = 0
    }

    override fun addAll(elements: Collection<T>): Boolean {
        for (element in elements)
            append(element)
        return true
    }

    override fun add(element: T): Boolean {
        append(element)
        return true
    }

    override fun isEmpty(): Boolean {
        return size == 0
    }

    override fun push(value: T): MyLinkedList<T> {
        head = Node(value = value, next = head)
        if (tail == null) tail = head
        size++
        return this
    }

    override fun append(value: T) {
        // First Step
        if (isEmpty()) {
            push(value)
            return
        }
        // Second Step
        tail?.next = Node(value)
        // Third Step
        tail = tail?.next
        size++
    }

    override fun insert(value: T, afterNode: Node<T>): Node<T> {
        // if afterNode is the end node
        if (tail == afterNode) {
            append(value)
            return tail!!
        }
        // make new node without
        val newNode = Node(value = value, next = afterNode.next)
        afterNode.next = newNode
        size++
        return newNode
    }

    override fun nodeAt(index: Int): Node<T>? {

        var currentNode = head
        var currentIndex = 0

        while (currentNode != null && currentIndex < index) {
            currentNode = currentNode.next
            currentIndex++
        }
        return currentNode
    }

    override operator fun get(index: Int): T? {
        var h = head
        var counter = 0
        if (index < 0 || index >= this.size) throw java.lang.IndexOutOfBoundsException()
        while (counter != index) {
            h = h!!.next
            counter++
        }
        return h?.value
    }

    override fun pop(): T? {
        if (!isEmpty()) size--
        val result = head?.value
        head = head?.next
        if (isEmpty()) tail = null
        return result
    }

    override fun removeLast(): T? {
        val head = head ?: return null
        if (head.next == null) return pop()
        size--
        var prev = head
        var current = head
        var next = current.next
        while (next != null) {
            prev = current
            current = next
            next = current.next
        }
        prev.next = null
        tail = prev
        return current.value
    }

    // I think it's better but
    override fun removeLast2(): T? {
        var current = head?.next
        var prev = head

        if (current?.next == null) return pop()

        while (current != tail) {
            prev = current
            current = current?.next
        }
        prev?.next = null
        tail = prev
        return current?.value
    }

    override fun removeAfter(node: Node<T>): T? {
        val result = node.next?.value
        if (node.next == tail) {
            tail = node
        }
        if (node.next != null) size--
        node.next = node.next?.next
        return result
    }

    // this let you use easy for loop
    override fun iterator(): MutableIterator<T> {
        return LinkedListIterator(this)
    }

    override fun retainAll(elements: Collection<T>): Boolean {
        var result = false
        val iterator = this.iterator()
        while (iterator.hasNext()) {
            val item = iterator.next()
            if (!elements.contains(item)) {
                iterator.remove()
                result = true
            }
        }
        return result
    }

    override fun removeAll(elements: Collection<T>): Boolean {
        var result = false
        for (item in elements)
            result = remove(item) || result
        return result
    }

    override fun remove(element: T): Boolean {
        val iterator = iterator()
        while (iterator.hasNext()) {
            val item = iterator.next()
            if (item == element) {
                iterator.remove()
                return true
            }
        }
        return false
    }

    // will take O(n^2)
    // I know this is an inefficient method but if the collection
    // requires it you need to provide it
    override fun containsAll(elements: Collection<T>): Boolean {
        for (searched in elements)
            if (!contains(searched)) return false
        return true
    }

    // This will take O(n)
    // and we can use this for because we use iterator
    override fun contains(element: T): Boolean {
        for (item in this)
            if (item == element) return true
        return false
    }

    override fun reverse(): Node<T>? {
        var prev: Node<T>? = null
        var current = head
        var next: Node<T>? = null
        while (current != null) {
            next = current.next
            current.next = prev
            prev = current
            current = next
        }
        return prev
    }

    override fun toString(): String {
        return if (isEmpty())
            "Empty List"
        else head.toString()
    }
}

class LinkedListIterator<T>(
    private val list: MyLinkedList<T>
) : MutableIterator<T> {
    private var index = 0
    private var lastNode: Node<T>? = null

    override fun hasNext(): Boolean {
        return index < list.size
    }

    // to read the value
    override fun next(): T {
        // out of the list
        if (index >= list.size) throw java.lang.IndexOutOfBoundsException()

        lastNode = if (index == 0) list.nodeAt(0)
        else lastNode?.next

        index++
        return lastNode!!.value
    }

    override fun remove() {
        if (index == 1) list.pop()
        else {
            val prevNode = list.nodeAt(index - 2) ?: return

            list.removeAfter(prevNode)
            lastNode = prevNode
        }
        index--
    }
}


// So what Iterator or Iterable do in our code
// first you should know why we put iterator and iterable
// look main class file I'll continue the explanation there