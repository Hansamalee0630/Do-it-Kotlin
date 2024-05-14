package com.example.letsdo


object DataObject {
    var listdata = mutableListOf<CardInfo>()

    fun setData(title: String, priority: String) {
        listdata.add(CardInfo(title, priority))
    }

    fun getAllData(): List<CardInfo> {
        return listdata
    }

    fun deleteAll(){
        listdata.clear()
    }

    fun getData(pos:Int): CardInfo {
        return listdata[pos]
    }

    fun deleteData(pos:Int){
        listdata.removeAt(pos)
    }

    fun updateData(pos:Int,title:String,priority:String)
    {
        listdata[pos].title=title
        listdata[pos].priority=priority
    }

    fun addAllData(tasks: List<CardInfo>) {
        listdata.addAll(tasks)
    }

    fun updateTask(task: CardInfo) {
        val index = listdata.indexOfFirst { it == task }
        if (index != -1) {
            listdata[index] = task
        }
    }

}