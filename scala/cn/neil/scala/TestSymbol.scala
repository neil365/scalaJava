package cn.neil.scala

object TestSymbol {
  
  /**
   *  <- 经常在for循环中的使用，被称生成器（generator）
   */
  def symbol1(){    
    val list=List(23,1,3,4,1)    
    for(i <- list if i!=3 ){  // 循环可加条件 打印 不等于3 的数
      println(i)
    }    
  }
  
  
  
  /**
   *  --> 这个符号用于Map(映射)。Map是一种可迭代的键值对（key/value）结构
   */
  def symbol2(){
    var a:Map[String ,String] =Map("haha"->"bbb" ,"123"->"")
      a+=("aa"->"bb")      
      println(a)    
  }
  
  
  
  
  def main(args:Array[String]){
          symbol2()
  }
  
  
}