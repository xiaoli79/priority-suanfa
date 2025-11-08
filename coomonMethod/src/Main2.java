import java.util.*;



//数据结构中常用方法总结~
public class Main2 {

    public static void main(String[] args) {

//      数组
        int[] arr = new int[10];

//      把数组中所有元素都设置为10；
        Arrays.fill(arr, 10);

//      动态数组
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.remove(0);
        list.add(2);
        list.set(0,1);
        list.contains(2);
        list.isEmpty();

//      进行排序~
        Collections.sort(list);
        Collections.reverse(list);


//      哈希表
        HashMap<String, Integer> map = new HashMap<>();

        map.put("apple",1);

        map.put("apple",map.getOrDefault("apple",0)+1);
        System.out.println(map.get("apple"));
        map.remove("apple");

//      遍历哈洗表
        for(HashMap.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getValue()+":"+entry.getKey());
        }

//      哈希集合

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.remove(2);
        set.size();
//      这个会自动创建一个大小合适的新数组~~
        Integer[] array = set.toArray(new Integer[0]);

//      优先级队列
//      小根堆的形式
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(1);
        pq.offer(2);
        pq.offer(3);
        pq.offer(4);
        pq.peek();
        pq.poll();
//      大根堆的形式 , 使用匿名函数,其实里面是匿名内部类~~
        PriorityQueue<Integer> pq2 = new PriorityQueue<>((a,b)-> b - a);

//      队列只是个接口,内部得需要类来实现~~
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.poll();
        q.peek();

        q.size();
        q.isEmpty();

//      栈
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.peek();
        stack.pop();

//      这个是按顺序遍历~~
        for(Integer integer : stack){
            System.out.println(integer);
        }

    }
}
