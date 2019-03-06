

import java.util.ArrayList;

import bean.ListNode;

public class ReverseOutput {
	/*
	 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList
	 * */
	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		 ArrayList<Integer> arr=new ArrayList<>();
		 arr.add(1);
		 arr.add(2);
		 arr.add(3);
		 arr.add(4);
		 arr.add(5);
		 arr.add(6);
		
		 printListFromTailToHead((new ListNode()).CreatListNode(arr));
		
		 

	}
	
	//将链表从尾到头输出
	 public static ArrayList<Integer> printListFromTailToHead(ListNode ListNode) {
		 ArrayList<Integer> list = new ArrayList<>();
		 if(ListNode==null)
			 return list;
		 
		 while(true){
			
			 if(ListNode != null){
				 list.add(ListNode.val);
				 if(ListNode.next != null){
					 
					 ListNode = ListNode.next; //将链表赋值给下一个
				 }else{
					 break;
				 }
				 
			 }else{
				 break;
			 }
		 
		System.out.println(list); 
		}
		//System.out.println("Size="+list.size());
		for(int i=0;i<list.size()/2;i++){
			int temp;
			temp=list.get(i);
			//System.out.println(i+"   "+(list.size()-1-i));
			//list.set(i, list.get(index))
			list.set(i, list.get(list.size()-1-i));
			list.set(list.size()-1-i, temp);
			
			
			
			//list.get(list.size()-i) = list.get(i);
			}
		System.out.println(list);
		return list;
		
	    
		 }

	
}

	