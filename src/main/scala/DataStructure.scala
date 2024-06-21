import scala.collection.mutable.*

object DataStructure{
  def main(args:Array[String]): Unit = {
    var fruite=Array("apple","Mango",1,23,4,2,5,2,5,3)


//var c=fruite.mkString("*")
    //print(c)
      val ar_1=new Array[String](10)
     val arr_2=Array.ofDim[Int](2,2)
    arr_2(0)(0)=234
    arr_2(0)(1)=2
      arr_2(1)(0) =3
        arr_2(1)(1) =121
val flattenArr:Array[Int]=arr_2.flatten
    println(flattenArr.mkString(","))
var cities=new ListBuffer[String]()
cities +="TVM"
    cities +=("VM","cm","M","M")
    cities +="TM"
    cities -="M"
  val se=Set("hi","hello")
    print(se)
//println(cities.toSet[String])
val mutableset=Set(1,2,3,4,5,6,"f")
    mutableset+=(7,8,9,"ok")
    print(mutableset)
    val tuple_1=(0,1,2,3,4,5)
    println(tuple_1._5)
    var A:Map[String,Int]=Map()
    var B=Map("UST1"->"Sandeep","UST2"->"Appu")
    println(B.values)
    println(B.keys)
B.values.foreach(println)
    val mylist=List(2,3,4,5,6,76)
    val iter=mylist.iterator
    var i:Int=0
    while(i<3){
      i=i+1
     println(iter.next())
      lazy val kmn:Int=100
      

    }
  }

}
