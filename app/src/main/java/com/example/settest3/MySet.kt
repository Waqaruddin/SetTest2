package com.example.settest3

class MySet {
    //data
    private var data = arrayOf<Int?>()
    fun isEmpty(): Boolean {
        return data.isEmpty()
        //return true
    }

    fun add(element: Int): Boolean {

        //check if exits ,if true - don't add and else part add
        //contains method should return true if element already exists
        //


        if (data.contains(element)) {
            return false
        } else {
            //data member variable should add element
            val newData: Array<Int?> = data.copyOf(data.size + 1)
            data = newData
            data[data.size - 1] = element
        }


        //5
        //0 1 2 3 4
        //[4]
        //data.size - 1
        return true
    }

    fun size(): Int {
        return data.size
    }

    fun contains(element: Int): Boolean {
        //if element is present in data,return true
        for (number in data) {
            if (number == element) {
                return true
            }
        }
        return false
    }

    fun remove(element: Int): Boolean {
        //if element present
        //remove it and return true

        if (data.contains(element)) {
            val newData = data.toMutableList()
            newData.remove(element)
            return true
        }

        //if element not present
        //remove should return false
        return false
    }
}
