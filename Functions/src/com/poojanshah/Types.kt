package com.poojanshah

interface Time {
    fun setTime(hours : Int, mins: Int = 0, secs: Int = 0)
    fun setTime(time: PoojanTime) = setTime(time.hours)
}

interface EndOfWorld{
    fun setTime(time: PoojanTime){}
}

class PoojanTime {
    var hours: Int = 0
    var minuts: Int = 0
    var seconds: Int = 0
}

class YetiTime : Time, EndOfWorld {

    override  fun setTime(time: PoojanTime){
        super<Time>.setTime(time)
        super<EndOfWorld>.setTime(time)
    }
    override fun setTime(hours: Int, mins: Int, secs: Int) {}

}
