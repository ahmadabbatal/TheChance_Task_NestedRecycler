package com.example.thechance_task_nestedrecycler.linkedList

/*Second way Reversed*/
/* ______________________________ */
/* __________________________________________________________________________ */
fun <T> MyLinkedList<T>.printInReverseM() {
    this.nodeAt(0)?.printInReverse()
}

fun <T> Node<T>.printInReverse() {
    this.next?.printInReverse()
    if (this.next != null) {
        print(" -> ")
    }
    print(this.value.toString())
}

/*Get Middle*/
/* ______________________________ */
/* __________________________________________________________________________ */

fun <T> MyLinkedList<T>.getMiddle(): T? {
    var slow = this.nodeAt(0)
    var fast = this.nodeAt(0)

    while (fast != null) {
        fast = fast.next
        if (fast != null) {
            fast = fast.next
            slow = slow?.next
        }
    }
    return slow?.value
}

/* Third way Reversed */
/* ______________________________ */
/* __________________________________________________________________________ */
fun <T> MyLinkedList<T>.reversedExtension(): MyLinkedList<T> {
    val result = MyLinkedList<T>()
    val head = this.nodeAt(0)
    if (head != null)
        addInReverse(result, head)
    return result
}

private fun <T> addInReverse(list: MyLinkedList<T>, node: Node<T>) {
    val next = node.next
    if (next != null)
        addInReverse(list, next)
    list.append(node.value)
}

/* Merging tow List */
/* ______________________________ */
/* __________________________________________________________________________ */
fun <T : Comparable<T>> MyLinkedList<T>.mergeSorted(
    otherList: MyLinkedList<T>
): MyLinkedList<T> {

    val result = MyLinkedList<T>()
    var left = nodeAt(0)
    var right = otherList.nodeAt(0)

    if (this.isEmpty()) return otherList
    if (otherList.isEmpty()) return this

    while (left != null && right != null){
        if(left.value < right.value)
            left = append(result, left)
        else right = append(result, right)
    }

    while (left != null)
        left = append(result, left)

    while (right != null)
        right = append(result, right)

    return result
}

private fun <T : Comparable<T>> append(
    result: MyLinkedList<T>,
    node: Node<T>
): Node<T>? {
    result.append(node.value)
    return node.next
}

























