import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Demo{
  public static void main(String[] args) {
	   //Map<Integer, Integer> collect1 = Stream.of(5,3,5,2,5).collect(Collectors.toMap(x->x,x->1));//java.lang.IllegalStateException
	   //Map<Integer, Object> collect2 = Stream.of(5,3,5,2,5).collect(Collectors.toMap(x->x,x->null));//java.lang.NullPointerException
	   //Map<Integer, Integer> collect3 = Stream.of(5,3,5,2,5).collect(Collectors.toMap(x->x,x->1,(x,y)->null));//{2=1, 3=1, 5=1}
	  Map<Integer, Integer> collect4 = Stream.of(5,3,5,2,5).collect(Collectors.toMap(x->x,x->1,(val1,val2)->val1+val2));//{2=1, 3=1, 5=3}
	  System.out.println(collect4);
  }
}
