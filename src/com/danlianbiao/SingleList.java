package com.danlianbiao;

/**
 * @author HHR
 * @date 2020/4/27 17:21
 */
public class SingleList {
  private Node first;
  private int total;

  public class Node {
      Object data;
      Node next;

      Node(Object data,Node next){
          this.data=data;
          this.next=next;

      }
  }
  //添加
  public void add(Object obj){
      Node newNode=new Node(obj,null);
      if(first==null){
          first=newNode;
      }
      else{
          Node node=first;
          while (node.next!=null)
          {
              node=node.next;
          }

          node.next=newNode;
      }

      total++;
  }

  //返回长度
    public int size(){

      return total;
    }
  //删除
    /*第一种删除通过选择删除第几个元素
    public void remove(int i){

      Node node=first;
      i=i-1;
      if(total>0){
          if(i>=0&&i<total)
          {
              if(i==0){
                  first=first.next;//删除第一个元素
              }
              else if(i==total-1){
                  for (int j = 0; j <total-1 ; j++) {//删除最后一个元素
                      node=node.next;
                  }
                  node.next=null;
              }
              else{
                  for (int j = 0; j <i-1 ; j++) {//删除中间元素
                      node=node.next;
                  }
                  node.next=node.next.next;
              }
          }
      }
      total--;
    }

    */
    //第二种删除通过寻找要删除的数据

    public void remove(Object obj){

        Node node1=first;
        int i;
        for ( i = 0; i <total ; i++) {
            if(node1.data==obj){
                break;
            }
            node1=node1.next;
        }
        System.out.println(i);
       Node node=first;

        if(total>0){
            if(i>=0&&i<total)
            {
                if(i==0){
                    first=first.next;//删除第一个元素
                }
                else if(i==total-1){
                    for (int j = 0; j <total-1 ; j++) {//删除最后一个元素
                        node=node.next;
                    }
                    node.next=null;
                }
                else{
                    for (int j = 0; j <i-1 ; j++) {//删除中间元素
                        node=node.next;
                    }
                    node.next=node.next.next;
                }
            }
        }
        total--;
    }








  //打印
    public Object getAll(){
      Object[] all=new Object[total];

      Node node=first;
        for (int i = 0; i <total ; i++) {
            all[i]=node.data;
            node=node.next;
        }
      return all;
    }

}
