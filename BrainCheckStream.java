import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class BreanCkeckStream{
  public static void main(String[] args) {
	  
	  //Map<Integer, Integer> collect1 = Stream.of(5,3,5,2,5).collect(Collectors.toMap(x->x,x->1));//java.lang.IllegalStateException
	  ------
	  //Map<Integer, Object> collect2 = Stream.of(5,3,5,2,5).collect(Collectors.toMap(x->x,x->null));//java.lang.NullPointerException
	  ------
	  //Map<Integer, Integer> collect3 = Stream.of(5,3,5,2,5).collect(Collectors.toMap(x->x,x->1,(x,y)->nu//{2=1, 3=1, 5=1}
	  ------
	  //Map<Object, Long> collect = Stream.of(5,2).collect(Collectors.groupingBy(x->null,Collectors.counting()));//java.lang.NullPointerException
	  ------
      //long count = Stream.of("Raja",null,"Tara").map(String::length).count();//3
      ------
	  //long count = Stream.of(4,6,2,5,7).peek(System.out::println).filter(x->x%2==0).count();
      ------
	  System.out.println(collect4);
  }
}
