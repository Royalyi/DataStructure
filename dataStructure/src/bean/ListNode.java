package bean;

import java.util.ArrayList;

public class ListNode {
	
	   public int val;
	   public ListNode next;	
	   public ListNode(){
		   
	   }
	  public ListNode(int val) {
	        this.val = val;
	    }															//创建构造方法传入value值
	
	public static ListNode CreatListNode(ArrayList<Integer> list){  //利用ArrrayList实现链表的value和指针的指向
		ArrayList<ListNode> ListNodes = new ArrayList<>();
		if(list == null&&list.size() == 0){
			System.out.println(list);
			return null;
			
		}
		for(int i=0;i<list.size();i++){
			ListNode ListNode = new ListNode(0);
			ListNode.val = list.get(i);
			ListNodes.add(ListNode);
		}
		for(int i=0;i<ListNodes.size()-1;i++){
			ListNodes.get(i).next = ListNodes.get(i+1);
		}
		
		return ListNodes.get(0);
	}
	
}
