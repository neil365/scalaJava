package cn.neil.scala

class TestScala(x:Int) {
   println("this is constructor"+x)//除了def定义的成员函数之外的所有操作，都可以看作是构造函数的行为组成部分
  def clamathid(){
    println("ssssssssss")
  }
  def this(x:Int ,y:Int){ //辅助构造函数名必须是this
    this(x)
     println( x,y)
  }
 
  
}

 object Test1 {
    
    def main(args: Array[String]){
    val t = new TestScala(1,2); 
      t.clamathid()
    }
    
    
}