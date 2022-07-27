package linkedList

import com.example.thechance_task_nestedrecycler.linkedList.MyLinkedList
import com.example.thechance_task_nestedrecycler.linkedList.Node

interface LinkedInProperties<T> {

//    fun isEmpty(): Boolean

    fun push(value:T) : MyLinkedList<T>

    fun append(value :T)

    fun insert(value: T, afterNode: Node<T>): Node<T>

    fun nodeAt(index: Int): Node<T>?

    fun get(index: Int): Any?

    fun pop(): T?

    fun removeLast(): T?

    fun removeLast2(): T?

    fun removeAfter(node: Node<T>): T?

    fun reverse(): Node<T>?
}